package com.rafael.projectsendsms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.projectsendsms.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> { 

}
