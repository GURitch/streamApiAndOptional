package SkyProJavaIND.StreamApiAndOptional.service;

import SkyProJavaIND.StreamApiAndOptional.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeService employeeService;
    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Optional<Employee> findEmployeeMinSalaryByDepartment(int department) {
        return employeeService.findAllEmployees().stream()
                .filter(employee -> employee.getDepartment()==department)
                .min(Comparator.comparingInt(Employee::getSalary));
    }

    @Override
    public Optional<Employee> findEmployeeMaxSalaryByDepartment(int department) {
        return employeeService.findAllEmployees().stream()
                .filter(employee -> employee.getDepartment()==department)
                .max(Comparator.comparingInt(Employee::getSalary));
    }

    @Override
    public List<Employee> allEmployeesByDepartment(int department) {
        return employeeService.findAllEmployees().stream()
                .filter(employee -> employee.getDepartment()==department).toList()
                ;
    }

    @Override
    public Map<Integer, List<Employee>> findAll() {
        return employeeService.findAllEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
