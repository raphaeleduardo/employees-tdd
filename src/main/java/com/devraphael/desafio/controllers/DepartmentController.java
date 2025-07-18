package com.devraphael.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devraphael.desafio.dto.DepartmentDTO;
import com.devraphael.desafio.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_OPERATOR')")
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll() {
		List<DepartmentDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
