package controller;

import java.util.List;

import dao.SalidaDAO;
import model.Salida;

public class SalidaBean {

	public List<Salida> obtenerSalidas(){
		
		SalidaDAO salidaDAO = new SalidaDAO();		
		return salidaDAO.obtenerSalidas();
	}
}
