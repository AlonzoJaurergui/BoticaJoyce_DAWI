package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boticajoyce.entity.RecetaEntity;

public interface IRecetaRepository extends JpaRepository<RecetaEntity, Integer> {

}
