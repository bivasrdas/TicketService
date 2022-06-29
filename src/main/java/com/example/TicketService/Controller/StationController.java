package com.example.TicketService.Controller;

import com.example.TicketService.Entity.Station;
import com.example.TicketService.Service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {
    private final StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/getAllStation")
    public List<Station> getAllStation() {
        return stationService.getAllStation();
    }

    @GetMapping("/getStation/{id}")
    public Station getStation(@PathVariable("id") int id) {
        return stationService.getStation(id);
    }

    @PostMapping("/createStation")
    public Station createStation(@RequestBody Station station) {
        return stationService.createStation(station);
    }

}
