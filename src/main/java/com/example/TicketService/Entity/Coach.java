package com.example.TicketService.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coachId;

    @Column(nullable = false)
    private String coachName;

    @Column(nullable = false)
    private String coachNumber;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Train.class,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "TrainId",referencedColumnName = "trainId",nullable = false)
    private Train train;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = CoachType.class,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "CoachTypeId",referencedColumnName = "coachTypeId",nullable = false)
    private CoachType coachType;


}
