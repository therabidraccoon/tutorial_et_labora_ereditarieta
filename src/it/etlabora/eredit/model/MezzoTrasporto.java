package it.etlabora.eredit.model;

import it.etlabora.eredit.enums.DirezioneEnum;
import it.etlabora.eredit.enums.TipoMezzoEnum;

public class MezzoTrasporto {

	private int velocitaAttuale;
	private double costoGomma;
	private String modello;
	private TipoMezzoEnum tipoMezzo;
	
	public int accelera(String direzione, int accelerazione, String messaggio) {
		DirezioneEnum dir = null;
		try {
			dir = DirezioneEnum.valueOf(direzione);
		} catch (Exception e) {
			System.out.println("Ndo stai annando");
		}
		if (dir != null) {
			accelera(accelerazione, dir);
		}
		System.out.println(messaggio);
		return velocitaAttuale;
	}

	public int accelera() {
		return accelera(10, DirezioneEnum.NORD);
	}

	public int accelera(DirezioneEnum direzione) {
		return accelera(10, direzione);
	}

	public int accelera(int accelerazione) {
		return accelera(accelerazione, DirezioneEnum.NORD);
	}

	public int accelera(int accelerazione, DirezioneEnum direzione) {
		velocitaAttuale += accelerazione;
		if (velocitaAttuale > tipoMezzo.getVelocitaMax()) {
			velocitaAttuale = tipoMezzo.getVelocitaMax();
		}
		System.out.println("Il mezzo sta viaggiando a " + velocitaAttuale + " km/h verso " + direzione.name());
		return velocitaAttuale;
	}

	public double calcolaCostoCambioGomme() {
		int numeroGomme = tipoMezzo.getNumeroGomme();
		return (costoGomma * numeroGomme);
	}

	public int getVelocitaAttuale() {
		return velocitaAttuale;
	}

	public void setVelocitaAttuale(int velocitaAttuale) {
		this.velocitaAttuale = velocitaAttuale;
	}

	public double getCostoGomma() {
		return costoGomma;
	}

	public void setCostoGomma(double costoGomma) {
		this.costoGomma = costoGomma;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public TipoMezzoEnum getTipoMezzo() {
		return tipoMezzo;
	}

	public void setTipoMezzo(TipoMezzoEnum tipoMezzo) {
		this.tipoMezzo = tipoMezzo;
	}

}
