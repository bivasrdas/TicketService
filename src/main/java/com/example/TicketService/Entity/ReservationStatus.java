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
public class ReservationStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationStatusId;

    @Column(nullable = false)
    private String reservationStatusName;

    @Column(nullable = false)
    private String reservedDate;

    @Column(nullable = false)
    private String reservedTime;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Seat.class)
    @JoinColumn(name = "seatId", referencedColumnName = "seatId", nullable = false)
    private Seat seat;
}
