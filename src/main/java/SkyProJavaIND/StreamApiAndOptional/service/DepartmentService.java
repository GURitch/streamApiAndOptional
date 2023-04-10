package SkyProJavaIND.StreamApiAndOptional.service;

import SkyProJavaIND.StreamApiAndOptional.model.Employee;

public interface DepartmentService {
    public Employee findEmployeeMinSalaryByDepartment(int department);
    public Employee findEmployeeMaxSalaryByDepartment(int department);
    public Employee AllEmployeesByDepartment(int department);
    public Employee findAll();
}
