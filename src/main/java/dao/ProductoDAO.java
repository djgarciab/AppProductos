package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.JPAUtil;
import model.Producto;


public class ProductoDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar Producto
	public void guardarProducto(Producto producto) {
		entity.getTransaction().begin();
		entity.persist(producto);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Editar Producto
	public void editarProducto(Producto producto) {
		entity.getTransaction().begin();
		entity.merge(producto);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	//Buscar Producto
	public Producto buscarProducto(String id) {
		Producto p = new Producto();
		p =entity.find(Producto.class, id);
		JPAUtil.shutdown();
		return p;
	}
	
	//Obtener todos los Productos
	public List<Producto> obtenerProductos(){
		List<Producto> listaProductos = new ArrayList<>();
		Query q = entity.createQuery("SELECT p FROM Producto p");//Jql consulta java orientada a objetos
		listaProductos = q.getResultList();
		return listaProductos;
	}
}
