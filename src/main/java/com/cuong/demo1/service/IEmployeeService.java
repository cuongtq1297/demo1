package com.cuong.demo1.service;

import com.cuong.demo1.model.Employee;

import java.util.List;

public interface IEmployeeService {
    // them nhan vien
    public Employee addEmployee(Employee employee);

    // chinh sua thong tin
    public Employee updateEmployee(long id, Employee employee);
    // xoa nhan vien
    public boolean deleteEmployee(long id);
    // lay danh sach nhan vien
    public List<Employee> getAllEmployee();
    // lay 1 nhan vien
    public Employee getEmployeeById(long id);
}
