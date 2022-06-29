package com.example.TicketService.Repository;

import com.example.TicketService.Entity.CoachType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachTypeRepository extends JpaRepository<CoachType, Integer> {
}