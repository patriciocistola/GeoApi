package com.example.demo.repositories;

import com.example.demo.models.PartidoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends CrudRepository<PartidoModel, Integer> {
   
   //public abstract PartidoModel findByNropartido(Integer Nropartido);

}
