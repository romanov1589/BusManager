package com.romanov.BusManager.repository;


import com.romanov.BusManager.model.TechnicalInspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TechnicalInspectionRepository extends JpaRepository<TechnicalInspection, Integer> {
}
