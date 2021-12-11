package com.company;

public class Main {

    public static void main(String[] args) {

        OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica(OfertaAcademicaFactory.CURSO);
        frontEnd.setNombre("Front End");
        frontEnd.setDescripcion("Curso Angular");
        ((Curso) frontEnd).setCargaHorario(16.0);
        ((Curso) frontEnd).setMesesDuracion(2.0);
        ((Curso) frontEnd).setPrecioHora(1000.0);

        OfertaAcademica backEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica(OfertaAcademicaFactory.CURSO);
        backEnd.setNombre("Back End");
        backEnd.setDescripcion("Curso Java");
        ((Curso) backEnd).setCargaHorario(20.0);
        ((Curso) backEnd).setMesesDuracion(2.0);
        ((Curso) backEnd).setPrecioHora(900.0);

        OfertaAcademica fullStack = OfertaAcademicaFactory.getInstance().crearOfertaAcademica(OfertaAcademicaFactory.PROGRAMA_INTENSIVO);
        fullStack.setNombre("Full Stack");
        fullStack.setDescripcion("Curso Java, SQL y Angular");
        ((ProgramaIntensivo) fullStack).setPorcentajeBonificacion(20.0);
        ((ProgramaIntensivo) fullStack).agregar(frontEnd);
        ((ProgramaIntensivo) fullStack).agregar(backEnd);

        OfertaAcademica tallerMetodologias = OfertaAcademicaFactory.getInstance().crearOfertaAcademica(OfertaAcademicaFactory.TALLER);
        tallerMetodologias.setNombre("Taller Metodologias Agiles");
        tallerMetodologias.setDescripcion("Kanban, Scrum");
        ((Taller) tallerMetodologias).setCantidadTp(3);
        ((Taller) tallerMetodologias).setValor(1000.0);

        OfertaAcademica ctd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica(OfertaAcademicaFactory.CARRERA);
        ctd.setNombre("Certified Tech Developer");
        ctd.setDescripcion("Fullstack y metodologias agiles");
        ((Carrera) ctd).setValorBase(10000.0);

        try {
            ((Carrera) ctd).agregar(fullStack);
            ((Carrera) ctd).agregar(tallerMetodologias);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Instituo digitalHouse = new Instituo("Digital House");
        digitalHouse.agregar(ctd);


        digitalHouse.generarInforme();


    }
}
