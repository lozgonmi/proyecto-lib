package com.example.proyectolib.entidades;

import java.time.Instant;


public class Reserva {

	private Instant fechaInicio;
	private Instant fechaFin;

	public Reserva(Instant fechaInicio, Instant fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;

	}

	public Reserva() {

	}

	public Instant getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Instant fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Instant getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Instant fechaFin) {
		this.fechaFin = fechaFin;
	}

}