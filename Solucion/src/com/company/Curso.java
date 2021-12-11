package com.company;

public class Curso extends OfertaAcademica{
    private Double cargaHorario;
    private Double mesesDuracion;
    private Double precioHora;

    public Curso() {
        this.precioHora = 0.0;
        this.mesesDuracion = 0.0;
        this.cargaHorario = 0.0;
    }

    public Double getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(Double cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public Double getMesesDuracion() {
        return mesesDuracion;
    }

    public void setMesesDuracion(Double mesesDuracion) {
        this.mesesDuracion = mesesDuracion;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public Double calcularPrecio() {
        return cargaHorario * mesesDuracion * precioHora;
    }
}
