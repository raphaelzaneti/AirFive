package br.com.five.principal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voo {
	private Aeroporto aeroportoPartida;
	private LocalDate dataPartida;
	private LocalTime horaPartida;
	private Aeroporto aeroportoChegada;
	private LocalDate dataChegada;
	private LocalTime horaChegada;
	private int lotacao;
	private double preco;
	
	
	public Aeroporto getAeroportoPartida() {
		return aeroportoPartida;
	}
	public void setAeroportoPartida(Aeroporto aeroportoPartida) {
		this.aeroportoPartida = aeroportoPartida;
	}
	
	public LocalDate getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(LocalDate dataPartida) {
		this.dataPartida = dataPartida;
	}
	
	public LocalTime getHoraPartida() {
		return horaPartida;
	}
	public void setHoraPartida(LocalTime horaPartida) {
		this.horaPartida = horaPartida;
	}
	
	public Aeroporto getAeroportoChegada() {
		return aeroportoChegada;
	}
	public void setAeroportoChegada(Aeroporto aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}
	
	public LocalDate getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(LocalDate dataChegada) {
		this.dataChegada = dataChegada;
	}
	
	public LocalTime getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(LocalTime horaChegada) {
		this.horaChegada = horaChegada;
	}
	
	public int getLotacao() {
		return lotacao;
	}
	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
		

}
