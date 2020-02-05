package it.hotel.model;

public class Hotel {
	
	private Stanza [] stanza=new Stanza[3];
	
	public Hotel(Stanza[] stanza) {
		super();
		this.stanza = stanza;
	}
	public Stanza[] getStanza() {
		return stanza;
	}
	public void setStanza(Stanza[] stanza) {
		this.stanza = stanza;
	}

	public int calcolaContoStanza(Stanza s) {
		int result=0;
		
		for(int i=0;i<s.getCliente().length;i++) {
			result+=s.getCliente()[i].sommaRealeDaPagare();
		}
		return result;
	}

}
