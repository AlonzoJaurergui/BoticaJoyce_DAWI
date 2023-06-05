package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boticajoyce.entity.CategoriaEntity;

public interface ICategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {

}
