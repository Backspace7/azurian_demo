package com.example.demo.entity.services;

import java.util.List;

import com.example.demo.entity.models.Registros;

public interface IRegistrosService {

		public Registros get(long id);
		public List<Registros> getAll();
		public Registros post(Registros registros);
		public void delete(long id);
		public void put(Registros registros, long id);
}
