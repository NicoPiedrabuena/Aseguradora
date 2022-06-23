package ar.edu.unlam.pb2.seguro;

import java.util.HashMap;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosGenerales,SegurosDeVida {
	private HashMap<Persona,TipoDeBeneficiario>beneficiarios;
	private Vivienda vivienda;
	private Boolean robado;
	private Boolean accidente;
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		beneficiarios = new HashMap<Persona,TipoDeBeneficiario>();
		robado =false;
		accidente = false;
	}

	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario beneficiario) {
		beneficiarios.put(persona, beneficiario);
		
	}

	@Override
	public void agregarBienAsegurado(Bien bienAsegurado) {
		vivienda = (Vivienda)bienAsegurado;
	}

	public Integer obtenerCantidadDeBeneficiario() {
		// TODO Auto-generated method stub
		return beneficiarios.size();
	}
	public Vivienda getVivienda() {
		return vivienda;
	}

	@Override
	public Boolean tuvoAlgunAccidente() {
		if(super.getSiniestro().equals(true)) {
			accidente = true;
		}
		return accidente;
	}

	@Override
	public Boolean fueRobado() {
		if(super.getSiniestro().equals(true)) {
			robado = true;
		}
		return robado;
	}

}
