package ro.sda.javaro39.springTestEarn.REST.RESTYT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/test/employee")
public class EmployeeControler {

//    private EmployeeRepository employeeRepository;
//
//    public EmployeeControler(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    @GetMapping
//    public List<Employee> getEmployee() {
//        return employeeRepository.findAll();
//    }
//
//    @PostMapping(path = "/send")
//    public Employee createEmployee() {
//        Employee employee = new Employee("Marius", "Laurentiu", 13, "gavrilalaurentiu10@yahoo.com", "Braila", "Enginner");
//        return employeeRepository.save(employee);
//    }
}
