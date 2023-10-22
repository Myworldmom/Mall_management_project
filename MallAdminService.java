package com.cg.sp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallAdminService {

	@Autowired
	private MallAdminRepository repository;
	
	public List<MallAdmin> listAll(){
		return repository.findAll();
	}
	
	public MallAdmin get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(MallAdmin malladmin) {
		repository.save(malladmin);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
}
