package com.avbravo.microjakartanosql.model;

import com.avbravo.microjavaxnosql.field.FieldPropertyVisibilityStrategy;
import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;

import java.io.Serializable;
import java.util.Objects;
import javax.json.bind.annotation.JsonbVisibility;

@Entity
@JsonbVisibility(FieldPropertyVisibilityStrategy.class)
public class Persona implements Serializable {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    Pais pais;
    @Column
    Direccion direccion;

    public Persona() {
    }

    public Persona(String name, String id, Pais pais, Direccion direccion) {
        this.name = name;
        this.id = id;
        this.pais = pais;
        this.direccion = direccion;
    }

    
    
//    public Persona(String id, String name) {
//        this.name = name;
//        this.id = id;
//
//    }

    
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Pais getPais() {
        return pais;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona hero = (Persona) o;
        return Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Persona{"
                + "name='" + name + '\''
                + ", id=" + id
                + ", pais=" + pais.toString()
                + ", direccion=" + direccion.toString()
                + '}';
    }
}
