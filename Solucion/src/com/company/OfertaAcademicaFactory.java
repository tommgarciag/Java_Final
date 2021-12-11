package com.company;

public class OfertaAcademicaFactory {

    public static final String CURSO = "CURSO";
    public static final String PROGRAMA_INTENSIVO = "PROGRAMA_INTENSIVO";


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
        }
        return null;
    }
}
