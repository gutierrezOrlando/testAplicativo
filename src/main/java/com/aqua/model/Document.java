package com.aqua.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TNVBPM_ENVIO_DOC_ORIGINAL")
public class Document implements Serializable{

	private static final long serialVersionUID = 2020708757982642484L;

	@Id
	@GeneratedValue
	@Column( name="IDINSTANCIA" )
	Long idInstancia;
	
	@Column( name="RUT" )
	String rut;
	@Column( name="SUCURSAL")
	String sucursal;
	@Column( name="USUARIO_SUCURSAL")
	String usuarioSucursal;
	@Column( name="ESTADO_SUCURSAL")
	Integer estadoSucursal;
	@Column( name="USUARIO_OPERACIONES")
	String usuarioOperaciones;
	@Column( name="ESTADO_OPERACIONES")
	Integer estadoOperaciones;
	@Column( name="FECHA_ENVIO")
	Date fechaEnvio;
	@Column( name="FECHA_OPERACIONES")
	Date fechaOperaciones;
	@Column( name="FECHA_SCAN")
	Date fechaScan;
	@Column( name="COD_SUCURSAL")
	Integer codSucursal;
	
	protected Document() {};
	
	public Document(Long idInstancia,String rut,String sucursal,String usuarioSucursal,Integer estadoSucursal,String usuarioOperaciones,Integer estadoOperaciones,
			Date fechaEnvio,Date fechaOperaciones,Date fechaScan,Integer codSucursal) {
		// TODO Auto-generated constructor stub
		this.idInstancia = idInstancia;
		this.rut = rut;
		this.sucursal = sucursal;
		this.usuarioSucursal = usuarioSucursal;
		this.estadoSucursal = estadoSucursal;
		this.usuarioOperaciones = usuarioOperaciones;
		this.estadoOperaciones = estadoOperaciones;
		this.fechaEnvio = fechaEnvio;
		this.fechaOperaciones = fechaOperaciones;
		this.fechaScan = fechaScan;
		this.codSucursal = codSucursal;
	}

	public Long getIdInstancia() {
		return idInstancia;
	}

	public void setIdInstancia(Long idInstancia) {
		this.idInstancia = idInstancia;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getUsuarioSucursal() {
		return usuarioSucursal;
	}

	public void setUsuarioSucursal(String usuarioSucursal) {
		this.usuarioSucursal = usuarioSucursal;
	}

	public Integer getEstadoSucursal() {
		return estadoSucursal;
	}

	public void setEstadoSucursal(Integer estadoSucursal) {
		this.estadoSucursal = estadoSucursal;
	}

	public String getUsuarioOperaciones() {
		return usuarioOperaciones;
	}

	public void setUsuarioOperaciones(String usuarioOperaciones) {
		this.usuarioOperaciones = usuarioOperaciones;
	}

	public Integer getEstadoOperaciones() {
		return estadoOperaciones;
	}

	public void setEstadoOperaciones(Integer estadoOperaciones) {
		this.estadoOperaciones = estadoOperaciones;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public Date getFechaOperaciones() {
		return fechaOperaciones;
	}

	public void setFechaOperaciones(Date fechaOperaciones) {
		this.fechaOperaciones = fechaOperaciones;
	}

	public Date getFechaScan() {
		return fechaScan;
	}

	public void setFechaScan(Date fechaScan) {
		this.fechaScan = fechaScan;
	}

	public Integer getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(Integer codSucursal) {
		this.codSucursal = codSucursal;
	}

	@Override
	public String toString() {
		return "Document [idInstancia=" + idInstancia + ", rut=" + rut + ", sucursal=" + sucursal + ", usuarioSucursal="
				+ usuarioSucursal + ", estadoSucursal=" + estadoSucursal + ", usuarioOperaciones=" + usuarioOperaciones
				+ ", estadoOperaciones=" + estadoOperaciones + ", fechaEnvio=" + fechaEnvio + ", fechaOperaciones="
				+ fechaOperaciones + ", fechaScan=" + fechaScan + ", codSucursal=" + codSucursal + "]";
	}
	
}
