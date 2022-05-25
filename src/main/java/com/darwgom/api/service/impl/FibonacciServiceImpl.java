package com.darwgom.api.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darwgom.api.exception.ResourceNotFoundException;
import com.darwgom.api.model.Fibonacci;
import com.darwgom.api.model.dto.FibonacciDto;
import com.darwgom.api.repository.FibonacciRepository;
import com.darwgom.api.service.FibonacciService;

@Service
public class FibonacciServiceImpl implements FibonacciService {

	@Autowired
	private FibonacciRepository fibonacciRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	private static final String RECURSO_NO_ENCONTRADO = "Resultado no procesado";
	
	@Override
	public FibonacciDto generarFibonacci(FibonacciDto fibonacciDto) throws ResourceNotFoundException {
		String resultadoFibonacci = calcularFibonacci(fibonacciDto.getLongitud());
		if (resultadoFibonacci.isEmpty()) {
			throw new ResourceNotFoundException(RECURSO_NO_ENCONTRADO);
		}
		fibonacciDto.setResultado(resultadoFibonacci);
		return modelMapper.map(fibonacciRepository.save(modelMapper.map(fibonacciDto, Fibonacci.class)), FibonacciDto.class);
	}
	
	public String calcularFibonacci(Long longitud) {
	    Long[] fibonacci = new Long[Math.toIntExact(longitud)];
	    fibonacci[0] = 0L;
	    fibonacci[1] = 1L;
	    String resultadoFibonacci = "";
	    for (int i = 2; i < fibonacci.length; i++) {
	      fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
	    }
	    for (int i = 0; i < fibonacci.length; i++) {
	      if (i < fibonacci.length - 1) {
	        resultadoFibonacci += fibonacci[i] + ", ";
	      } else {
	    	  resultadoFibonacci += fibonacci[i] + "";
	      }
	    }
	    
	    return resultadoFibonacci;
	}

}



