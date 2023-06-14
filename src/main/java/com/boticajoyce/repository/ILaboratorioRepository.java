package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boticajoyce.entity.LaboratorioEntity;

@Repository
public interface ILaboratorioRepository extends JpaRepository<LaboratorioEntity, Integer> {

}
