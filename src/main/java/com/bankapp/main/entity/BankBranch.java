package com.bankapp.main.entity;

import com.bankapp.master.entity.City;
import com.bankapp.master.entity.PinCode;
import com.bankapp.master.entity.State;
import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "bank_management_portal_bank_branch_dtl")
public class BankBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String branchName;

    @Column(nullable = false)
    private String branchCode;

    @OneToOne
    @JoinColumn(name = "manager")
    private BankManager manager;

    @ManyToOne
    @JoinColumn(name = "pincode")
    private PinCode pincode;

    @ManyToOne
    @JoinColumn(name = "state")
    private State state;

    @ManyToOne
    @JoinColumn(name = "city")
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
    @OneToMany(mappedBy = "employee")
    private List<Employee> employees;

    // Customers
    @OneToMany(mappedBy = "customer")
    private List<Customer> customers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public BankManager getManager() {
        return manager;
    }

    public void setManager(BankManager manager) {
        this.manager = manager;
    }

    public PinCode getPincode() {
        return pincode;
    }

    public void setPincode(PinCode pincode) {
        this.pincode = pincode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getBranchEmail() {
        return branchEmail;
    }

    public void setBranchEmail(String branchEmail) {
        this.branchEmail = branchEmail;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getClosingHours() {
        return closingHours;
    }

    public void setClosingHours(String closingHours) {
        this.closingHours = closingHours;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
