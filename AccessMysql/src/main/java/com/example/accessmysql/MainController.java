package com.example.accessmysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/demo")
public class MainController {
    @Autowired
    private EmployeeRepository employeeRepository;

    // create
    @PostMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name
            , @RequestParam String email) {
        Employee employ = new Employee();
        employ.setName(name);
        employ.setEmail(email);
        employeeRepository.save(employ);
        return "Saved";
    }

    // retrieve all including soft deleted
    @GetMapping("/all")
    public @ResponseBody Iterable<Employee> getAllUsers() {
        return employeeRepository.findAll();
    }

    // retrieve all
    @GetMapping("/retrieve")
    public @ResponseBody Iterable<Employee> getUsers() {
        List<Employee> realEmployee = new ArrayList<>();
        Iterable<Employee> employees= employeeRepository.findAll();
        for (Employee employee : employees) {
            if (employee.getDeleted() == Boolean.FALSE){
                realEmployee.add(employee);
            }
        }
        return realEmployee;
    }
    // retrieve by id
    @GetMapping("/find/{id}")
    public @ResponseBody ResponseEntity<?> getUserByID(@PathVariable("id") Integer id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee = optionalEmployee.orElse(null);

        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No such employee");
        }
    }

    // delete
    @GetMapping("/delete/{id}")
    public @ResponseBody String deleteUserByID(@PathVariable Integer id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee = optionalEmployee.orElse(null);

        if (employee != null) {
            employeeRepository.deleteById(id);
            return "deleted";
        } else {
            return "No such employee";
        }

    }
    // soft delete
    @GetMapping("/softdelete/{id}")
    public @ResponseBody String softDeleteUserByID(@PathVariable Integer id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee = optionalEmployee.orElse(null);

        if (employee != null) {
            employee.setDeleted(Boolean.TRUE);
            employeeRepository.save(employee);
            return "deleted";
        } else {
            return "No such employee";
        }

    }

    // update
    @PostMapping("/update")
    public @ResponseBody String updateUser(@RequestParam Integer id, @RequestParam String name
            , @RequestParam String email) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee = optionalEmployee.orElse(null);
        if (employee != null) {
            employee.setName(name);
            employee.setEmail(email);
            employeeRepository.save(employee);
            return "changed";
        } else {
            return "No such employee";
        }

    }
}
