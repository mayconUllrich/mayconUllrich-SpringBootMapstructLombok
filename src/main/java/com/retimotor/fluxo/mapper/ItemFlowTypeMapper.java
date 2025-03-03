package com.retimotor.fluxo.mapper;

import org.mapstruct.Mapper;

import com.retimotor.fluxo.dto.ItemFlowTypeDto;
import com.retimotor.fluxo.entity.ItemFlowTypeEntity;


@Mapper(componentModel = "spring")
public interface ItemFlowTypeMapper {
	
	ItemFlowTypeDto toDto(ItemFlowTypeEntity itemFlowTypeEntity);
	
	ItemFlowTypeEntity toEntity(ItemFlowTypeDto itemFlowTypeDto);
}
