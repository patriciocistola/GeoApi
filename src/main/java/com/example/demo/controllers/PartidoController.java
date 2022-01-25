package com.example.demo.controllers;

import java.util.ArrayList;


import com.example.demo.models.PartidoModel;
import com.example.demo.services.PartidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
    @Autowired
    PartidoService partidoService;

    @GetMapping()
    public ArrayList<PartidoModel> obtenerPartidos(){
        return partidoService.obtenerPartidos();
    }
/*
    @GetMapping( path = "/{Nropartido}")
    public PartidoModel obtenerPartidoPorNumero(@PathVariable("Nropartido") Integer Nropartido) {
        return this.partidoService.obtenerPorNumero(Nropartido);
    }
*/
    /*
    @GetMapping( path = "/{id}")
    public Optional<PartidoModel> obtenerPartidoPorId(@PathVariable("id") Integer id) {
        return this.partidoService.obtenerPorId(id)
    }
  */  
    
}
