package com.example.service;

import com.example.entity.Department;

import java.util.List;


public interface DepartmentService {
    public Department saveDepartment(Department department);


    public List<Department> showAllDepartmentList();

    public Department showDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long id, Department department);

    public Department getDepartmentByName(String name);
}
