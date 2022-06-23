package ar.edu.unlam.pb2.seguro;

public interface SegurosDeVida {
	void agregarBeneficiario(Persona persona,TipoDeBeneficiario beneficiario);
	public Boolean tuvoAlgunAccidente();
}
