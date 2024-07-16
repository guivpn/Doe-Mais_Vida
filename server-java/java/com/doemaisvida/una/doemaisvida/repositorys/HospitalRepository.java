package com.doemaisvida.una.doemaisvida.repositorys;

import com.doemaisvida.una.doemaisvida.entities.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    List<Hospital> findByCityId(Long cityId);

}
