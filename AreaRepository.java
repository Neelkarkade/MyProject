package com.app.repository;

import com.app.entity.evalution.Agent;
import com.app.entity.evalution.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AreaRepository extends JpaRepository<Area, Long> {


    List<Area> findByPinCode(long pinCode);
}