package com.aqua.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Document {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOCU_SEQ")
    @SequenceGenerator(sequenceName = "document_seq", allocationSize = 1, name = "DOCU_SEQ")
	Long idInstancia;
	
	String rut;
	
	String sucursal;
	
	String usuarioSucursal;
	
	Integer estadoSucursal;
	
	String usuarioOperaciones;
	
	Integer estadoOperaciones;
	
	Date fechaEnvio;
	
	Date fechaOperaciones;
	
	Date fechaScan;
	
	Integer codSucursal;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codSucursal == null) ? 0 : codSucursal.hashCode());
		result = prime * result + ((estadoOperaciones == null) ? 0 : estadoOperaciones.hashCode());
		result = prime * result + ((estadoSucursal == null) ? 0 : estadoSucursal.hashCode());
		result = prime * result + ((fechaEnvio == null) ? 0 : fechaEnvio.hashCode());
		result = prime * result + ((fechaOperaciones == null) ? 0 : fechaOperaciones.hashCode());
		result = prime * result + ((fechaScan == null) ? 0 : fechaScan.hashCode());
		result = prime * result + ((idInstancia == null) ? 0 : idInstancia.hashCode());
		result = prime * result + ((rut == null) ? 0 : rut.hashCode());
		result = prime * result + ((sucursal == null) ? 0 : sucursal.hashCode());
		result = prime * result + ((usuarioOperaciones == null) ? 0 : usuarioOperaciones.hashCode());
		result = prime * result + ((usuarioSucursal == null) ? 0 : usuarioSucursal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (codSucursal == null) {
			if (other.codSucursal != null)
				return false;
		} else if (!codSucursal.equals(other.codSucursal))
			return false;
		if (estadoOperaciones == null) {
			if (other.estadoOperaciones != null)
				return false;
		} else if (!estadoOperaciones.equals(other.estadoOperaciones))
			return false;
		if (estadoSucursal == null) {
			if (other.estadoSucursal != null)
				return false;
		} else if (!estadoSucursal.equals(other.estadoSucursal))
			return false;
		if (fechaEnvio == null) {
			if (other.fechaEnvio != null)
				return false;
		} else if (!fechaEnvio.equals(other.fechaEnvio))
			return false;
		if (fechaOperaciones == null) {
			if (other.fechaOperaciones != null)
				return false;
		} else if (!fechaOperaciones.equals(other.fechaOperaciones))
			return false;
		if (fechaScan == null) {
			if (other.fechaScan != null)
				return false;
		} else if (!fechaScan.equals(other.fechaScan))
			return false;
		if (idInstancia == null) {
			if (other.idInstancia != null)
				return false;
		} else if (!idInstancia.equals(other.idInstancia))
			return false;
		if (rut == null) {
			if (other.rut != null)
				return false;
		} else if (!rut.equals(other.rut))
			return false;
		if (sucursal == null) {
			if (other.sucursal != null)
				return false;
		} else if (!sucursal.equals(other.sucursal))
			return false;
		if (usuarioOperaciones == null) {
			if (other.usuarioOperaciones != null)
				return false;
		} else if (!usuarioOperaciones.equals(other.usuarioOperaciones))
			return false;
		if (usuarioSucursal == null) {
			if (other.usuarioSucursal != null)
				return false;
		} else if (!usuarioSucursal.equals(other.usuarioSucursal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Document [idInstancia=" + idInstancia + ", rut=" + rut + ", sucursal=" + sucursal + ", usuarioSucursal="
				+ usuarioSucursal + ", estadoSucursal=" + estadoSucursal + ", usuarioOperaciones=" + usuarioOperaciones
				+ ", estadoOperaciones=" + estadoOperaciones + ", fechaEnvio=" + fechaEnvio + ", fechaOperaciones="
				+ fechaOperaciones + ", fechaScan=" + fechaScan + ", codSucursal=" + codSucursal + "]";
	}
	
}
