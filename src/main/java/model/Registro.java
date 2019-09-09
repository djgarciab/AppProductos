package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registroskardex") 
public class Registro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Autoincremento
	private int regid;
	@Column
    private String prodreferencia;
	@Column
    private String entid;
	@Column
    private String salid;
	@Column
    private int regcantidad;
	@Column
    private float regcosto;
	@Column
    private float regtotal;
    
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getProdreferencia() {
		return prodreferencia;
	}
	public void setProdreferencia(String prodreferencia) {
		this.prodreferencia = prodreferencia;
	}
	public String getEntid() {
		return entid;
	}
	public void setEntid(String entid) {
		this.entid = entid;
	}
	public String getSalid() {
		return salid;
	}
	public void setSalid(String salid) {
		this.salid = salid;
	}
	public int getRegcantidad() {
		return regcantidad;
	}
	public void setRegcantidad(int regcantidad) {
		this.regcantidad = regcantidad;
	}
	public float getRegcosto() {
		return regcosto;
	}
	public void setRegcosto(float regcosto) {
		this.regcosto = regcosto;
	}
	public float getRegtotal() {
		return regtotal;
	}
	public void setRegtotal(float regtotal) {
		this.regtotal = regtotal;
	}
	@Override
	public String toString() {
		return "Registro [regid=" + regid + ", prodreferencia=" + prodreferencia + ", entid=" + entid + ", salid="
				+ salid + ", regcantidad=" + regcantidad + ", regcosto=" + regcosto + ", regtotal=" + regtotal + "]";
	}
    
}
