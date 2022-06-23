package ar.edu.unlam.pb2.seguro;

import java.util.HashSet;
import java.util.Set;

public class PolizaDeAuto extends Poliza implements SegurosGenerales{
	private Auto auto;
	private Boolean robado;
	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		
		super(numeroDePoliza,asegurado,sumaAsegurada,prima);
		robado = false;
	}

	@Override
	public void agregarBienAsegurado(Bien bienAsegurado) {
	 auto = (Auto) bienAsegurado;
	 
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public Boolean fueRobado() {
		if(getSiniestro().equals(true)) {
			robado = true;
		}
		return robado;
	}
	

}
