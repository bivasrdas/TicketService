package com.example.TicketService.Controller;

import com.example.TicketService.Entity.Seat;
import com.example.TicketService.Service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController {

    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/getAllSeat")
    public List<Seat> getAllSeat() {
        return seatService.getAllSeat();
    }
}
