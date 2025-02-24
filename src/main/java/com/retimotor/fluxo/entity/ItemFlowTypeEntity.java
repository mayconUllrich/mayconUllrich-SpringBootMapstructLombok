package com.retimotor.fluxo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Data;


import lombok.NoArgsConstructor;


@Entity
@Table(name="iten_flow_type")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemFlowTypeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 30, unique = true) 
	private String description;

}
