package com.example.TicketService.Service;

import com.example.TicketService.Entity.Station;
import com.example.TicketService.Repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public List<Station> getAllStation() {
        return stationRepository.findAll();
    }

    public Station getStation(int id) {
        return stationRepository.findById(id).get();
    }

    public Station createStation(Station station) {
        return stationRepository.save(station);
    }
}
