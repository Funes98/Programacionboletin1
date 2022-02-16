
public class Persona {
	
	private Integer edad;
	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Double getAltura() {
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public Persona getProgenitor1() {
		return progenitor1;
	}


	public void setProgenitor1(Persona progenitor1) {
		this.progenitor1 = progenitor1;
	}


	public Persona getProgenitor2() {
		return progenitor2;
	}


	public void setProgenitor2(Persona progenitor2) {
		this.progenitor2 = progenitor2;
	}


	private String apellido;
	private String nombre;
	private String dni;
	private Double altura;
	private Double peso;
	
	private Persona progenitor1;
	
	private Persona progenitor2;
	
	
	public boolean equals(Object Hermanos) {
		boolean sonhermanos = false;
		
		Persona convertida = (Persona) Hermanos;
		
		sonhermanos = this.progenitor1.equals(convertida.progenitor1())
				&& this.progenitor2.equalsIgnoreCase(convertida.progenitor2());
		return sonhermanos;
	}
	


}
