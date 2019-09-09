package controller;

import java.util.List;

import dao.RegistroDAO;
import model.Registro;

public class RegistroBean {

	public List<Registro> obtenerRegistros(){
		
		RegistroDAO registroDAO = new RegistroDAO();		
		return registroDAO.obtenerRegistros();
	}

}
