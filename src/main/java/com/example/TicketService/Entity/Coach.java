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
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coachId;

    @Column(nullable = false)
    private String coachName;

    @Column(nullable = false)
    private String coachNumber;

    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Train.class,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "trainId",referencedColumnName = "trainId",nullable = false)
    private Train train;

    @OneToOne(fetch = FetchType.EAGER,targetEntity = CoachType.class,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "coachTypeId",referencedColumnName = "coachTypeId",nullable = false)
    private CoachType coachType;
}
