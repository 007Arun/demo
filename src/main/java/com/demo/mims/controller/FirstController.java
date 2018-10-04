package com.demo.mims.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mims.exception.ResourceNotFoundException;
import com.demo.mims.model.First;
import com.demo.mims.repository.FirstRepository;

@RestController
@Path("/first")
@RequestMapping("/first")
public class FirstController {
	
	//@Autowired
//	FirstRepository firstRepository;
	
	@Path("/test")
	@GetMapping("/test")
	public String test() {
		//logger.info("XY Program Working fine!");
		return "XY Program Working fine!";
	}
	/*
	@GET
	@Path("/firstAll")
	@Produces(MediaType.APPLICATION_JSON)
	@GetMapping("/firstAll")
	public List<First> getAllFirst(){
		return firstRepository.findAll();
	}
	
	@PostMapping("/save")
	public First createFirst(@RequestBody First first) {
		return firstRepository.save(first);
	}
	
	@PutMapping("/update/{id}")
	public First updateFirst(@PathVariable(value="id") Long firstId, @RequestBody First first) {
		First firstObj = firstRepository.findById(firstId).orElseThrow(() -> new ResourceNotFoundException("First", "id", firstId));
		
		firstObj.setDesignation(first.getDesignation());
		firstObj.setName(first.getName());
		
		First updateFirst = firstRepository.save(firstObj);
		return updateFirst;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteFirst(@PathVariable(value="id") Long firstId){
		First firstObj = firstRepository.findById(firstId).orElseThrow(() -> new ResourceNotFoundException("First", "id", firstId));
		firstRepository.delete(firstObj);
		
		return ResponseEntity.ok().build();
	}
	*/
	
	
	
}
