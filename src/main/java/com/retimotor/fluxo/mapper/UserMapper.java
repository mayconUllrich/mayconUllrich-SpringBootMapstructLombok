package com.retimotor.fluxo.mapper;

import org.mapstruct.Mapper;

import com.retimotor.fluxo.dto.UserDto;
import com.retimotor.fluxo.entity.UserEntity;


@Mapper(componentModel = "spring")
public interface UserMapper {
	
    UserDto entityToDto(UserEntity userEntity);
    
    UserEntity dtoToEntity(UserDto dto);
}
