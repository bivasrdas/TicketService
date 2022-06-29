package com.example.TicketService.Service;

import com.example.TicketService.Entity.Coach;
import com.example.TicketService.Repository.CoachRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachService {

    final
    CoachRepository coachRepository;

    public CoachService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    public Coach getCoach(int id) {
        return coachRepository.findById(id).get();
    }

    public Coach createCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public List<Coach> getAllCoach() {
        return coachRepository.findAll();
    }

//    public Coach getCoachByTrainIdAndCoachId(int trainId, int coachId) {
//        return coachRepository.findCoachByTrainIdAndCoachId(trainId, coachId);
//    }
}
