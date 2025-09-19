package com.app.controller;

import com.app.entity.evalution.Agent;
import com.app.entity.evalution.Area;
import com.app.entity.evalution.CustomerVisit;
import com.app.repository.AgentRepository;
import com.app.repository.AreaRepository;
import com.app.repository.CustomerVisitRepository;
import com.app.service.SmsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/crm")
public class CRMController {

    private final AreaRepository areaRepository;
    private final AgentRepository agentRepository;
    private final CustomerVisitRepository customerVisitRepository;
    private final SmsService smsService;

    public CRMController(
            AreaRepository areaRepository,
            AgentRepository agentRepository,
            CustomerVisitRepository customerVisitRepository,
            SmsService smsService
    ) {
        this.areaRepository = areaRepository;
        this.agentRepository = agentRepository;
        this.customerVisitRepository = customerVisitRepository;
        this.smsService = smsService;
    }

    @GetMapping
    public ResponseEntity<List<Area>> searchAgent(@RequestParam int pinCode) {
        List<Area> areas = areaRepository.findByPinCode(pinCode);
        return ResponseEntity.ok(areas);
    }

    @PutMapping
    public ResponseEntity<String> allocateAgent(
            @RequestParam long customerId,
            @RequestParam long agentId
    ) {
        Optional<Agent> opAgent = agentRepository.findById(agentId);
        Optional<CustomerVisit> opCustomerVisit = customerVisitRepository.findById(customerId);

        if (opAgent.isEmpty() || opCustomerVisit.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Customer or Agent not found!");
        }

        Agent agent = opAgent.get();
        CustomerVisit customerVisit = opCustomerVisit.get();

        customerVisit.setAgent(agent);
        customerVisitRepository.save(customerVisit);

        // Send SMS notification
        smsService.sendSms("+917559158836", "Agent " + agent.getName() + " is now allocated.");

        return ResponseEntity.ok("Agent allocated successfully to customer " + customerId);
    }
}
