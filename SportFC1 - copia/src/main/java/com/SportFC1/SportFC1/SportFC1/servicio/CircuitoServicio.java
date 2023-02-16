/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SportFC1.SportFC1.SportFC1.servicio;

import com.SportFC1.SportFC1.SportFC1.modelo.Circuito;
import com.SportFC1.SportFC1.SportFC1.repositorio.CircuitoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marcclamun
 */
@Service
public class CircuitoServicio {
    @Autowired
    private CircuitoRepositorio repositorio;
    
    public List<Circuito>listarCircuito(){
        return repositorio.findAll();
    }
    public void guardarCircuito(Circuito circuito){
        repositorio.save(circuito);
    }
    
    public Circuito obtenerCircuitoporId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarCircuito(Integer id){
        repositorio.deleteById(id);
    }
}
