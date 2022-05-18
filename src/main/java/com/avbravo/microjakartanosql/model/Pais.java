package com.avbravo.microjakartanosql.model;


import com.avbravo.microjavaxnosql.field.FieldPropertyVisibilityStrategy;
import com.avbravo.microjavaxnosql.model.Hero;
import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.json.bind.annotation.JsonbVisibility;

@Entity
@JsonbVisibility(FieldPropertyVisibilityStrategy.class)
public class Pais implements Serializable {

//    @Id
    @Column
    private String code;

    @Column
    private String name;

    
    public Pais() {
    }

    public Pais(String code, String name) {
        this.name = name;
        this.code = code;
     
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pais)) {
            return false;
        }
        Pais pais = (Pais) o;
        return Objects.equals(code, pais.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", code=" + code +
                
                '}';
    }
}
