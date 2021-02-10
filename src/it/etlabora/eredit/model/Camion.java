package it.etlabora.eredit.model;

public class Camion extends MezzoTrasporto {

	private int capacitaCarico;

	@Override
	public double calcolaCostoCambioGomme() {
		double costoGommeTmp = super.calcolaCostoCambioGomme() + 120;
		return costoGommeTmp;
	}

	public int getCapacitaCarico() {
		return capacitaCarico;
	}

	public void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}

}
