package com.saviasoft.persistence.repository;

import com.saviasoft.persistence.entity.Mascota;
import com.saviasoft.persistence.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.net.Inet4Address;
import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
    @Query(value="SELECT * FROM saviasoft.pais where estado = 1", nativeQuery=true)
    List<Pais> getPais();






}
