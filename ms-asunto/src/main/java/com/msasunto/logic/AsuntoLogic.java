package com.msasunto.logic;

import java.util.List;

import org.aspectj.lang.NoAspectBoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msasunto.entity.Asunto;
import com.msasunto.exception.NoSePuedeEditarExep;
import com.msasunto.repository.AsuntoRepository;
import com.msasunto.request.AsuntoRequest;
import com.msasunto.service.AsuntoService;


@Service
public class AsuntoLogic implements AsuntoService {

	
	@Autowired
	AsuntoRepository repo;
	
	@Override
	public Asunto guardar(AsuntoRequest request) {
		Asunto asunto = new Asunto();
				
		//Objeto extraido mediante un repository

		asunto.setFechaI(request.getFechaI());
		asunto.setFechaF(request.getFechaF());
		asunto.setStatus(request.getStatus());
		asunto.setCliente_id(request.getCliente_id());
		
		repo.save(asunto);
		return asunto;
		
	}

	@Override
	public Asunto editar(AsuntoRequest request) throws NoSePuedeEditarExep{
		Asunto asunto = repo.findById(request.getAsuntoId()).get();
		
		//Objeto extraido mediante un repository
		if(asunto.getStatus().equals("EN CURSO")) {
			asunto.setFechaI(request.getFechaI());
			asunto.setFechaF(request.getFechaF());
			asunto.setStatus(request.getStatus());
			asunto.setCliente_id(request.getCliente_id());
			
			repo.save(asunto);
		}
		else {
			throw new NoSePuedeEditarExep("No se puede editar el asunto");
		}
		
		return asunto;
	}

	@Override
	public Asunto buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Asunto buscarPorNombre(String request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asunto desactivar(String request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrarTodos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
