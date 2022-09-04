package com.epicode.gestioneprenotazioni.utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UtenteService {
	@Autowired
	private UtenteRepository repo;
	
	public void create(Utente utente) {
		repo.save(utente);
		
	}
//	public void prenotazione() {
//		repo.prenotazione();
//	}
	public Utente read(Long id) {
		return repo.findById(id).get();
	}
	public void update(Utente utente) {
		repo.save(utente);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
