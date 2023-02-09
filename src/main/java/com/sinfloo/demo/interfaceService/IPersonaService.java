package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.sinfloo.demo.modelo.Persona;



public interface IPersonaService {
	
	
	//METODOS PARA EL CRUD
	public List<Persona> listar();
	public Optional<Persona> listarId(int id);
	public int save(Persona p);
	public void delete(int id);

}
