package com.bankapp.main.controller;

import com.bankapp.main.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String showEmployeeRegistrationForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-registration";
    }

    @PostMapping("/register-employee")
    public String registerEmployee(@ModelAttribute("employee") Employee employee) {
        // Logic to save the employee to the database
        // You can add the logic here to save the employee entity
        // You can also redirect to a success page or show a confirmation message
        return "redirect:/employee/register";
    }
}
