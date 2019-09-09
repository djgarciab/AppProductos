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
@Table(name = "salidasproducto")
public class Salida {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Autoincremental
	private int salid;
	@Column
	private String prodreferencia;
	@Column
	private String saldocumento;
	@Column
	private String saldetalle;
	@Temporal(TemporalType.TIMESTAMP)
	private Date salfecha;
	@Column
    private int salcantidad;
	@Column
    private float salcosto;
	@Column
    private float saltotal; 
    
    public int getSalid() {
		return salid;
	}
	public void setSalid(int salid) {
		this.salid = salid;
	}
	public String getProdreferencia() {
		return prodreferencia;
	}
	public void setProdreferencia(String prodreferencia) {
		this.prodreferencia = prodreferencia;
	}
	public String getSaldocumento() {
		return saldocumento;
	}
	public void setSaldocumento(String saldocumento) {
		this.saldocumento = saldocumento;
	}
	public String getSaldetalle() {
		return saldetalle;
	}
	public void setSaldetalle(String saldetalle) {
		this.saldetalle = saldetalle;
	}
	public Date getSalfecha() {
		return salfecha;
	}
	public void setSalfecha(Date salfecha) {
		this.salfecha = salfecha;
	}
	public int getSalcantidad() {
		return salcantidad;
	}
	public void setSalcantidad(int salcantidad) {
		this.salcantidad = salcantidad;
	}
	public float getSalcosto() {
		return salcosto;
	}
	public void setSalcosto(float salcosto) {
		this.salcosto = salcosto;
	}
	public float getSaltotal() {
		return saltotal;
	}
	public void setSaltotal(float saltotal) {
		this.saltotal = saltotal;
	}
	@Override
	public String toString() {
		return "Salida [salid=" + salid + ", prodreferencia=" + prodreferencia + ", saldocumento=" + saldocumento
				+ ", saldetalle=" + saldetalle + ", salfecha=" + salfecha + ", salcantidad=" + salcantidad
				+ ", salcosto=" + salcosto + ", saltotal=" + saltotal + "]";
	}
	
	
}
