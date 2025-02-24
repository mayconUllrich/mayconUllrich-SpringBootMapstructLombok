package com.retimotor.fluxo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 


@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 40)
	private String name;

	@Column(nullable = false, unique = true, length = 40)	
	private String login;
	
	@Column(nullable = false, length = 20)	
	private String password;
	
	@Column(nullable = false, unique = true)	
	private String email;	
}