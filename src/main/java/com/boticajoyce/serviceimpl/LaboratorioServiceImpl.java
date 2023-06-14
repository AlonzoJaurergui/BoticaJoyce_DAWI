package com.boticajoyce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boticajoyce.entity.LaboratorioEntity;
import com.boticajoyce.repository.ILaboratorioRepository;
import com.boticajoyce.service.ILaboratorioService;

@Service
public class LaboratorioServiceImpl implements ILaboratorioService {

	@Autowired
	ILaboratorioRepository repolab;
	
	@Override
	public List<LaboratorioEntity> getLaboratorios() {
		return repolab.findAll();
	}

}
