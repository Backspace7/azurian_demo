package com.example.demo.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.dao.IRegistrosDao;
import com.example.demo.entity.models.Registros;

@Service
public class RegistrosServiceImpl implements IRegistrosService{

	@Autowired
	private IRegistrosDao registrosDao;
	
	@Override
	public Registros get(long id) {
		return registrosDao.findById(id).get();
	}

	@Override
	public List<Registros> getAll() {
		return (List<Registros>) registrosDao.findAll();
	}


	@Override
	public Registros post(Registros registros) {
		Registros reg = registrosDao.save(registros);
		return reg;
	}

	@Override
	public void delete(long id) {
		registrosDao.deleteById(id);
		
	}

	@Override
	public void put(Registros registros,long id) {
		registrosDao.findById(id).ifPresent((x)->{
			registros.setId(id);
			registrosDao.save(registros);
		});	
		
	}


}
