package com.boticajoyce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boticajoyce.entity.ClienteEntity;
import com.boticajoyce.repository.IClienteRepository;
import com.boticajoyce.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	IClienteRepository repocli;
	
	@Override
	public List<ClienteEntity> getClientesList() {
		return repocli.findAll();
	}

}
