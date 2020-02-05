package it.hotel.model;

import java.util.Arrays;

public class Stanza {
	
	private int nStanza;
	private int quantoAPersona;
	private Cliente []cliente=new Cliente[3];
	
	public Stanza(int nStanze, int quantoAPersona,Cliente []cliente) {
		super();
		this.nStanza = nStanze;
		this.quantoAPersona = quantoAPersona;
		this.cliente=cliente;
	}
		
	public Cliente[] getCliente() {
		return cliente;
	}
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	public int getnStanze() {
		return nStanza;
	}
	public void setnStanze(int nStanze) {
		this.nStanza = nStanze;
	}
	public int getQuantoAPersona() {
		return quantoAPersona;
	}
	public void setQuantoAPersona(int quantoAPersona) {
		this.quantoAPersona = quantoAPersona;
	}
	
	public String toString() {
		return Arrays.toString(cliente);
	}

}
