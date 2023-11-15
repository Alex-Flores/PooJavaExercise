package com.mycompany.poojavaexercise;

public class Cuenta {
    private String nombre;
    private String apellido;
    private String num_cuenta;
    private Double tipo;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String apellido, String num_cuenta, Double tipo, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_cuenta = num_cuenta;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public Double getTipo() {
        return tipo;
    }

    public void setTipo(Double tipo) {
        this.tipo = tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String mensaje(){
        return "Nombre " + this.getNombre();
    }
    
}
