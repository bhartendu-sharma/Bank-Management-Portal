package com.bankapp.main.entity;

import com.bankapp.master.entity.City;
import com.bankapp.master.entity.PinCode;
import com.bankapp.master.entity.State;
import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

public class BankBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String branchName;

    @Column(nullable = false)
    private String branchCode;

    @ManyToOne
    @JoinColumn(name = "bank_manager_id")
    private BankManager bankManager;

    @ManyToOne
    @JoinColumn(name = "pincode_id")
    private PinCode pincode;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String branchAddress;

    @NotBlank(message = "Email is required")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email address")
    @Column(nullable = false)
    private String branchEmail;

    // Operational Details
    @Column
    private boolean isOpen;

    @Column
    private String openingHours;

    @Column
    private String closingHours;

    // Employees
    @OneToMany(mappedBy = "branch")
    private List<Employee> employees;

    // Customers
    @OneToMany(mappedBy = "branch")
    private List<Customer> customers;

}
