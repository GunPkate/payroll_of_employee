package controller;


import lombok.RequiredArgsConstructor;
import model.EmpRequest;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public String getEmployee(){
//        employeeService.findEmployeeAll();
        return "1";
    }

    @PostMapping
    public String createEmployee(@RequestBody EmpRequest empRequest){
//        employeeService.createEmployee;
        return "1";
    }
}
