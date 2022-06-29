package com.example.TicketService.Service;

import com.example.TicketService.Entity.CoachType;
import com.example.TicketService.Repository.CoachTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachTypeService {
    private final CoachTypeRepository coachTypeRepository;

    public CoachTypeService(CoachTypeRepository coachTypeRepository) {
        this.coachTypeRepository = coachTypeRepository;
    }

    public List<CoachType> getAllCoachType() {
        return coachTypeRepository.findAll();
    }
}
