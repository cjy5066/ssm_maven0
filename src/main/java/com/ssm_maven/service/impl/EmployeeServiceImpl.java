package com.ssm_maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ssm_maven.domain.Employee;
import com.ssm_maven.mapper.EmployeeMapper;
import com.ssm_maven.service.IEmployeeService;

@Transactional(readOnly = true)
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeMapper em;
	@Override
	public List queryAll() {
		List queryAll = em.queryAll();
		return queryAll;
	}

	@Override
	public Employee getOne(Long id) {
		Employee one = em.getOne(id);
		return one;
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		em.save(employee);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		em.delete(id);
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		em.update(employee);
	}

}
