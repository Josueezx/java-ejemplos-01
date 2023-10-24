package ec.edu.est.ejemplo.uno.test;

import ec.edu.est.ejemplo.uno.Persona;

public class Principal {
	
	public static void main(String[] args) {
		
		Persona juanito;
		
		
		juanito = new Persona();
		
		juanito.setNombre("JUANITO");
		System.out.println(juanito.getNombre());
		
		
		Persona personaUno = new Persona();
		
		personaUno.setNombre("ALIMAÑA");
		
		System.out.println(personaUno.getNombre());
		
		
		
		

		
		personaUno.setNombre("0107004699");
		
		System.out.println(personaUno.getNombre());
		
		personaUno.setNombre("18");
		
		System.out.println(personaUno.getNombre());	
		
		Persona personaDos = new Persona("010101", "Pedro", "Navaja"); 
		
		
		System.out.println(personaDos.getNumeroCedula());
		personaDos.setNumeroCedula("020202");
		System.out.println(personaDos.getNumeroCedula());
		
		System.out.println(personaDos);
		
	
		
		
	}

}
