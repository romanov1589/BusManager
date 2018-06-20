package com.romanov.BusManager.repository;

import com.romanov.BusManager.model.inheritance.Distributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor, Integer> {
}
