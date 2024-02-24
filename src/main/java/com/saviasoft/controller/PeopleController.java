package com.saviasoft.controller;

import com.saviasoft.persistence.entity.PeopleEntity;
import com.saviasoft.persistence.entity.PersonaEntity;
import com.saviasoft.services.PeopleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private  final PeopleService peopleService;
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }
    @GetMapping
    public ResponseEntity<List<PeopleEntity>> getAll(){
        return ResponseEntity.ok(this.peopleService.getAll());
    }
    @PostMapping("/create")
    public ResponseEntity<PeopleEntity> createPeople(@RequestBody PeopleEntity peopleEntity){
        return ResponseEntity.ok(this.peopleService.createPeople(peopleEntity));
    }
    @PutMapping("/update")
    public ResponseEntity<PeopleEntity> updatePeople(@RequestBody PeopleEntity peopleEntity){
        return ResponseEntity.ok(this.peopleService.createPeople(peopleEntity));
    }

    @DeleteMapping("/delete/{idPeople}")
    public void deletePeople(@PathVariable int idPeople){
        this.peopleService.deletePeople(idPeople);
    }
}
