package com.avbravo.microjakartanosql.repository;


import com.avbravo.microjakartanosql.model.Pais;
import com.avbravo.microjakartanosql.model.Persona;
import jakarta.nosql.mapping.Page;
import jakarta.nosql.mapping.Pagination;
import jakarta.nosql.mapping.Param;
import jakarta.nosql.mapping.Query;
import jakarta.nosql.mapping.Repository;

import java.util.stream.Stream;

public interface PersonaRepository extends Repository<Persona, String> {

    Stream<Persona> findAll();

    Page<Persona> findAll(Pagination pagination);

    Stream<Persona> findByPowersIn(String powers);
    Stream<Persona> findByPaisIn(Pais pais);
    //Busca en el documento embebido
    @Query("select * from Persona where pais.code = @code")
    Stream<Persona> findByPaisIn(@Param("code") String code);

    Stream<Persona> findByAgeGreaterThan(Integer age);

    Stream<Persona> findByAgeLessThan(Integer age);
}
