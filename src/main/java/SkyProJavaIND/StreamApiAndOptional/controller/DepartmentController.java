package SkyProJavaIND.StreamApiAndOptional.controller;

import SkyProJavaIND.StreamApiAndOptional.model.Employee;
import SkyProJavaIND.StreamApiAndOptional.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/min-salary")
    public Optional<Employee> minSalaryByDepartment(@RequestParam("department") int department) {
        return departmentService.findEmployeeMinSalaryByDepartment(department);
    }

    @GetMapping("/max-salary")
    public Optional<Employee> maxSalaryByDepartment(@RequestParam("department") int department) {
        return departmentService.findEmployeeMaxSalaryByDepartment(department);
    }

    @GetMapping("/all")
    public List<Employee> allEmployeesByDepartment(@RequestParam("department") int department) {
        return departmentService.allEmployeesByDepartment(department);
    }

    @GetMapping
    public Map<Integer, List<Employee>> findAll(){
        return departmentService.findAll();
    }
}
