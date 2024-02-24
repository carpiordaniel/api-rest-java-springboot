package com.saviasoft.controller;

import com.saviasoft.persistence.entity.Pais;
import com.saviasoft.persistence.entity.PersonaEntity;
import com.saviasoft.services.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaService personaService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaService.class);
//      LOGGER.info("***",paises);
    public PersonaController(PersonaService personaService) {

        this.personaService = personaService;
    }

//    @GetMapping
//    public ResponseEntity<List<PersonaEntity>> getAll() {
//        List<PersonaEntity> personas = this.personaService.getAll();
//        return ResponseEntity.ok(personas);
//    }

    @GetMapping
    public ResponseEntity<List<PersonaEntity>> getAll(){

        return ResponseEntity.ok(this.personaService.getAll());
    }


    @GetMapping("/{idPersona}")
    public ResponseEntity<PersonaEntity> getById(@PathVariable int idPersona){
        return ResponseEntity.ok(this.personaService.getById(idPersona));
    }

//    @PostMapping("/create")
//    public ResponseEntity<PersonaEntity> createPerson(@RequestBody PersonaEntity personaEntity){
//        return ResponseEntity.ok(this.personaService.createPerson(personaEntity));
//    }

    @PostMapping("/create")
    public ResponseEntity<PersonaEntity> createPerson(@RequestBody PersonaEntity personaEntity){
        return ResponseEntity.ok(this.personaService.createPerson(personaEntity));
    }
    @PutMapping("/update")
    public ResponseEntity<PersonaEntity> updatePerson(@RequestBody PersonaEntity personaEntity){
            return ResponseEntity.ok(this.personaService.createPerson(personaEntity));
    }


    @PutMapping("/updates")
    public ResponseEntity<PersonaEntity> updatesPerson(@RequestBody PersonaEntity personaEntity){
        if( this.personaService.existsPerson(personaEntity.getId()) ){
        return ResponseEntity.ok(this.personaService.createPerson(personaEntity));
        }
        return ResponseEntity.notFound().build();
    }

//    @DeleteMapping("/{idPerson}")
//    public ResponseEntity<Void> deletePerson(@PathVariable int idPerson){
//        if (this.personaService.existsPerson(idPerson)){
//            this.personaService.deletePerson(idPerson);
//            return ResponseEntity.ok().build();
//        }
//        return ResponseEntity.notFound().build();
//    }

    @DeleteMapping("/{idPerson}")
    public ResponseEntity<Void> deletePerson(@PathVariable int idPerson){
        this.personaService.deletePerson(idPerson);
        return ResponseEntity.ok().build();

    }

    @GetMapping("/pais")
    public ResponseEntity<List<Pais>> getPais(){
        List<Pais> paises = this.personaService.getPais();
        LOGGER.info("***",paises);
        return ResponseEntity.ok(paises);

    }



}
