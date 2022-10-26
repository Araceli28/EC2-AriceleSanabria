package com.idat.edu.service;

import java.util.List;

import com.idat.edu.model.Productos;

public interface ProductoService {
	void guardar(Productos producto);
	void actualizar(Productos producto);
	void eliminar(Integer id);
	List<Productos> listar();
	Productos obtener(Integer id);
}
