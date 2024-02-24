package com.saviasoft.services;

import com.saviasoft.persistence.entity.Pais;
import com.saviasoft.persistence.entity.PersonaEntity;
import com.saviasoft.persistence.repository.PaisRepository;
import com.saviasoft.persistence.repository.PersonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;
    private  final PaisRepository paisRepository;
    public PersonaService(PersonaRepository personaRepository, PaisRepository paisRepository) {
        this.personaRepository = personaRepository;
        this.paisRepository = paisRepository;
    }

    public List<PersonaEntity> getAll(){
        Iterable<PersonaEntity> iterable = this.personaRepository.findAll();
        List<PersonaEntity> personas = new ArrayList<>();
        iterable.forEach(personas::add);
        return personas;
    }


    public PersonaEntity getById(int idPersona){
        return  this.personaRepository.findById(idPersona).orElse(null);
    }


    public PersonaEntity createPerson(PersonaEntity personaEntity){
        return this.personaRepository.save(personaEntity);
    }



//    public void deletePerson(int idPerson){
//        this.personaRepository.deleteById(idPerson);
//    }

    public void deletePerson(int idPerson){
        this.personaRepository.deleteById(idPerson);
    }

    public boolean existsPerson(int idPerson){
        return this.personaRepository.existsById(idPerson);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaService.class);
    public List<Pais> getPais(){

        LOGGER.info("services****",this.paisRepository.getPais());

        return this.paisRepository.getPais();
    }


}
