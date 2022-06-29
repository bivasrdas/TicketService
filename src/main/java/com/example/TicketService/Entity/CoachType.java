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
public class CoachType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coachTypeId;

    @Column(nullable = false)
    private String coachTypeName;

    @Column(nullable = false)
    private int coachTypeCapacity;
}
