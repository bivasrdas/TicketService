package com.example.TicketService.Controller;

import com.example.TicketService.Entity.Coach;
import com.example.TicketService.Entity.Train;
import com.example.TicketService.Service.CoachService;
import com.example.TicketService.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {
    final
    CoachService coachService;
    final
    TrainService trainService;

    public CoachController(CoachService coachService, TrainService trainService) {
        this.coachService = coachService;
        this.trainService = trainService;
    }

    @GetMapping("/getAllCoach")
    public List<Coach> getAllCoach() {
        return coachService.getAllCoach();
    }

    @GetMapping("/getCoach/{id}")
    public Coach getCoach(@PathVariable("id") int id) {
        return coachService.getCoach(id);
    }
    @GetMapping("/getCoachByTrainIdAndCoachId/{trainId}/{coachId}")
    public Coach getCoachByTrainIdAndCoachId(@PathVariable("trainId") int trainId,@PathVariable("coachId") int coachId) {
//        return coachService.getCoachByTrainIdAndCoachId(trainId,coachId);
        return null;
    }
    @PostMapping("/createCoach")
    public Coach createCoach(@RequestBody Coach coach) {
        Train train = trainService.getTrain(coach.getTrain().getTrainId());
        coach.setTrain(train);
        return coachService.createCoach(coach);
    }
}