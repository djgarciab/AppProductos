package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.JPAUtil;
import model.Registro;

public class RegistroDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	//Guardar Registro de Productos en Kardex
	public void guardarRegistro(Registro registro) {
		entity.getTransaction().begin();
		entity.persist(registro);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Editar Registro de Productos en Kardex
	public void editarRegistro(Registro registro) {
		entity.getTransaction().begin();
		entity.merge(registro);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Buscar Registro de Productos en Kardex
	public Registro buscarRegistro(int id) {
		Registro r = new Registro();
		r =entity.find(Registro.class, id);
		JPAUtil.shutdown();
		return r;
	}
	//Obtener todas las Salidas de Productos
	public List<Registro> obtenerRegistros(){
		List<Registro> listaRegistros = new ArrayList<>();
		Query q = entity.createQuery("SELECT r FROM Registro r");//Jql consulta java orientada a objetos
		listaRegistros = q.getResultList();
		return listaRegistros;
	}
}
