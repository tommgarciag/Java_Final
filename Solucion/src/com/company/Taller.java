package com.company;

public class Taller extends OfertaAcademica{
    private Integer cantidadTp;
    private Double valor;

    public Taller() {
        this.cantidadTp = 0;
        this.valor = 0.0;
    }

    public Integer getCantidadTp() {
        return cantidadTp;
    }

    public void setCantidadTp(Integer cantidadTp) {
        this.cantidadTp = cantidadTp;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double calcularPrecio() {
        return cantidadTp * valor;
    }
}
