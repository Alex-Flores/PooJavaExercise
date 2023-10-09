package com.mycompany.jpaschool.logica;

import com.mycompany.jpaschool.persistencia.ControlladoraPersistence;
import java.util.ArrayList;
import java.util.LinkedList;

public class Controladora {
    /*
        7° Aca tenemos todos los controladores de la persistencia
            Tenemos la posibilidad de acceder a los metodos de la controladora
    */
    ControlladoraPersistence controlPersis = new ControlladoraPersistence();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu); //controladora llama a la controladora de persistencia
    }
    /*
        9° Desde la logica llamamos a la controladoraPersistencia para que busque cual es el metodo JPAController cual es el metodo eliminar
    */
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    //Carrera
    public void crearCarrera(Carrera carre){
        controlPersis.crearCarrera(carre); //controladora llama a la controladora de persistencia
    }
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    }
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    public Carrera traerCarrera(int id){
        return controlPersis.traerCarrera(id);
    }
    public ArrayList<Carrera> traerListaCarreras(){
        return controlPersis.traerListaCarreras();
    }
    //Materia
    public void crearMateria(Materia mate){
        controlPersis.crearMateria(mate); //controladora llama a la controladora de persistencia
    }
    public void eliminarMateria(int id){
        controlPersis.eliminarMateria(id);
    }
    public void editarCarrera(Materia mate){
        controlPersis.editarMateria(mate);
    }
    public Materia traerMateria(int id){
        return controlPersis.traerMateria(id);
    }
    public LinkedList<Materia> traerListaMateria(){
        return controlPersis.traerListaMateria();
    }
}
