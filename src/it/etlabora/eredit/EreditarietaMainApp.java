package it.etlabora.eredit;

import it.etlabora.eredit.enums.DirezioneEnum;
import it.etlabora.eredit.enums.TipoMezzoEnum;
import it.etlabora.eredit.model.Camion;

public class EreditarietaMainApp {
	
	public static void main(String[] args) {
		Camion camion = new Camion();
		camion.setVelocitaAttuale(0);
		camion.setModello("IVECO");
		camion.setCostoGomma(100);
		camion.setCapacitaCarico(2000);
		camion.setTipoMezzo(TipoMezzoEnum.FURGONE);
		
//		camion.accelera(10, DirezioneEnum.SUD);
//		camion.accelera(20, DirezioneEnum.NORD);
//		camion.accelera(30);
		
		camion.accelera("SUD", 10, "Blabla qualcosa il tizio davanti va piano");

		
		System.out.println("Il costo per il cambio gomme è "+camion.calcolaCostoCambioGomme());
	}

}
