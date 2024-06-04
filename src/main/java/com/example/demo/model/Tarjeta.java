package com.example.demo.model;

import java.time.LocalDate;

public class Tarjeta {
    private String marca;
    private String numero;
    private String cardholder;
    private LocalDate fechaVencimiento;

    public Tarjeta(String marca, String numero, String cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numero = numero;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "marca='" + marca +"  "+
                ", numero='" + numero + " " +
                ", cardholder='" + cardholder + " " +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}