package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boticajoyce.entity.VentaEntity;

public interface IVentaRepository extends JpaRepository<VentaEntity, Integer> {

}
