package com.retimotor.fluxo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retimotor.fluxo.dto.ItemFlowTypeDto;
import com.retimotor.fluxo.entity.ItemFlowTypeEntity;
import com.retimotor.fluxo.mapper.ItemFlowTypeMapper;
import com.retimotor.fluxo.repository.ItemFlowTypeRepository;


@Service
public class ItemFlowTypeService {

	@Autowired
	private ItemFlowTypeRepository itemFlowTypeRepository;
	
	@Autowired
	private ItemFlowTypeMapper itemFlowTypeMapper;

	public ItemFlowTypeService(ItemFlowTypeRepository itemFlowTypeRepository, ItemFlowTypeMapper itemFlowTypeMapper) {
		this.itemFlowTypeRepository = itemFlowTypeRepository;
		this.itemFlowTypeMapper = itemFlowTypeMapper;
	}
	
	
	public List<ItemFlowTypeDto> listAll() {
		List<ItemFlowTypeEntity> itemFlowTypeEntities = itemFlowTypeRepository.findAll();
		return itemFlowTypeEntities.stream().map(itemFlowTypeMapper::toDto).toList();
	}

	public void insert (ItemFlowTypeDto itemFlowTypeDto) {
		ItemFlowTypeEntity itemFlowTypeEntity = itemFlowTypeMapper.toEntity(itemFlowTypeDto);
		itemFlowTypeRepository.save(itemFlowTypeEntity);
	}
	
	public ItemFlowTypeDto alter(ItemFlowTypeDto itemFlowTypeDto) {
		ItemFlowTypeEntity itemFlowTypeEntity = itemFlowTypeMapper.toEntity(itemFlowTypeDto);
		ItemFlowTypeEntity saveItemFlowTypeEntity = itemFlowTypeRepository.save(itemFlowTypeEntity);
		return itemFlowTypeMapper.toDto(saveItemFlowTypeEntity);
	}
	
	public void delete(long id) {
		ItemFlowTypeEntity itemFlowTypeEntity = itemFlowTypeRepository.findById(id).get();
		itemFlowTypeRepository.delete(itemFlowTypeEntity);
	}

	public ItemFlowTypeDto findId(Long id) {
		return itemFlowTypeMapper.toDto(itemFlowTypeRepository.findById(id).get());
	}
	
	//Retorna uma Lista de itens que contem uma string.
    public List<ItemFlowTypeEntity> filterByDescriptionContains(String description) {
    	return itemFlowTypeRepository.filterByDescriptionContains(description); 
    }
}
