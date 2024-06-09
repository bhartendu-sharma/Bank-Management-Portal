package com.bankapp.main.entity;

import com.bankapp.main.enums.Gender;
import com.bankapp.master.entity.*;
import jakarta.persistence.*;

import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "bank_management_portal_employee_dtl")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @NotNull(message = "First name is required")
    @Size(min = 3, message = "First name must be at least 3 characters")
    @Column(nullable = false)
    private String firstName;

    @NotNull(message = "Last name is required")
    @Size(min = 3, message = "Last name must be at least 3 characters")
    @Column(nullable = false)
    private String lastName;

    @NotNull(message = "Gender is required")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email address")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "Date of birth is required")
    @Past(message = "Date of birth must be in the past")
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateOfBirth;

    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 characters")
    @Column(nullable = false)
    private String phoneNumber;

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
    private String address;

    @ManyToOne
    private BankManager manager;

    @ManyToOne
    @JoinColumn
    private JobTitle jobTitle;

    @ManyToOne
    @JoinColumn
    private Department department;

    @Column
    private Date hireDate;

    @Column
    private double salary;

    @Column
    private boolean isActive;

    public Employee() {
    }

    public Employee(Long employeeId, String firstName, String lastName, Gender gender, String email, Date dateOfBirth, String phoneNumber, PinCode pincode, State state, City city, String street, String address, BankManager manager, JobTitle jobTitle, Department department, Date hireDate, double salary, boolean isActive) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
        this.state = state;
        this.city = city;
        this.street = street;
        this.address = address;
        this.manager = manager;
        this.jobTitle = jobTitle;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = salary;
        this.isActive = isActive;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BankManager getManager() {
        return manager;
    }

    public void setManager(BankManager manager) {
        this.manager = manager;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
