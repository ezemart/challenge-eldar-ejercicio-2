package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TarjetaService {

    public double calcularTasa(String marca, double importe) throws Exception {
        LocalDate today = LocalDate.now();
        double tasa;
        switch (marca.toUpperCase()) {
            case "VISA":
                tasa = (double) today.getYear() / today.getMonthValue();
                break;
            case "NARA":
                tasa = today.getDayOfMonth() * 0.5;
                break;
            case "AMEX":
                tasa = today.getMonthValue() * 0.1;
                break;
            default:
                throw new Exception("Marca de tarjeta no soportada");
        }
        return importe * tasa / 100;
    }
}
