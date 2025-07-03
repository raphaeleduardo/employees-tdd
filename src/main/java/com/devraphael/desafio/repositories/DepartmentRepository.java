package com.devraphael.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devraphael.desafio.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
