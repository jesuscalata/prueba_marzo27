package com.msasunto.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.msasunto.request.ApiErrors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Verbo o metodo no soportado");
		ApiErrors errors = new ApiErrors(mensaje, detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("No se permite el formato de media enviado");
		ApiErrors errors = new ApiErrors(mensaje, detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String mensaje = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Falta una variable en la ruta");
		ApiErrors errors = new ApiErrors(mensaje, detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Falta informacion en el cuerpo (body)");
		ApiErrors errors = new ApiErrors(mensaje, detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String mensaje = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("No coinciden los datos (tipo)");
		ApiErrors errors = new ApiErrors(mensaje, detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("No se puede leer el body");
		ApiErrors errors = new ApiErrors(mensaje, detalles, status, LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@ExceptionHandler(NoSePuedeEditarExep.class)
	public ResponseEntity<Object> handlResponseEntity(NoSePuedeEditarExep ex){
		String mensaje = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("El asunto se encuentra finalizado");
		ApiErrors errors = new ApiErrors(mensaje, detalles, HttpStatus.BAD_REQUEST, LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}


	
}
