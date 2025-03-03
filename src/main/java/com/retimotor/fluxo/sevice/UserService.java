package com.retimotor.fluxo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retimotor.fluxo.dto.UserDto;
import com.retimotor.fluxo.entity.UserEntity;
import com.retimotor.fluxo.mapper.UserMapper;
import com.retimotor.fluxo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;
	
//	public UserService(UserRepository userRepository,UserMapper userMapper) {
//		this.userRepository = userRepository;
//		this.userMapper = userMapper;
//	}
	
	public List<UserDto> listAll(){
		List<UserEntity> userEntities = userRepository.findAll();
		return userEntities.stream().map(userMapper::entityToDto).toList();
	}
	
	public void insert(UserDto userDto ) {
		UserEntity userEntity = userMapper.dtoToEntity(userDto);
		userRepository.save(userEntity);
	}
	
	public UserDto alter(UserDto userDto) {
		UserEntity userEntity = userMapper.dtoToEntity(userDto);
		UserEntity saveUserEntity = userRepository.save(userEntity);
		return userMapper.entityToDto(saveUserEntity);
	}

	public void delete(Long id) {
		UserEntity userEntity = userRepository.findById(id).get();
		userRepository.delete(userEntity);
	}
	
	public UserDto findId(Long Id) {
		return userMapper.entityToDto(userRepository.findById(Id).get());
	}
	
}
