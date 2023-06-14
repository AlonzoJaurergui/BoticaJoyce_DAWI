package com.boticajoyce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boticajoyce.entity.CategoriaEntity;
import com.boticajoyce.repository.ICategoriaRepository;
import com.boticajoyce.service.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

	@Autowired
	ICategoriaRepository repocat;
	
	@Override
	public List<CategoriaEntity> getCategorias() {
		return repocat.findAll();
	}

}
