package com.mycompany.poojavaexercise;

import java.util.Scanner;

public class PooJavaExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre, apellido, num_cuenta;
        double tipo;
        int saldo;
        
        Cuenta pago1 = new Cuenta();
        
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese su cuenta: ");
        num_cuenta = sc.nextLine();
        System.out.println("Ingrese su numero de cuenta: (1/0)");
        tipo = sc.nextDouble();
        System.out.println("Ingrese su saldo: ");
        saldo = sc.nextInt();
        
        pago1.setNombre(nombre);
        pago1.setApellido(apellido);
        pago1.setNum_cuenta(num_cuenta);
        pago1.setSaldo(saldo);
        pago1.setTipo(tipo);
        
        System.out.println(pago1.mensaje());
    }
}
