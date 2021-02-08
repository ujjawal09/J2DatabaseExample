package com.example.springH2demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springH2demo.model.Employee;


@Repository
public interface EmlployeeRepository extends JpaRepository<Employee, Integer >{

	public List<Employee> findByDept(String dept);
}
