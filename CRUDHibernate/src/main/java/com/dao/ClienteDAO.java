package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Clientes;
import com.general.Metodos;

public class ClienteDAO implements Metodos {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

	EntityManager em = emf.createEntityManager();
	Clientes cliente = null;

	@Override
	public String guardar(Object ob) {
		cliente = (Clientes) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(cliente);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");

		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		cliente = (Clientes) ob;
		Clientes clientedb = em.find(Clientes.class, cliente.getClienteId());
		String r = null;
		em.getTransaction().begin();
		try {
			clientedb.setNombre(cliente.getNombre());
			clientedb.setApellido(cliente.getApellido());
			clientedb.setRfc(cliente.getRfc());
			clientedb.setFechaNac(cliente.getFechaNac());
			clientedb.setStatus(cliente.getStatus());
			em.getTransaction().commit();
			System.out.println("Estado correctamente");
			r = "1";

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();

		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		cliente = em.find(Clientes.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Estado correctamente");
			r = "1";

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();

		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		cliente = em.find(Clientes.class, id);
		return cliente;
	}

	@Override
	public List mostrar() {
		List<Clientes> ls = em.createQuery("from Clientes").getResultList();
		return ls;
	}

}
