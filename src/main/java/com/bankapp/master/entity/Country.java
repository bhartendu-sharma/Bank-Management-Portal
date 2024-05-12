package com.bankapp.master.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "country_m")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_isd_code",nullable = false)
    private String countryISDCode;

    @Column(name ="country_iso_code",nullable = false)
    private String countryISOCode;

    @Column(nullable = false)
    private String countryName;

    @Column(nullable = false)
    private String currencyCode;

    @Column(nullable = false)
    private String currencyName;

    @Column(nullable = false)
    private Integer status;

    public Country() {
    }

    public Country(Long id, String countryISDCode, String countryISOCode, String countryName, String currencyCode, String currencyName, Integer status) {
        this.id = id;
        this.countryISDCode = countryISDCode;
        this.countryISOCode = countryISOCode;
        this.countryName = countryName;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryISDCode() {
        return countryISDCode;
    }

    public void setCountryISDCode(String countryISDCode) {
        this.countryISDCode = countryISDCode;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
