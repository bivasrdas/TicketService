package com.example.TicketService.Repository;

import com.example.TicketService.Entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Integer> {

    //Coach findCoachByTrainIdAndCoachId(int trainId, int coachId);
}
