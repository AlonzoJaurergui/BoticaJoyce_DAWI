package com.boticajoyce.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boticajoyce.entity.UsuarioEntity;
import com.boticajoyce.repository.IUsuarioRepository;
import com.boticajoyce.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	@Autowired
	IUsuarioRepository repousu;

	@Override
	public UsuarioEntity registrarUsuario(UsuarioEntity bean) {
		return repousu.save(bean);
	}
}
