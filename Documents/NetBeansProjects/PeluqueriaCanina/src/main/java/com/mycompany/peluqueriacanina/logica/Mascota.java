package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombre;
    private String raza;
    private String alegico;
    private String atencion_Especial;
    private String observaciones;
    private String color;
    
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String raza, String color, String alegico, String atencion_Especial, String observaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alegico = alegico;
        this.atencion_Especial = atencion_Especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlegico() {
        return alegico;
    }

    public void setAlegico(String alegico) {
        this.alegico = alegico;
    }

    public String getAtencion_Especial() {
        return atencion_Especial;
    }

    public void setAtencion_Especial(String atencion_Especial) {
        this.atencion_Especial = atencion_Especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
    
    
}
