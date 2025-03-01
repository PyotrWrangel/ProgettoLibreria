package Gestione;
import java.util.Scanner;

public class gestoreLibri {
	Scanner sc = new Scanner(System.in); //creiamo lo scanner
	
	public void avvia() {
		int scelta = 0; //inizializziamo la variabile
		
		do {
			System.out.println("1) Aggiungi dipendente");
			System.out.println("2) Elenca i dipendenti");
			System.out.println("3) Cerca i dipendenti");
			System.out.println("4) Elimina un dipendente");
			System.out.println("5) Esci");
			
			try {
				scelta = sc.nextInt();
			} catch (Exception e) {
				System.err.println();
			}
		} while (scelta != 5);
		System.out.println("Arrivederci");
		sc.close();
		
	}
}
