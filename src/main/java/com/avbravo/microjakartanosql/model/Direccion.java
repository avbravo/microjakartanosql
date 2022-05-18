/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microjakartanosql.model;

import com.avbravo.microjavaxnosql.field.FieldPropertyVisibilityStrategy;
import jakarta.nosql.mapping.Column;

import jakarta.nosql.mapping.Entity;
import java.util.Objects;
import javax.json.bind.annotation.JsonbVisibility;

/**
 *
 * @author avbravo
 */

@Entity
@JsonbVisibility(FieldPropertyVisibilityStrategy.class)
public class Direccion {
    @Column
    private String street;

    @Column
    private String city;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Direccion() {
    }

    public Direccion(String street, String city) {
        this.street = street;
        this.city = city;
    }
    
    
    
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof  Direccion)) {
            return false;
        }
        Direccion direccion = (Direccion) o;
        return Objects.equals(street, direccion.street);
    }
     public int hashCode() {
        return Objects.hashCode(street);
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "street='" + street+ '\'' +
                ", city=" + city+
                
                '}';
    }

}
