package com.example.TicketService.Service;

import com.example.TicketService.Entity.SeatType;
import com.example.TicketService.Repository.SeatTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatTypeService {

    private final SeatTypeRepository seatTypeRepository;

    public SeatTypeService(SeatTypeRepository seatTypeRepository) {
        this.seatTypeRepository = seatTypeRepository;
    }

    public List<SeatType> getAllSeatType() {
        return seatTypeRepository.findAll();
    }

    public SeatType getSeatType(int id) {
        return seatTypeRepository.findById(id).get();
    }

    public SeatType createSeatType(SeatType seatType) {
        return seatTypeRepository.save(seatType);
    }
}
