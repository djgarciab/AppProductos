package controller;

//import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.TipoDAO;
import model.Tipo;

@ManagedBean(name="tipoBean")
@RequestScoped
public class TipoBean {
	
	
	public List<Tipo> obtenerTipos(){
		
		TipoDAO tipoDAO = new TipoDAO();		
		return tipoDAO.obtenerTipos();
	}
	
	public void editarTipo(String id) {
		TipoDAO tipoDAO = new TipoDAO();
		Tipo t = new Tipo();
		t = tipoDAO.buscarTipo(id);
		System.out.println(t);
	}
}
