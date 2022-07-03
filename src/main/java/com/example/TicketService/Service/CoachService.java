package com.example.TicketService.Service;

import com.example.TicketService.Entity.Coach;
import com.example.TicketService.Entity.CoachType;
import com.example.TicketService.Entity.Train;
import com.example.TicketService.Repository.CoachRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachService {

    final CoachRepository coachRepository;
    final TrainService trainService;
    final CoachTypeService coachTypeService;
    public CoachService(CoachRepository coachRepository, TrainService trainService, CoachTypeService coachTypeService) {
        this.coachRepository = coachRepository;
        this.trainService = trainService;
        this.coachTypeService = coachTypeService;
    }

    public Coach getCoach(int id) {
        return coachRepository.findById(id).get();
    }

    public Coach createCoach(Coach coach) {
        Train train = coach.getTrain();
        train=trainService.getTrain(train.getTrainId());
        coach.setTrain(train);
        CoachType coachType = coach.getCoachType();
        coachType=coachTypeService.getCoachType(coachType.getCoachTypeId());
        coach.setCoachType(coachType);
        return coachRepository.save(coach);
    }

    public List<Coach> getAllCoach() {
        return coachRepository.findAll();
    }

//    public Coach getCoachByTrainIdAndCoachId(int trainId, int coachId) {
//        return coachRepository.findCoachByTrainIdAndCoachId(trainId, coachId);
//    }
}
