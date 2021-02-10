package it.etlabora.eredit.enums;

public enum TipoMezzoEnum {
	MOTO(2, 300),
	TRICICLO(3, 10),
	AUTOMOBILE(4, 200),
	FURGONE(6, 100),
	TIR(10, 80);
	
	private int numeroGomme;
	private int velocitaMax;
	
	private TipoMezzoEnum(int numGomme, int velocitaMax) {
		this.numeroGomme = numGomme;
		this.velocitaMax = velocitaMax;
	}

	public int getNumeroGomme() {
		return numeroGomme;
	}

	public int getVelocitaMax() {
		return velocitaMax;
	}	
}
