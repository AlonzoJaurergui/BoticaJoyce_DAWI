package com.boticajoyce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boticajoyce.entity.ClienteEntity;

@Repository
public interface IClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
