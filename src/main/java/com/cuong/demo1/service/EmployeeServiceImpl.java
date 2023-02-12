package com.cuong.demo1.service;

import com.cuong.demo1.model.Employee;
import com.cuong.demo1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if (employee != null) {
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(long id, Employee newEmployee) {
        if (newEmployee != null) {
            Employee employee = employeeRepository.getById(id);
            if (employee != null) {
                employee.setName(newEmployee.getName());
                employee.setAddress(newEmployee.getAddress());
                return employeeRepository.save(employee);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(long id) {
        if (id >= 1) {
            Employee employee = employeeRepository.getReferenceById(id);
            if (employee != null) {
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.getById(id);
    }
}
