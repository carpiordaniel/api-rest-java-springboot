package com.saviasoft.persistence.repository;

import com.saviasoft.persistence.entity.PersonaEntity;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaEntity, Integer> {


}
