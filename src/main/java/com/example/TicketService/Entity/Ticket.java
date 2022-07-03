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
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = ReservationStatus.class)
    @JoinColumn(name = "reservationStatusId", referencedColumnName = "reservationStatusId", nullable = false)
    private ReservationStatus reservationStatus;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Passenger.class)
    @JoinColumn(name = "passengerId", referencedColumnName = "passengerId", nullable = false)
    private Passenger passenger;
}
