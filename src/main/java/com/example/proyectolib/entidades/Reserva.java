package com.example.proyectolib.entidades;

import java.time.LocalDateTime;


public class Reserva {

	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;

	public Reserva(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;

	}

	public Reserva() {

	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

}