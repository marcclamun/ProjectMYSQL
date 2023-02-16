/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SportFC1.SportFC1.SportFC1.Controller;

import com.SportFC1.SportFC1.SportFC1.modelo.Circuito;
import com.SportFC1.SportFC1.SportFC1.servicio.CircuitoServicio;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marcclamun
 */
@RestController

@RequiredArgsConstructor
public class CircuitoController {

    private final CircuitoServicio circuitoServicio;

    public String home() {
        return "Hello World!";
    }

    @GetMapping("/circuito")
    public List<Circuito> listarCircuito() {
        return circuitoServicio.listarCircuito();
    }

    @GetMapping("/circuito/{id}")
    public ResponseEntity<Circuito> obtenerCircuito(@PathVariable Integer id) {
        try {
            Circuito circuito = circuitoServicio.obtenerCircuitoporId(id);
            return ResponseEntity.ok(circuito);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/circuito")
    public void nuevoCircuito(@RequestBody Circuito circuito) {
        circuitoServicio.guardarCircuito(circuito);
    }

    @PutMapping("/circuito/{id}")
    public ResponseEntity<?> editarUsuario(@RequestBody Circuito circuito, @PathVariable Integer id) {
        try {
            Circuito usuarioExistente = circuitoServicio.obtenerCircuitoporId(id);
            usuarioExistente.setId(circuito.getId());
            usuarioExistente.setCircuitname(circuito.getCircuitname());
            usuarioExistente.setCountryname(circuito.getCountryname());
            circuitoServicio.guardarCircuito(usuarioExistente);
            return new ResponseEntity<Circuito>(circuito, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Circuito>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/circuito/{id}")
    public void borrarUsuario(@PathVariable Integer id) {
        circuitoServicio.eliminarCircuito(id);
    }
}

