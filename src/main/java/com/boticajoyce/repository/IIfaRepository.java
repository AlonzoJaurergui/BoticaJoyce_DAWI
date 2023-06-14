package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boticajoyce.entity.IfaEntity;

@Repository
public interface IIfaRepository extends JpaRepository<IfaEntity, Integer> {
	
}
