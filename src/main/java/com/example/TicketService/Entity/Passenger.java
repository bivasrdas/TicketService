package com.example.TicketService.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passengerId;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String reservationStatus;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = Seat.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "seatId",referencedColumnName = "seatId",nullable = false)
    private Seat seat;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "userId",referencedColumnName = "userId",nullable = false)
    private User user;
}
