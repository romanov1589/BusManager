package com.romanov.BusManager.repository;

import com.romanov.BusManager.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
    Route findByRouteId(Integer id);
}
