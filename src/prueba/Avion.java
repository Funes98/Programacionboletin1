package prueba;

public class Avion{
	//atributos 
	private String idAvion;
	private Integer Capacidad;
	private integer numVuelos = 0;
	private Double kmvolados= 0;
	private String compannia;
	
	
	// Constructores
	public Avion(String id, Integer Capacidad) {
		this.idAvion = id;
		this.Capacidad = Capacidad;
	}
	public Avion(String id, String Compan,Integer Capacidad) {
		this.idAvion = id;
		this.Compannia = Compannia;
		this.Capacidad = Capacidad;
		}
	//Metodos
	public boolean asignarVuelo(int Capacidad, double km) {
		boolean posibleAsignarVuelo = false;
	}
		if(capacidad <= this.capacidad) {
			this.capacidad-=capacidad;
		return true;
	}
	public int getNumVuelos() {
		return numVuelos;
	}
	public double getTotalKm() {
		return 0.0;
		
	}
	
	public double getMediaKm() {
		return 0.0;
		
	}
	public String getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}
	public Integer getCapacidad() {
		return Capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		Capacidad = capacidad;
	}
	public Double getKmvolados() {
		return kmvolados;
	}
	public void setKmvolados(Double kmvolados) {
		this.kmvolados = kmvolados;
	}
	public String getCompannia() {
		return compannia;
	}
	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
	public void setNumVuelos(integer numVuelos) {
		this.numVuelos = numVuelos;
	}
	
		}
    public String getInformacionAvion() {
    	return "Avion con id: " + getIdAvion()
    	
    }

