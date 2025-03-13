package com.nit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.model.Employee;
import com.nit.repo.IEmployeeRepository;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtServices {
	@Autowired
	private IEmployeeRepository empRepo;
	@Override
	public Iterable<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}
	@Override
	public String regiterEmployee(Employee emp) {
		
		return "Employee is saved with id value : "+empRepo.save(emp).getEmpno();
	}
	@Override
	public Employee getEmployeeByNO(int eno) {
		Employee emp = empRepo.findById(eno).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}
	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is updated with having id value::"+empRepo.save(emp).getEmpno();
	}
	@Override
	public String deleteEmployeeById(int eno) {
		empRepo.deleteById(eno);
		return eno+" This employee id is deleted";
	}

}
