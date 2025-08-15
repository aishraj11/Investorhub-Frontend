package com.investorhub.investorhub;

import jakarta.persistence.*;

@Entity
public class FundingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;
    private String userName;  // user requesting
    private String message;
    private double amountRequired;

    public FundingRequest() {}

    public FundingRequest(Long investorId, String userName, String message, double amountRequired) {
        this.investorId = investorId;
        this.userName = userName;
        this.message = message;
        this.amountRequired = amountRequired;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getInvestorId() { return investorId; }
    public void setInvestorId(Long investorId) { this.investorId = investorId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public double getAmountRequired() { return amountRequired; }
    public void setAmountRequired(double amountRequired) { this.amountRequired = amountRequired; }
}
