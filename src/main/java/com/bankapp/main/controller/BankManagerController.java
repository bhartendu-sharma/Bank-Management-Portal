package com.bankapp.main.controller;

import com.bankapp.main.entity.BankManager;
import com.bankapp.main.service.BankManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/manager")
public class BankManagerController {

    private final BankManagerService bankManagerService;
   @Autowired
    public BankManagerController(BankManagerService bankManagerService) {
        this.bankManagerService = bankManagerService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("bankManager", new BankManager());
        return "bank-manager-registration";
    }

    @PostMapping("/register")
    public String registerManager(@Valid @ModelAttribute("bankManager") BankManager bankManager, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // If there are validation errors, return to the registration form
            return "bank-manager-registration";
        }

        // Save the bank manager
        bankManagerService.saveBankManager(bankManager);
        return "redirect:/user/login"; // Redirect to login page after successful registration
    }
}
