package com.bankapp.main.controller;

import com.bankapp.main.entity.Bank;
import com.bankapp.main.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bank")
public class BankController {

    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/register")
    public String showBankRegistrationForm(Model model) {
        model.addAttribute("bank", new Bank());
        return "bank-registration";
    }

    @PostMapping("/register")
    public String registerBank(Bank bank) {
        bankService.registerBank(bank);
        return "redirect:/bank/register";
    }
}
