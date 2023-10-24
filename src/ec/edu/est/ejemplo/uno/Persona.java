package ec.edu.est.ejemplo.uno;

import java.util.Date;

public class Persona {
	// ATRIBUTOS
	private String numeroCedula;
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private double estatura;
	private double peso;
	
	//CONSTRUCTORES
	// no reciben parametos y siempre son publicos
	public Persona() {
		
	}
	
	public Persona(String numeroCedula, String nombre, String apellido) {
		super();
		this.numeroCedula = numeroCedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public Persona(String numeroCedula, String nombre, String apellido, Date fechaNac, double estatura, double peso) {
		this.numeroCedula = numeroCedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.estatura = estatura;
		this.peso = peso;
	}


	//get y setters
	
	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//----------------------------------------------------------------------------------------------------

	public int calcularEdad(Date fechaActual) {
		return 0;
	}
	
	public int calcularIMC () {	
		return 0;
	}
	
	public boolean esMayorDeEdad(int limiteEdad) {	
		return false;
	}
	
	//----------------------------------------------------------------------------------------------------
	
	//metodo to string
	@Override
	public String toString () {
		return "Cedula: "+numeroCedula + " ,Nombre: "+ nombre + " ,Apellido: "+apellido;
	}
 
}
