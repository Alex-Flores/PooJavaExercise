package com.mycompany.jpaschool.persistencia;

import com.mycompany.jpaschool.logica.Alumno;
import com.mycompany.jpaschool.logica.Carrera;
import com.mycompany.jpaschool.logica.Materia;
import com.mycompany.jpaschool.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlladoraPersistence {
    /*
        6° Se encarga de controllar cada una de las intancias de las jpa que tengamos
    */
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();
    
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControlladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        // Casteo List a un ArrayList - este metodo es mejor que el casteo
        List<Alumno> listita = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList (listita);
        return listaAlumnos;
    }
//CARRERA
    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControlladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList(lista);
        return listaCarreras;
    }
//MATERIA
    public void crearMateria(Materia mate) {
        mateJpa.create(mate);
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControlladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public LinkedList<Materia> traerListaMateria() {
        List<Materia> listi = mateJpa.findMateriaEntities();
        LinkedList<Materia> listaMaterias = new LinkedList(listi);
        return listaMaterias;
    }
    
}
