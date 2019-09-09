package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.JPAUtil;
import model.Tipo;

public class TipoDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar Tipo de producto
	public void guardarTipo(Tipo tipo) {
		entity.getTransaction().begin();
		entity.persist(tipo);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Editar Tipo de producto
	public void editarTipo(Tipo tipo) {
		entity.getTransaction().begin();
		entity.merge(tipo);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Buscar Tipo de producto
	public Tipo buscarTipo(String id) {
		Tipo t = new Tipo();
		t =entity.find(Tipo.class, id);
		//JPAUtil.shutdown();
		return t;
	}
	//Obtener todos los Tipos de Productos
	public List<Tipo> obtenerTipos(){
		List<Tipo> listaTipos = new ArrayList<>();
		Query q = entity.createQuery("SELECT t FROM Tipo t");//Jql consulta java orientada a objetos
		listaTipos = q.getResultList();
		return listaTipos;
	}
}
