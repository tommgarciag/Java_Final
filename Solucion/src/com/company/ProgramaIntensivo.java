package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private Double porcentajeBonificacion;
    private List<OfertaAcademica> cursos;

    public ProgramaIntensivo() {
        this.cursos = new ArrayList<>();
    }

    public void agregar(OfertaAcademica oferta) {
        this.cursos.add(oferta);
    }

    public Double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    @Override
    public Double calcularPrecio() {
        Double total = 0.0;
        for (OfertaAcademica curso : cursos) {
            total += curso.calcularPrecio();
        }
        return total - (total * porcentajeBonificacion / 100.0);
    }
}
