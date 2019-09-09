package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.JPAUtil;
import model.Salida;

public class SalidaDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar Salida de Productos
	public void guardarSalida(Salida salida) {
		entity.getTransaction().begin();
		entity.persist(salida);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Editar Salida de Productos
	public void editarSalida(Salida salida) {
		entity.getTransaction().begin();
		entity.merge(salida);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}	
	
	//Buscar Salida de Productos
	public Salida buscarSalida(int id) {
		Salida s = new Salida();
		s =entity.find(Salida.class, id);
		JPAUtil.shutdown();
		return s;
	}
	//Obtener todas las Salidas de Productos
	public List<Salida> obtenerSalidas(){
		List<Salida> listaSalidas = new ArrayList<>();
		Query q = entity.createQuery("SELECT s FROM Salida s");//Jql consulta java orientada a objetos
		listaSalidas = q.getResultList();
		return listaSalidas;
	}
	
	
}
