package com.avbravo.microjakartanosql.repository;


import com.avbravo.microjakartanosql.model.Pais;
import jakarta.nosql.mapping.Page;
import jakarta.nosql.mapping.Pagination;
import jakarta.nosql.mapping.Repository;

import java.util.stream.Stream;

public interface PaisRepository extends Repository<Pais, String> {

    Stream<Pais> findAll();

    Page<Pais> findAll(Pagination pagination);

    Stream<Pais> findByPowersIn(String powers);

    Stream<Pais> findByAgeGreaterThan(Integer age);

    Stream<Pais> findByAgeLessThan(Integer age);
}
