package com.company;

public class OfertaAcademicaFactory {

    public static final String CURSO = "CURSO";
    public static final String PROGRAMA_INTENSIVO = "PROGRAMA_INTENSIVO";
    public static final String TALLER = "TALLER";
    public static final String CARRERA = "CARRERA";


    // singleton
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){};

    public static OfertaAcademicaFactory getInstance() {
        if (instance == null) {
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    // factory
    public OfertaAcademica crearOfertaAcademica(String tipo) {
        switch (tipo) {
            case OfertaAcademicaFactory.CURSO:
                return new Curso();
            case OfertaAcademicaFactory.PROGRAMA_INTENSIVO:
                return new ProgramaIntensivo();
            case OfertaAcademicaFactory.TALLER:
                return new Taller();
            case OfertaAcademicaFactory.CARRERA:
                return new Carrera();
        }
        return null;
    }
}
