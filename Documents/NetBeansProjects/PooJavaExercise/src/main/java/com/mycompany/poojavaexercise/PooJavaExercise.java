package com.mycompany.poojavaexercise;

import java.util.Scanner;

public class PooJavaExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //  POO - CONTADOR
        String nombre, apellido, num_cuenta;
        double tipo;
        int saldo;
        int valor;
        
        String titulo, autor;
        int ejemplares;
        
        int num, den;
        
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
        
        // POO - CUENTA
        Contador cuenta = new Contador();
        System.out.println("Ingrese un valor: ");
        valor = sc.nextInt();
        cuenta.setCtd(valor);
        System.out.println(cuenta.incrementar());
        System.out.println(cuenta.decrementar());
        
        // POO - LIBRO
        Libro cliente1 = new Libro();
        
        System.out.println("Ingrese el titulo");
        titulo = sc.nextLine();
        System.out.println("Ingrese el autor");
        autor = sc.nextLine();
        System.out.println("Ingrese la cantidad de ejemplares");
        ejemplares = sc.nextInt();
        
        cliente1.setTitulo(titulo);
        cliente1.setAutor(autor);
        cliente1.setNum_ejemplares(ejemplares);
        cliente1.getNum_ejem_prestados();
        
        System.out.println(cliente1.prestamo());
        System.out.println(cliente1.devolucion());
        System.out.println(cliente1.toString());
        
        // POO - METODOS
        Metodos p1 = new Metodos();
        num=10;
        den=4;
        p1.setDen(den);
        p1.setNum(num);
        System.out.println(p1.suma());
        System.out.println(p1.resta());
        System.out.println(p1.multiplicar());
        System.out.println(p1.dividir());
    }
}
