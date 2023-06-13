package com.boticajoyce.service;

import com.boticajoyce.entity.UsuarioEntity;

public interface IUsuarioService {
	UsuarioEntity registrarUsuario(UsuarioEntity bean);
	UsuarioEntity loginUsuario(String username, String password);
}
