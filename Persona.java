package EjercicioDosClaseTres;

public class Persona {

	
	//Objeto
	
	String Persona;
	
	//Atributos
	
	String nombre;
	String apellido;
	int edad;
	int dni;
	
	double peso;
	double altura;
	
	boolean imc;
	boolean mayorDeEdad;
	
	//Metodos
	
	public Persona(String persona, String nombre, String apellido, int edad, int dni) {
		super();
		Persona = persona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;

	}

	public String getPersona() {
		return Persona;
	}

	public void setPersona(String persona) {
		Persona = persona;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	//peso y altura

	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	
	
	//boolean
	

	public boolean isImc() {
		return imc;
	}

	public void setImc(boolean imc) {
		this.imc = imc;
	}
	
	//2

	public boolean isMayorDeEdad() {
		return mayorDeEdad;
	}

	public void setMayorDeEdad(boolean mayorDeEdad) {
		this.mayorDeEdad = mayorDeEdad;
	}

		
	}
	
	
	

	
	

	
	
	

