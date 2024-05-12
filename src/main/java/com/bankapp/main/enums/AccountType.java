package com.bankapp.main.enums;

public enum AccountType {
    SAVINGS("Savings", "For saving money"),
    CHECKING("Checking", "For everyday transactions"),
    CREDIT_CARD("Credit Card", "For making purchases on credit"),
    MONEY_MARKET("Money Market", "For high-yield savings"),
    CERTIFICATE_OF_DEPOSIT("Certificate of Deposit", "For fixed-term deposits"),
    RETIREMENT("Retirement", "For retirement savings"),
    BROKERAGE("Brokerage", "For investing in securities"),
    LOAN("Loan", "For borrowing money"),
    CURRENT("Current Account", "For day-to-day transactions and overdraft facilities");

    private final String label;
    private final String description;

    AccountType(String label, String description) {
        this.label = label;
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }
}
