package com.examen.mongodb.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.mongodb.model.Cliente;
import com.examen.mongodb.pojo.Response;
import com.examen.mongodb.repo.ClienteRepo;
import com.examen.mongodb.service.ClienteService;

import io.swagger.annotations.Api;


@RestController
@Api(tags = "cliente")
public class ClienteController {

	@Autowired
	private ClienteRepo repository;

	@Autowired
	private ClienteService service;
	
	@GetMapping("/cliente/id")
	public ResponseEntity<Response> getById(@RequestParam String id) {
		try {
			Object response = service.getById(id);
			return new ResponseEntity<Response>(new Response(true, "Success", response), HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<Response>(new Response(false, "Error " + e.getMessage(), null), HttpStatus.OK);
		}
	}
	@PostMapping("/NutriNet/Cliente")
	public ResponseEntity<Response> saveCliente(@RequestBody Cliente cliente) {
		try {
			repository.save(cliente);
			return new ResponseEntity<Response>(new Response(true, "Success", cliente), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Response>(new Response(false, "Error " + e.getMessage(), null), HttpStatus.OK);
		}
	}
	
	@PutMapping("/NutriNet/Cliente")
	public ResponseEntity<Response> updateCliente(@RequestBody Cliente cliente) {
		try {
			repository.save(cliente);
			return new ResponseEntity<Response>(new Response(true, "Success", cliente), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Response>(new Response(false, "Error " + e.getMessage(), null), HttpStatus.OK);
		}
	}

	@GetMapping("/NutriNet/Cliente/All")
	public ResponseEntity<Response> getAll() {
		try {
			Object response = repository.findAll();
			return new ResponseEntity<Response>(new Response(true, "Success", response), HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<Response>(new Response(false, "Error " + e.getMessage(), null), HttpStatus.OK);
		}
	}


}
