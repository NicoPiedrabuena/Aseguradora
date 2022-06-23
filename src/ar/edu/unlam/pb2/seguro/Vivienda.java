package ar.edu.unlam.pb2.seguro;

public class Vivienda extends Bien{

	private String direccion;
	private String localidad;
	private String municipio;
	private String cuidad;

	public Vivienda(String direccion, String localidad, String municipio, String cuidad) {
		this.direccion = direccion;
		this.localidad = localidad;
		this.municipio = municipio;
		this.cuidad = cuidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	

}
