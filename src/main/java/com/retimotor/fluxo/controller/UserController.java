package com.retimotor.fluxo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retimotor.fluxo.dto.UserDto;
import com.retimotor.fluxo.sevice.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController 
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping
	public List<UserDto> listAll(){
		return userService.listAll();
	}
	
	@PostMapping
		public void insert(@RequestBody UserDto userDto) {
		userService.insert(userDto);
	}
	
	@PutMapping
	public UserDto alter(@RequestBody UserDto userDto) {
		UserDto updateUserDto = userService.alter(userDto);
		return updateUserDto;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		userService.delete(id);
		return ResponseEntity.ok().build();
	}
	
}