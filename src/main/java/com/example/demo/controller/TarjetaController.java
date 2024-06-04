package com.example.demo.controller;

import com.example.demo.service.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tarjeta")
public class TarjetaController {

    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping("/")
    public String home() {
        return "Bienvenido a la API de Tarjetas!";
    }

    @GetMapping("/tasa")
    public ResponseEntity<Double> obtenerTasa(@RequestParam String marca, @RequestParam double importe) {
        try {
            double tasa = tarjetaService.calcularTasa(marca, importe);
            return ResponseEntity.ok(tasa);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
