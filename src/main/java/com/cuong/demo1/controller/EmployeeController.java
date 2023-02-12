package com.cuong.demo1.controller;

import com.cuong.demo1.model.Employee;
import com.cuong.demo1.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping(value = "")
    public String test() {
        return "hello";
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return iEmployeeService.addEmployee(employee);
    }

    @PutMapping(value = "/update")
    public Employee updateEmployee(@RequestParam long id, @RequestBody Employee employee) {
        return iEmployeeService.updateEmployee(id, employee);
    }
    @DeleteMapping(value = "/delete/{id}")
    public boolean deleteEmployee(@PathVariable long id){
        return iEmployeeService.deleteEmployee(id);
    }
    @GetMapping(value = "/list")
    public List<Employee> getAllEmployee(){
        return iEmployeeService.getAllEmployee();
    }
}
