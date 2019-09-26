package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.models.Registros;
import com.example.demo.entity.services.IRegistrosService;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.PATCH,RequestMethod.DELETE}, exposedHeaders="Content-Range,X-Total-Count", allowedHeaders="*")
public class RegistrosController {
		@Autowired
		IRegistrosService registrosService;
		
		@GetMapping("/registros")
		public List<Registros> getAllRegistros(){
			return registrosService.getAll();
		}
		
		@GetMapping("/registros/{id}")
		public Registros getOne(@PathVariable(value = "id") long id){
			return registrosService.get(id);
		}
		
		@PostMapping("/registros")
		public Registros add(@RequestBody Registros registros) {
			Registros reg = registrosService.post(new Registros(registros.getValor(),registros.getNombre()));
			return reg;
		}
		
		@PutMapping("/registros/{id}")
		public Registros update(@RequestBody Registros registros, @PathVariable(value = "id") long id) {
			registrosService.put(registros, id);
			return registrosService.get(id);
		}
		
		@DeleteMapping("/registros/{id}")
		public void update(@PathVariable(value = "id") long id) {
			registrosService.delete(id);
		}
		
}
