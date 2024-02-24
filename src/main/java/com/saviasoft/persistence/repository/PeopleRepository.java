package com.saviasoft.persistence.repository;

import com.saviasoft.persistence.entity.PeopleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<PeopleEntity, Integer> {


}
