package com.retimotor.fluxo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retimotor.fluxo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
