package com.romanov.BusManager.repository;

import com.romanov.BusManager.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestAttribute;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {
}
