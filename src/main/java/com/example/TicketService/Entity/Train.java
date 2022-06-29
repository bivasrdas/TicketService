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
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainId;

    @Column(nullable = false)
    private String trainName;

    @Column(nullable = false,unique = true)
    private int trainNumber;

    @Column(nullable = false)
    @JsonFormat(pattern = "HH:mm:ss")
    private Time departureTime;

    @Column(nullable = false)
    @JsonFormat(pattern = "HH:mm:ss")
    private Time arrivalTime;

    @Column(nullable = false)
    private int departureStationId;

    @Column(nullable = false)
    private int arrivalStationId;






}
