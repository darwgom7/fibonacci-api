package com.darwgom.api.service;

import com.darwgom.api.exception.ResourceNotFoundException;
import com.darwgom.api.model.dto.FibonacciDto;

public interface FibonacciService {
	
	FibonacciDto generarFibonacci(FibonacciDto fibonacciDto) throws ResourceNotFoundException;
	
}
