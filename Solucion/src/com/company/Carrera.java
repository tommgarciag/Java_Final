package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private Double valorBase;
    private List<OfertaAcademica> ofertas;

    public Carrera() {
        this.valorBase = 0.0;
        this.ofertas = new ArrayList<>();
    }

    public void agregar(OfertaAcademica oferta) throws Exception{
        if (oferta instanceof Curso) {
            if (((Curso) oferta).getCargaHorario() > 10) {
                throw new Exception("No se permite el ingreso de materias con menos de 10 horas");
            }
        }
        this.ofertas.add(oferta);
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public Double calcularPrecio() {
        Double total = this.valorBase;
        for (OfertaAcademica oferta : ofertas) {
            total += oferta.calcularPrecio();
        }

        return total;
    }
}
