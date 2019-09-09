package controller;

import java.util.List;

import dao.EntradaDAO;
import model.Entrada;

public class EntradaBean {
	public List<Entrada> obtenerEntradas(){
		
		EntradaDAO entradaDAO = new EntradaDAO();		
		return entradaDAO.obtenerEntradas();
	}

}
