package com.example.TicketService.Controller;

import com.example.TicketService.Entity.Train;
import com.example.TicketService.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/train")
public class TrainController {

    final
    TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("/getTrain/{id}")
    public Train getTrain(@PathVariable("id") int id) {
        return trainService.getTrain(id);
    }

    @GetMapping("/getAllTrain")
    public List<Train> getAllTrain() {
        return trainService.getAllTrain();
    }

    @PostMapping()
    public Train createTrain(@RequestBody Train train) {
        return trainService.createTrain(train);
    }
}
