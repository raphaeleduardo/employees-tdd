package com.devraphael.desafio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devraphael.desafio.dto.DepartmentDTO;
import com.devraphael.desafio.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public List<DepartmentDTO> findAll() {
		return repository.findAll(Sort.by("name")).stream().map(x -> new DepartmentDTO(x)).collect(Collectors.toList());
	}	
}
