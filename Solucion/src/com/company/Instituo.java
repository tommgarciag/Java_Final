package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituo {
    private String nombre;
    private List<OfertaAcademica> ofertas;

    public Instituo(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();
    }

    public void agregar(OfertaAcademica o) { ofertas.add(o); }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void generarInforme() {
        for (OfertaAcademica oferta : ofertas) {
            System.out.println(oferta.getNombre() + " precio: " + oferta.calcularPrecio());
        }
    }
}
