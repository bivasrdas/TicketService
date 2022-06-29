package com.example.TicketService.Controller;

import com.example.TicketService.Entity.SeatType;
import com.example.TicketService.Service.SeatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seatType")
public class SeatTypeController {

    private final SeatTypeService seatTypeService;

    public SeatTypeController(SeatTypeService seatTypeService) {
        this.seatTypeService = seatTypeService;
    }

    @GetMapping("/getAllSeatType")
    public List<SeatType> getAllSeatType() {
        return seatTypeService.getAllSeatType();
    }

    @GetMapping("/getSeatType/{id}")
    public SeatType getSeatType(@PathVariable("id") int id) {
        return seatTypeService.getSeatType(id);
    }

    @PostMapping("/createSeatType")
    public SeatType createSeatType(@RequestBody SeatType seatType) {
        return seatTypeService.createSeatType(seatType);
    }

}
