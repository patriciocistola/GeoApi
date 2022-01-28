package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.PartidoModel;
import com.example.demo.services.PartidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
    @Autowired
    PartidoService partidoService;

    @GetMapping()
    public ArrayList<PartidoModel> obtenerPartidos() {
        return partidoService.obtenerPartidos();
    }

    @GetMapping(path = "/{idpartido}")
    public Optional<PartidoModel> obtenerPartidoPorNumero(@PathVariable("idpartido") Integer Nropartido) {
        return this.partidoService.obtenerPorId(Nropartido);
    }

}
