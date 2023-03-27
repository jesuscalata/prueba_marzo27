package com.msasunto.service;

import java.util.List;

import com.msasunto.entity.Asunto;
import com.msasunto.exception.NoSePuedeEditarExep;
import com.msasunto.request.AsuntoRequest;



public interface AsuntoService {

	Asunto guardar(AsuntoRequest request);
	Asunto editar(AsuntoRequest request)throws NoSePuedeEditarExep;
	Asunto buscar(int id);
	Asunto buscarPorNombre(String request);
	Asunto desactivar(String request);
	String eliminar (int id);
	List <Asunto>mostrarTodos();
}
