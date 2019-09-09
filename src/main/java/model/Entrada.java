package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="entradasproducto")
public class Entrada {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Autoincremental
	private int entid;
	@Column
	private String prodreferencia;
	@Column
	private String entdocumento;
	@Temporal(TemporalType.TIMESTAMP)
	private Date entfecha;
	@Column
	private String entdetalle;
	@Column
	private int entcantidad;
	@Column
	private Float entcosto;
	@Column
	private Float enttotal;
	public int getEntid() {
		return entid;
	}
	public void setEntid(int entid) {
		this.entid = entid;
	}
	public String getProdreferencia() {
		return prodreferencia;
	}
	public void setProdreferencia(String prodreferencia) {
		this.prodreferencia = prodreferencia;
	}
	public String getEntdocumento() {
		return entdocumento;
	}
	public void setEntdocumento(String entdocumento) {
		this.entdocumento = entdocumento;
	}
	public Date getEntfecha() {
		return entfecha;
	}
	public void setEntfecha(Date entfecha) {
		this.entfecha = entfecha;
	}
	public String getEntdetalle() {
		return entdetalle;
	}
	public void setEntdetalle(String entdetalle) {
		this.entdetalle = entdetalle;
	}
	public int getEntcantidad() {
		return entcantidad;
	}
	public void setEntcantidad(int entcantidad) {
		this.entcantidad = entcantidad;
	}
	public Float getEntcosto() {
		return entcosto;
	}
	public void setEntcosto(Float entcosto) {
		this.entcosto = entcosto;
	}
	public Float getEnttotal() {
		return enttotal;
	}
	public void setEnttotal(Float enttotal) {
		this.enttotal = enttotal;
	}
	@Override
	public String toString() {
		return "Entrada [entid=" + entid + ", prodreferencia=" + prodreferencia + ", entdocumento=" + entdocumento
				+ ", entfecha=" + entfecha + ", entdetalle=" + entdetalle + ", entcantidad=" + entcantidad
				+ ", entcosto=" + entcosto + ", enttotal=" + enttotal + "]";
	} 
	

}
