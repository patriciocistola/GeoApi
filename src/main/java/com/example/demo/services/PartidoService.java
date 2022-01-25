package com.example.demo.services;

import java.util.ArrayList;
//import java.util.Optional;
import com.example.demo.models.PartidoModel;
import com.example.demo.repositories.PartidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService {
    @Autowired
    PartidoRepository partidoRepository;    

    public ArrayList<PartidoModel> obtenerPartidos() {
       return  (ArrayList<PartidoModel>) partidoRepository.findAll();
    }
   
/*
    public Optional<PartidoModel> obtenerPorId(Integer id){
        return partidoRepository.findById(id);
    }


    public PartidoModel obtenerPorNumero(Integer Nropartido) {
        return partidoRepository.findByNropartido(Nropartido);
    }
*/

/*
 public PartidoModel guardarPartido( PartidoModel partido) {
        return partidoRepository.save(partido);
    }

    public ArrayList<UsuarioModel>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
*/

}
