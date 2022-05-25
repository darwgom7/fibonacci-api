package com.darwgom.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.darwgom.api.service.impl.FibonacciServiceImpl;


@SpringBootTest
class FibonacciApiApplicationTests {
	
	@Autowired
	private FibonacciServiceImpl fibonacciService;
	
	@Test
	void testValidarResultadoFibonacci() {
		assertEquals("0, 1, 1, 2, 3", fibonacciService.calcularFibonacci(5L));
	}

}
