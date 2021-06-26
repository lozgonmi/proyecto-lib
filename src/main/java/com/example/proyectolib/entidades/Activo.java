package com.example.proyectolib.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class Activo {

	protected String descripcion;
	private String ubicacion;
	private int telefonoIncidencias;
	protected Collection<Reserva> reservas = new ArrayList<>();

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getTelefonoIncidencias() {
		return telefonoIncidencias;
	}

	public void setTelefonoIncidencias(int telefonoIncidencias) {
		this.telefonoIncidencias = telefonoIncidencias;
	}

	public Collection<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}

}