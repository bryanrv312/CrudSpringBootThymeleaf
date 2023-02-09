package com.sinfloo.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.Persona;



//ESTA INTERFACE SE CONECTARA CON LA BD, Y PODREMOS IMPLEMENTARLA EN PersonaService
@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
