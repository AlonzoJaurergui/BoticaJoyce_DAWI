package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boticajoyce.entity.ProductoEntity;

public interface IProductoRepository extends JpaRepository<ProductoEntity, Integer> {

}
