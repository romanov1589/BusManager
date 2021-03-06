package com.romanov.BusManager.repository;

import com.romanov.BusManager.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    Ticket findTicketByTicketId(Integer id);
}
