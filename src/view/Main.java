package view;

import controller.SemaforoTreinoFormula1;

import java.util.concurrent.Semaphore;

public class Main {
	
		public static void main(String[] args) {

		int permissoesPista = 5;
		Semaphore semaforoPista = new Semaphore(permissoesPista);
	
		for (int numeroEquipe = 1; numeroEquipe <= 7; numeroEquipe++) {
			SemaforoTreinoFormula1 semaforoTreinoFormula1 = new SemaforoTreinoFormula1(numeroEquipe, semaforoPista);
			semaforoTreinoFormula1.start();
    	}
	}
}

