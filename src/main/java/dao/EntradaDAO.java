package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Entrada;
import model.JPAUtil;

public class EntradaDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar Entrada de Productos
	public void guardarEntrada(Entrada entrada) {
		entity.getTransaction().begin();
		entity.persist(entrada);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Editar Entrada de Productos
	public void editarEntrada(Entrada entrada) {
		entity.getTransaction().begin();
		entity.merge(entrada);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}	
	//Buscar Entrada de Productos
	public Entrada buscarEntrada(int id) {
		Entrada e = new Entrada();
		e =entity.find(Entrada.class, id);
		JPAUtil.shutdown();
		return e;
	}
	//Obtener todas las Entradas de Productos
	public List<Entrada> obtenerEntradas(){
		List<Entrada> listaEntradas = new ArrayList<>();
		Query q = entity.createQuery("SELECT e FROM Entrada e");//Jql consulta java orientada a objetos
		listaEntradas = q.getResultList();
		return listaEntradas;
	}
}
