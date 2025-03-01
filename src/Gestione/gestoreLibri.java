package Gestione;
import java.util.ArrayList;
import java.util.Scanner;

public class gestoreLibri {
	Scanner sc = new Scanner(System.in); //creiamo lo scanner
	ArrayList<libri> Libri = new ArrayList<libri>();
	
	public void aggiungiLibro() {
	System.out.println("Inserisci la matricola");
	String matricola = sc.nextLine(); 
	System.out.println("Inserisci il titolo");
	String titolo = sc.nextLine();
	System.out.println("Inserisci l'autore");
	String autore = sc.nextLine();
	System.out.println("Inserisci l'editore");
	String editore = sc.nextLine();
	System.out.println("Inserisci l'anno di pubblicazione");
	int annoPubblicazione = sc.nextInt();
	sc.nextLine();
	
	libri nuovoLibro = new libri();		//creato nuovo oggetto per i libri nuovi
	nuovoLibro.setMatricola(matricola);
	nuovoLibro.setTitolo(titolo);
	nuovoLibro.setAutore(autore);
	nuovoLibro.setEditore(editore);
	nuovoLibro.setAnnoPubblicazione(annoPubblicazione);
	
	Libri.add(nuovoLibro);	// aggiungiamo l'oggetto nuovo libro all'array libri
	System.out.println("Libro aggiunto");
	}
	
	public void avvia() {
		int scelta = 0; //inizializziamo la variabile
		
		do {
			System.out.println("1) Aggiungi un libro");
			System.out.println("2) Visualizza elenco libri");
			System.out.println("3) cerca libro");
			System.out.println("4) Elimina libro");
			System.out.println("5) Esci");
			
			try {
				scelta = sc.nextInt();
				sc.nextLine();
				
				switch (scelta) {
				case 1: 
					aggiungiLibro();
					break;
				case 2:
					if (Libri.size() == 0) {
						System.out.println("Non hai aggiunto nessun libro, vuoi aggiungerne uno?");
						String risposta = sc.nextLine().toLowerCase();
						if (risposta.equals("si")) {
							aggiungiLibro();
							} 
							else if (risposta.equals("no")) {
								break;
							}
						} else {
					System.out.println("Ecco la lista dei libri: ");
					int numeroLibri = Libri.size(); // prendiamo la lunghezza dell'arrayList
					for (libri libro : Libri) { //ciclo per contare e visualizzare i libri nell'arrayList
						System.out.println("Matricola: " + libro.getMatricola() + " Titolo: " + libro.getTitolo() + " Autore: " + libro.getAutore() + " Editore: " + libro.getEditore() + "Anno di pubblicazione: " + libro.getAnnoPubblicazione());
					}
						}
					System.out.println("In totale hai: " + Libri.size() + " libri" );
			break;
						
					}
					
				}
				catch (Exception e) {
				System.err.println();
			}
		} while (scelta != 5);
		System.out.println("Arrivederci");
		sc.close();
		
	}
}
