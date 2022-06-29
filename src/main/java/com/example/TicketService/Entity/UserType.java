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
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId;

    @Column(nullable = false)
    private String userTypeName;

    @Column(nullable = false)
    private String userTypeDescription;

}
