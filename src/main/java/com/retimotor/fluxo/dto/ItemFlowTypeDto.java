package com.retimotor.fluxo.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@SuppressWarnings("unused")
public class ItemFlowTypeDto {
	
	private Long id;
	private String description;
	
}
