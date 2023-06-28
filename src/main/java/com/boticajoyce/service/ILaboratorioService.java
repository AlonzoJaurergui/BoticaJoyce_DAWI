package com.boticajoyce.service;

import java.util.List;

import com.boticajoyce.entity.LaboratorioEntity;

public interface ILaboratorioService {
	List<LaboratorioEntity> getLaboratorios();
	LaboratorioEntity saveLab(LaboratorioEntity bean);
}
