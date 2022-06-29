package com.example.TicketService.Controller;

import com.example.TicketService.Entity.Seat;
import com.example.TicketService.Service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getSeat/{id}")
    public Seat getSeat(@PathVariable("id") int id) {
        return seatService.getSeat(id);
    }

    @PostMapping("/createSeat")
    public Seat createSeat(@RequestBody Seat seat) {
        return seatService.createSeat(seat);
    }
}
