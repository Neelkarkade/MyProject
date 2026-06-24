package assistant;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AssistantController {

    // 1. Smart Planner API
    @GetMapping("/plan")
    public String planDay(@RequestParam String input) {

        input = input.toLowerCase();

        if (input.contains("meeting") && input.contains("coding")) {
            return " Start with coding (high focus), then attend your meeting. Take short breaks to stay productive.";
        } else if (input.contains("deadline")) {
            return " Focus on tasks with deadlines first. Avoid distractions and complete priority work.";
        } else if (input.contains("tired")) {
            return " You seem tired. Take a short break, hydrate yourself, and resume with lighter tasks.";
        } else if (input.contains("meeting")) {
            return " Prepare key points before your meeting and keep notes ready.";
        } else if (input.contains("coding")) {
            return " Focus on coding first while your mind is fresh.";
        } else {
            return " Plan your day by prioritizing important tasks first and staying consistent.";
        }
    }

    // 2. Health Assistant API
    @GetMapping("/health")
    public String health(@RequestParam String input) {

        input = input.toLowerCase();

        if (input.contains("headache")) {
            return " Take rest, drink water, and avoid screens for some time.";
        } else if (input.contains("stress")) {
            return " Try deep breathing or take a short walk to reduce stress.";
        } else if (input.contains("tired")) {
            return " Get proper rest and stay hydrated.";
        } else {
            return " You are doing great! Stay healthy and active.";
        }
    }

    @GetMapping("/ai")
    public String askAI(@RequestParam String input) {

        input = input.toLowerCase();

        if (input.contains("plan my day")) {
            return " Smart Plan: Start with high-focus work (coding/study), then handle meetings, and finish with lighter tasks. Take breaks in between.";
        } else if (input.contains("tired")) {
            return " Suggestion: Take a break, drink water, and resume with low-effort tasks.";
        } else if (input.contains("study")) {
            return " Study Plan: Begin with difficult topics first, then revise easier ones.";
        } else if (input.contains("work")) {
            return " Work Strategy: Prioritize important tasks first and minimize distractions.";
        } else if (input.contains("meeting")) {
            return " Meeting Tip: Prepare an agenda and keep your points ready.";
        } else if (input.contains("productivity")) {
            return " Productivity Tip: Use focused work sessions (Pomodoro technique) and avoid multitasking.";
        } else {
            return " AI Suggestion: Focus on high-priority tasks, stay consistent, and maintain work-life balance.";
        }
    }
}