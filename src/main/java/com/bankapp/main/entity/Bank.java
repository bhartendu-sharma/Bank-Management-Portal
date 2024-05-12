package com.bankapp.main.entity;

import com.bankapp.master.entity.City;
import com.bankapp.master.entity.PinCode;
import com.bankapp.master.entity.State;
import jakarta.persistence.*;

@Entity
@Table(name = "bank_management_portal_bank_dtl")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    private Long id;

    @Column(nullable = false)
    private String bankName;

    @Column(nullable = false)
    private String bankCode;

    @ManyToOne
    @JoinColumn(name = "bank_manager_id")
    private BankManager bankManager;

    @Column(nullable = false)
    private String website;

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
    private String bankAddress;

    @Column(nullable = false)
    private String bankEmail;

//    @ManyToOne
//    private Country country;


    public Bank() {
    }

    public Bank(Long id, String bankName, String bankCode, BankManager bankManager, String website, PinCode pincode, State state, City city, String street, String bankAddress, String bankEmail) {
        this.id = id;
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.bankManager = bankManager;
        this.website = website;
        this.pincode = pincode;
        this.state = state;
        this.city = city;
        this.street = street;
        this.bankAddress = bankAddress;
        this.bankEmail = bankEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public BankManager getBankManager() {
        return bankManager;
    }

    public void setBankManager(BankManager bankManager) {
        this.bankManager = bankManager;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankEmail() {
        return bankEmail;
    }

    public void setBankEmail(String bankEmail) {
        this.bankEmail = bankEmail;
    }
}
