package com.ssm_maven.service;

import java.util.List;

import com.ssm_maven.domain.Employee;

public interface IEmployeeService {

	public List queryAll();
	
	public Employee getOne(Long id);
	
	public void save(Employee employee);
	
	public void delete(Long id);
	
	public void update(Employee employee);
}
