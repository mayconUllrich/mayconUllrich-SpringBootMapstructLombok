package com.retimotor.fluxo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor

@SuppressWarnings("unused")
public class UserDto {

	private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("login")
	private String login;
	@JsonProperty("password")
	private String password;
	@JsonProperty("email")	
	private String email;
}
