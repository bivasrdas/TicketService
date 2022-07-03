package com.example.TicketService.Repository;

import com.example.TicketService.Entity.CoachType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachTypeRepository extends JpaRepository<CoachType, Integer> {
}