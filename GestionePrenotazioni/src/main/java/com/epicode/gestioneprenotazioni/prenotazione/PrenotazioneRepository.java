package com.epicode.gestioneprenotazioni.prenotazione;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long>{

}
