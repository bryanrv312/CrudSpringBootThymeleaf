package com.sinfloo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaceService.IPersonaService;
import com.sinfloo.demo.interfaces.IPersona;
import com.sinfloo.demo.modelo.Persona;



@Service
public class PersonaService implements IPersonaService{
	
	//para implementar e inyectar, creo una variable data
	@Autowired
	private IPersona data; //se conectara con la DB(REPOSITORY)
	
	
	@Override
	public List<Persona> listar() {
		return (List<Persona>) data.findAll();//findall, retorna la lista de personas
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona = data.save(p); //ACA SE REGISTRA DENTRO DE LA BD
		
		if (!persona.equals(null)) {
			res = 1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}

}
