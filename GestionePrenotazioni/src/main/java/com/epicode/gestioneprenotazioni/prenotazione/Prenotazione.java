package com.epicode.gestioneprenotazioni.prenotazione;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



import com.epicode.gestioneprenotazioni.postazione.Postazione;
import com.epicode.gestioneprenotazioni.utente.Utente;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Prenotazione {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate giornoPrenotazione;
	@ManyToOne
	private Postazione postazione;
	@ManyToOne
	private Utente utente;
	public Prenotazione(LocalDate giornoPrenotazione, Postazione postazione, Utente utente) {
		super();
		this.giornoPrenotazione = giornoPrenotazione;
		this.postazione = postazione;
		this.utente = utente;
	}
}
