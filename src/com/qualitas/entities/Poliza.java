package com.qualitas.entities;

import java.time.LocalDate;

public class Poliza {
	
	private int numero;
	private LocalDate inicio_vigencia;
	private LocalDate fin_vigencia;
	
	public Poliza(int numero,LocalDate inicio_vigencia,LocalDate fin_vigencia){	
		this.numero=numero;
		this.inicio_vigencia=inicio_vigencia;
		this.fin_vigencia=fin_vigencia;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getInicio_vigencia() {
		return inicio_vigencia;
	}
	public void setInicio_vigencia(LocalDate inicio_vigencia) {
		this.inicio_vigencia = inicio_vigencia;
	}
	public LocalDate getFin_vigencia() {
		return fin_vigencia;
	}
	public void setFin_vigencia(LocalDate fin_vigencia) {
		this.fin_vigencia = fin_vigencia;
	}	
	public String toString(){
		return ("Num = " +getNumero());
	}

}
