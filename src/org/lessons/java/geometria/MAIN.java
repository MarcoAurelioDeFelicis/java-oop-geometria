package org.lessons.java.geometria;

import java.util.Scanner;

public class MAIN {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci la base del rettangolo: ");
		int base  = scan.nextInt();
		
		
		System.out.println("Inserisci l'altezza del rettangolo: ");
		int altezza = scan.nextInt();
		
		RettangoloClass rettangolo = new RettangoloClass (base, altezza);
		
		rettangolo.stampaBaseAltezza();
		
		rettangolo.stampaAreaPerimetro();
		
		rettangolo.stampaRettangolo();
		//rettangolo.stampaAreaPerimetro;

	}
	
}
