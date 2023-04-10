package SkyProJavaIND.StreamApiAndOptional.service;

import SkyProJavaIND.StreamApiAndOptional.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeService employeeService;
    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee findEmployeeMinSalaryByDepartment(int department) {
        return null;
    }

    @Override
    public Employee findEmployeeMaxSalaryByDepartment(int department) {
        return null;
    }

    @Override
    public Employee AllEmployeesByDepartment(int department) {
        return null;
    }

    @Override
    public Employee findAll() {
        return null;

    }
}
