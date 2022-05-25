package com.darwgom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darwgom.api.model.Fibonacci;

public interface FibonacciRepository extends JpaRepository<Fibonacci, Long> {
	
}
