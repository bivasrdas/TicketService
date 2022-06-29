package com.example.TicketService.Controller;

import com.example.TicketService.Entity.CoachType;
import com.example.TicketService.Service.CoachTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getCoachType/{id}")
    public CoachType getCoachType(@PathVariable("id") int id) {
        return coachTypeService.getCoachType(id);
    }

    @PostMapping("/createCoachType")
    public CoachType createCoachType(@RequestBody CoachType coachType) {
        return coachTypeService.createCoachType(coachType);
    }
}
