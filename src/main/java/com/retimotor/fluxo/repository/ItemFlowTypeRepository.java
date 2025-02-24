package com.retimotor.fluxo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.retimotor.fluxo.entity.ItemFlowTypeEntity;

public interface ItemFlowTypeRepository extends JpaRepository<ItemFlowTypeEntity, Long>{

	// Pesquise se contem uma string dentro da descrição
	
	@Query("SELECT i FROM ItemFlowTypeEntity i WHERE LOWER(i.description) LIKE LOWER(CONCAT('%', :description, '%'))")
	List<ItemFlowTypeEntity> filterByDescriptionContains(String description);
	
}
