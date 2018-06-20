package com.romanov.BusManager.repository;

import com.romanov.BusManager.model.inheritance.BusStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusStationRepository extends JpaRepository<BusStation, Integer> {
}
