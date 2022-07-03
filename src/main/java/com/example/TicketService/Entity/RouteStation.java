package com.example.TicketService.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class RouteStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int routeStationId;

    @Column(nullable = false)
    private String routeStationName;

    @Column(nullable = false)
    private String routeStationOrder;

    @Column(nullable = false)
    private float fare;

    @Column(nullable = false)
    @JsonFormat(pattern = "HH:mm:ss")
    private Time time;

    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Route.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "routeId",referencedColumnName = "routeId",nullable = false)
    private Route route;

    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Station.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "stationId",referencedColumnName = "stationId",nullable = false)
    private Station station;
}
