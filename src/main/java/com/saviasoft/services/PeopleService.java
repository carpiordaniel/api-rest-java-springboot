package com.saviasoft.services;

import com.saviasoft.persistence.entity.PeopleEntity;
import com.saviasoft.persistence.entity.PersonaEntity;
import com.saviasoft.persistence.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PeopleService {

    private final PeopleRepository peopleRepository;
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<PeopleEntity> getAll(){
        Iterable<PeopleEntity> iterable = this.peopleRepository.findAll();
        List<PeopleEntity> personas = new ArrayList<>();
        iterable.forEach(personas::add);
        return personas;
    }


    public PeopleEntity createPeople(PeopleEntity peopleEntity){
        return this.peopleRepository.save(peopleEntity);
    }

    public void deletePeople(int idPeople){
        this.peopleRepository.deleteById(idPeople);
    }
}
