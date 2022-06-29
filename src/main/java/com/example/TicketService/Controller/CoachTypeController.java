package com.example.TicketService.Controller;

import com.example.TicketService.Entity.CoachType;
import com.example.TicketService.Service.CoachTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coachType")
public class CoachTypeController {

    private final CoachTypeService coachTypeService;

    public CoachTypeController(CoachTypeService coachTypeService) {
        this.coachTypeService = coachTypeService;
    }

    @GetMapping("/getAllCoachType")
    public List<CoachType> getAllCoachType() {
        return coachTypeService.getAllCoachType();
    }
}
