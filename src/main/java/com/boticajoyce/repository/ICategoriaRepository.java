package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boticajoyce.entity.CategoriaEntity;

@Repository
public interface ICategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {

}
