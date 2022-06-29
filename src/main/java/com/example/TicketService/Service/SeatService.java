package com.example.TicketService.Service;

import com.example.TicketService.Entity.Seat;
import com.example.TicketService.Repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    final
    SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> getAllSeat() {
        return seatRepository.findAll();
    }
}
