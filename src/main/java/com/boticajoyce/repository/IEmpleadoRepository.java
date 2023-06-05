package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boticajoyce.entity.EmpleadoEntity;

@Repository
public interface IEmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer> {

}
