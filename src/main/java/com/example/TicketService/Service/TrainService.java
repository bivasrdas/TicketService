package com.example.TicketService.Service;

import com.example.TicketService.Entity.Train;
import com.example.TicketService.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    final
    TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Train getTrain(int id) {
        return trainRepository.findById(id).get();
    }

    public Train createTrain(Train train) {
        return trainRepository.save(train);
    }

    public List<Train> getAllTrain() {
        return trainRepository.findAll();
    }
}
