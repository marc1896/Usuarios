package com.users.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name="user")
@CrossOrigin
public class User {

	@Id
	@Column
	int id;
	
	@Column
	String nombre;
	
	@Column
	String apellidoPaterno;
	
	@Column
	String apellidoMaterno;
	
	@Column
	String correoElectronico;
	
	@Column
	Long telefono;
	
	@Column
	int edad;
	
	@Column
	boolean status;

	public User() {
	}

	public User(String nombre) {
		this.nombre = nombre;
	}

	public User(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico,
			Long telefono, int edad, boolean status) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.edad = edad;
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + ", edad="
				+ edad + ", status=" + status + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
