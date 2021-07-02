package com.example.proyectolib.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class Usuario {

	private int numeroTelefono;
	private String correo;
	protected Collection<Reserva> reservas = new ArrayList<>();
	protected Collection<Activo> activosUsuario = new ArrayList<>();
	

	public Usuario() {

	}

	public int getNumber() {
		return numeroTelefono;
	}

	public void setNumber(int number) {
		this.numeroTelefono = number;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Collection<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Collection<Activo> getActivosUsuario() {
		return activosUsuario;
	}

	public void setActivosUsuario(Collection<Activo> activosUsuario) {
		this.activosUsuario = activosUsuario;
	}
	

}
