package com.boticajoyce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boticajoyce.entity.IfaEntity;
import com.boticajoyce.repository.IIfaRepository;
import com.boticajoyce.service.IIfaService;

@Service
public class IfaServiceImpl implements IIfaService {

	@Autowired
	IIfaRepository repoifa;
	
	@Override
	public List<IfaEntity> getIfas() {
		return repoifa.findAll();
	}

}
