package com.payroll_of_employee.payslip.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/payslip")
@RequiredArgsConstructor
public class PaySlipController {


    @PostMapping
    public String getPayslip(@RequestBody String payslipRequest){
        return "Payslip placed successfully";
    }
}
