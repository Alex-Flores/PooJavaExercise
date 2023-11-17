package com.mycompany.poojavaexercise;

public class Contador {
    private int ctd;

    public Contador() {
    }

    public Contador(int ctd) {
        this.ctd = ctd;
    }

    public int getCtd() {
        return ctd;
    }

    public void setCtd(int ctd) {
        this.ctd = ctd;
    }
    
    public int incrementar(){
        return this.getCtd() + 1;
    }
    public int decrementar(){
        if((this.getCtd() -1) < 0){
           this.setCtd(0);
           return this.getCtd();
        }else{
            return this.getCtd() -1;
        }
    }
}
