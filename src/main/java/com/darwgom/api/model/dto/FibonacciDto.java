package com.darwgom.api.model.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FibonacciDto implements Serializable {
	
	private Long id;
	
	private Long longitud;
	
	private String resultado;
	
	private static final long serialVersionUID = 1L;
	
}
