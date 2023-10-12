package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Principal;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        /*
            MODELO DE CAPAS
                LA CAPA DE LA PERSISTENCIA - BD
                LA CAPA DE INTERFAZ GTRAFICA DE USUARIO - IGU
                LA CAPA LOGICA, LAS CLASES METODOS NECESARIOS
        */
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
