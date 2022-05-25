package com.darwgom.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.darwgom.api.model.dto.FibonacciDto;
import com.darwgom.api.service.FibonacciService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("api/v1")
public class FibonacciController {
	
	@Autowired
	private FibonacciService fibonacciService;
	
	
	@PostMapping("/fibonacci")
	public FibonacciDto generarFibonacci(@RequestBody FibonacciDto fibonacciDto) {
		return fibonacciService.generarFibonacci(fibonacciDto);
	}
	
}
