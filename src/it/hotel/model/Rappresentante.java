package it.hotel.model;

public class Rappresentante extends Cliente {

	public Rappresentante(String nome, String cognome) {
		super(nome, cognome);
	}

	@Override
	public int sommaRealeDaPagare() {
		return (this.getStanza().getQuantoAPersona()*80)/100;
	}

}
