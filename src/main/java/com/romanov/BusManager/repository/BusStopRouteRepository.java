package com.romanov.BusManager.repository;

import com.romanov.BusManager.model.BusStopRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusStopRouteRepository extends JpaRepository<BusStopRoute, Integer> {
}
