package com.rannael.project.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rannael.project.client.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
