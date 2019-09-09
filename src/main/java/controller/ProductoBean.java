package controller;

import java.util.List;

import dao.ProductoDAO;
import model.Producto;

public class ProductoBean {

	public List<Producto> obtenerProductos(){
		
		ProductoDAO productoDAO = new ProductoDAO();		
		return productoDAO.obtenerProductos();
	}
}
