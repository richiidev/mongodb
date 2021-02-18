package com.examen.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.mongodb.model.Cliente;
import com.examen.mongodb.repo.ClienteRepo;

@Service
public class ClienteService {

	@Autowired
	ClienteRepo repo;
	public List<Cliente> getById(String id){
		return this.repo.findById(id);
	}
}
