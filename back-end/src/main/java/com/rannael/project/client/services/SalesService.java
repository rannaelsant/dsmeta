package com.rannael.project.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rannael.project.client.entities.Sale;
import com.rannael.project.client.repositories.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
