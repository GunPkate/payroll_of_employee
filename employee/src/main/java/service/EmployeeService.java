package service;

import entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Boolean findEmployeeAll(){
        EmployeeEntity employee = (EmployeeEntity) employeeRepository.findAll();
        return true;
    }
}
