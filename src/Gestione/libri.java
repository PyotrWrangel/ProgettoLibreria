package Gestione;

public class libri {	//definiamo i dati di ogni oggetto
	public String matricola;
	public String titolo;
	public String autore;
	public String editore;
	public int annoPubblicazione;

	public libri() {		//creiamo il costruttore
		this.matricola = "";
		this.titolo = "";
		this.autore = "";
		this.editore = "";
		this.annoPubblicazione = 0;
	}
	
	// getter e setter
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getAutore() {
		return this.autore;
	}
	
	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	public String getEditore() {
		return this.editore;
	}
	
	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	
	public int getAnnoPubblicazione() {
		return this.annoPubblicazione;
	}
	
	
	
	
}
