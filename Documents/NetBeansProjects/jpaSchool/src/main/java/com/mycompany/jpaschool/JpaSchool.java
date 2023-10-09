package com.mycompany.jpaschool;

import com.mycompany.jpaschool.logica.Alumno;
import com.mycompany.jpaschool.logica.Carrera;
import com.mycompany.jpaschool.logica.Controladora;
import com.mycompany.jpaschool.logica.Materia;
//import com.mycompany.jpaschool.persistencia.ControlladoraPersistence;
//import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class JpaSchool {

    public static void main(String[] args) {
        /*
        MODELO DE CAPAS
        1° primero creamos paquetes sobre jpaschool usando "Java Package"
            igu
            logica
                3° Alumno - creamos la "Java Class Alumno"
                    Luego usamos los ORM apropiados para cada propiedad
                    Por ultimo agregamos este archivo en xml, en la parte de "add Class"
            persistencia
                2° XML - creamos una archivo xml
                    primero vamos a persistencia, click derecho y buscamos persistence
                    le damos click y elegimso "Pesistence Unit"
                    ahora cambiamos el nombre "schoolJPAPU" y elegimos la base de datos
                4° CONTROLADORES - creamos un archivo persistence, se encarga de guardar los archivos o paquetes(controladores de JPA)
                   Para esto vamos a "other", ahi vamos a "persistence" y por ultimo a "JPA Controller Classes from Entity Classes", solo tenemos que elegir el package persistencia
                   
        
        Annotatios más usadas en JPA
        @Entity: especifica la creación de una entidad. Se coloca al inicio de la definición de una clase.
        @Id: Primery key de la entidad
            @GeneratedValue(strategy=GenerationType.SEQUENCE): Establece que la ID se va a generar de forma automática y secuencial
        @Basic: Para hacer referencia atributos comunes.
        @Temporal: Se usa normalmente en fechas.
            Si se quiere tener en cuenta la hora se utiliza: @Temporal(TemporalType.TIMESTAMP)
            Si solo se tiene en cuenta la fecha(DATE): @Temporal(TemporalType.DATE)
        @OneToMany: indicar una relación unidireccional de 1 a n.
        @OneToOne: indicar una relacion de 1 a 1.
        @ManyToMany: indicar una relación n a n.
        
        */
        
        Controladora control = new Controladora();
        //Creamos listas de materias y las agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Creacion Carrera
        Carrera carre = new Carrera(1, "Tecnicatura en Programación", listaMaterias);
        //Guardado Carrera en BD
        control.crearCarrera(carre);
        
        //Creacion Materias
        Materia mate1 = new Materia(58, "Progamacion I", "Cuatrimestal", carre);
        Materia mate2 = new Materia(59, "Programacion II", "Cuatrimestal", carre);
        Materia mate3 = new Materia(60, "Programacion Avanzada", "Anual", carre);
        //Guardado Meterias
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        //agregar a la lista las materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        //nivel logico
        carre.setListaMaterias(listaMaterias);
        //nivel BD
        control.editarCarrera(carre);
        
        //Creacion Alumno (con carrera)
        Alumno al2 = new Alumno(21, "Bra", "Buenos Aires", new Date(), carre);
        //Guardamos el alumno en la BD
        control.crearAlumno(al2);
        //vemos el resultado
        System.out.println("-------------------------------");
        System.out.println("---------DATOS ALUMNO----------");
        Alumno alu = control.traerAlumno(21);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
    }
}
