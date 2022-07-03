package com.example.TicketService.Entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatId;

    @Column(nullable = false)
    private String seatNumber;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = Coach.class)
    @JoinColumn(name = "coachId",referencedColumnName = "coachId",nullable = false)
    private Coach coach;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = SeatType.class)
    @JoinColumn(name = "SeatTypeId",referencedColumnName = "seatTypeId",nullable = false)
    private SeatType seatType;

}

