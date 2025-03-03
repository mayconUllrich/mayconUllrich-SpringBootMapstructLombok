package com.retimotor.fluxo.dto;

import java.util.Objects;

public class ItemFlowTypeDto {
	
	private Long id;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemFlowTypeDto other = (ItemFlowTypeDto) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "ItemFlowTypeDto [id=" + id + ", description=" + description + "]";
	}
	public ItemFlowTypeDto() {
		super();
	}
	
}
