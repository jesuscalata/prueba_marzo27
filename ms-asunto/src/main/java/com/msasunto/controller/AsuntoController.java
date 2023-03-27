package com.msasunto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msasunto.entity.Asunto;
import com.msasunto.logic.AsuntoLogic;
import com.msasunto.request.AsuntoRequest;


@RequestMapping("asunto")//define el path o la ruta de este controlador
@RestController //Configura el consumo y respuesta de los endpoint por defaul
public class AsuntoController {
	
	@Autowired
	AsuntoLogic service;
	
	
	//Mostrar   http://localhost:8090/cuenta 	GET
	@GetMapping()
	public ResponseEntity <List<Asunto>> mostrar(){
		List<Asunto> asunto = service.mostrarTodos();
		return new ResponseEntity<List<Asunto>>(asunto, HttpStatus.OK);
	}
	//http://localhost:8090/cuenta/buscar-por-id/30	 GET

	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity <Asunto> buscar(@PathVariable int id){
		Asunto asunto = service.buscar(id);
		return new ResponseEntity <Asunto>(asunto, HttpStatus.OK);
	}
	//http://localhost:8090/cuenta/ 	POST

	@PostMapping("guardar")
	public ResponseEntity <Asunto> guardar(@RequestBody AsuntoRequest request){
		Asunto asunto= service.guardar(request);
		return new ResponseEntity <Asunto>(asunto, HttpStatus.OK );
	}
	//http://localhost:8090/cuenta/	 PUT

	@PutMapping("editar")
	public ResponseEntity <Asunto> editar(@RequestBody AsuntoRequest request){
		Asunto asunto= service.editar(request);
		return new ResponseEntity <Asunto>(asunto, HttpStatus.OK );
	}
	//http://localhost:8090/cuenta/eliminar/30 	DELETE

	@DeleteMapping("eliminar/{id}")
	public ResponseEntity <String> eliminar(@PathVariable int id){
		String response= service.eliminar(id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}

}
