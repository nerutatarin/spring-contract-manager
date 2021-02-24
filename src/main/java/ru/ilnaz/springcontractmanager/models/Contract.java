package ru.ilnaz.springcontractmanager.models;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
    private int id;
    private String contractNumber;
    private Date contractDate;
    private String contractSubject;
    private String documentType;
    private Date contractStartDate;
    private Date contractEndDate;
    private BigDecimal contractAmount;
    private BigDecimal contractBalanceAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractSubject() {
        return contractSubject;
    }

    public void setContractSubject(String contractSubject) {
        this.contractSubject = contractSubject;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public BigDecimal getContractBalanceAmount() {
        return contractBalanceAmount;
    }

    public void setContractBalanceAmount(BigDecimal contractBalanceAmount) {
        this.contractBalanceAmount = contractBalanceAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", contractNumber='" + contractNumber + '\'' +
                ", contractDate=" + contractDate +
                ", contractSubject='" + contractSubject + '\'' +
                ", documentType='" + documentType + '\'' +
                ", contractStartDate=" + contractStartDate +
                ", contractEndDate=" + contractEndDate +
                ", contractAmount='" + contractAmount + '\'' +
                ", contractBalanceAmount='" + contractBalanceAmount + '\'' +
                '}';
    }
}