package com.cg.sp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallAdminController {

	@Autowired
	private MallAdminService service;
	
	//Retrieval
	@GetMapping("/shopping")
	public List<MallAdmin> list(){
		return service.listAll();
	}
	
	//Retrieve By Id
	@GetMapping("/shopping/{id}")
	public ResponseEntity <MallAdmin> get(@PathVariable Integer id){
		try {
			MallAdmin malladmin = service.get(id);
			return new ResponseEntity<MallAdmin>(malladmin,HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<MallAdmin>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Create
	@PostMapping("/shopping")
	public void add(@RequestBody MallAdmin malladmin) {
		service.save(malladmin);
	}
	
	//Update
	@PutMapping("/shopping/{id}")
	public ResponseEntity<?> update(@RequestBody MallAdmin malladmin,@PathVariable Integer id){
		try {
			MallAdmin existMallAdmin = service.get(id);
			service.save(malladmin);
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete
	@DeleteMapping("/shopping/{id}")
	public void delete(@PathVariable Integer id) {
	
		service.delete(id);
		
	}
}
