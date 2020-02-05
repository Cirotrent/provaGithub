package it.hotel.test;

import it.hotel.model.Cliente;
import it.hotel.model.Hotel;
import it.hotel.model.Premio;
import it.hotel.model.Rappresentante;
import it.hotel.model.Stanza;
import it.hotel.model.Turista;

public class TestHotel {

	public static void main(String[] args) {
		
		
		
		Cliente []listaCliente={new Turista("Mario","Rossi"),
				new Premio("Luigi","Bianchi"),
				new Rappresentante("Fabio","Neri")};
		
		Stanza stanza101 = new Stanza(101,200,listaCliente);
		for (int i = 0; i < listaCliente.length; i++) {
			listaCliente[i].setStanza(stanza101);
		}
		
		
		
		Stanza []listaStanza= {new Stanza(3,100,listaCliente),
				new Stanza(4,300,listaCliente),
				new Stanza(5,500,listaCliente)};
		
		Hotel excelsior= new Hotel(new Stanza[]{stanza101});
		
		System.out.println("TOTALE da pagare: "+excelsior.calcolaContoStanza(listaStanza[2])+"\n"+listaStanza[2]);
		
	}

}
