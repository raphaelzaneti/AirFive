package br.com.five.principal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Passsagem {
	
	private Usuario usuario;
	private Voo voo;
	private LocalDate dataViagem;
	private LocalTime horaViagem;
	private double precoFinal;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	public LocalDate getDataViagem() {
		return dataViagem;
	}
	public void setDataViagem(LocalDate dataViagem) {
		this.dataViagem = dataViagem;
	}
	
	public LocalTime getHoraViagem() {
		return horaViagem;
	}
	public void setHoraViagem(LocalTime horaViagem) {
		this.horaViagem = horaViagem;
	}
	
	public double getPreco() {
		return precoFinal;
	}
	public void setPreco(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	

}
