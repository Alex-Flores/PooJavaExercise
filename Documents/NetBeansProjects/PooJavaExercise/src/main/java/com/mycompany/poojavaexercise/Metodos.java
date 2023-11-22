package com.mycompany.poojavaexercise;

public class Metodos {
    private int num;
    private int den;

    public Metodos() {
    }

    public Metodos(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    public int suma(){
        return num + den;
    }
    public int resta(){
        return num - den;
    }
    public int multiplicar(){
        return num * den;
    }
    public double dividir(){
        return num / den;
    }
}
