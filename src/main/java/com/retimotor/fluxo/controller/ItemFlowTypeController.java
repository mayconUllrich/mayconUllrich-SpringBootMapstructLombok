package com.retimotor.fluxo.controller;

import java.util.List;
import java.util.stream.Collectors;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.retimotor.fluxo.dto.ItemFlowTypeDto;
import com.retimotor.fluxo.entity.ItemFlowTypeEntity;
import com.retimotor.fluxo.mapper.ItemFlowTypeMapper;
import com.retimotor.fluxo.sevice.ItemFlowTypeService;

@RestController
@RequestMapping(value = "/itemFlowType")
public class ItemFlowTypeController {
	
	@Autowired
	private ItemFlowTypeService itemFlowTypeService;
	
	@Autowired
    private ItemFlowTypeMapper itemFlowTypeMapper;
	
	@GetMapping
	public List<ItemFlowTypeDto> listAll() {
		return itemFlowTypeService.listAll();
	}
	
	@PostMapping
	public void insert(@RequestBody ItemFlowTypeDto itemFlowTypeDto) {
		itemFlowTypeService.insert(itemFlowTypeDto);
	}

	@PutMapping
	public ItemFlowTypeDto alter(@RequestBody ItemFlowTypeDto itemFlowTypeDto) {
		return itemFlowTypeService.alter(itemFlowTypeDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		itemFlowTypeService.delete(id);
		return ResponseEntity.ok().build();

	}

	@GetMapping("/descriptionContains")
	public List<ItemFlowTypeDto> filterByDescriptionContains(@RequestParam String description) {
	    List<ItemFlowTypeEntity> entities = itemFlowTypeService.filterByDescriptionContains(description);
	    return entities.stream().map(itemFlowTypeMapper::toDto).collect(Collectors.toList());
	}
	
	
//	@GetMapping("/descriptionContains")
//    public List<ItemFlowTypeEntity> filterByDescriptionContains(@RequestParam String description) {
//    	return itemFlowTypeService.filterByDescriptionContains(description);
//    }
}
