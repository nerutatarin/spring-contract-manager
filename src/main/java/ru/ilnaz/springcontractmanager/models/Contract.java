package ru.ilnaz.springcontractmanager.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class Contract extends Id<Integer> {

    private int id;
    @NotEmpty(message = "Не указан номер контракта")
    private String contractNumber;
    @NotNull(message = "Не указана дата контракта")
    private Date contractDate;
    @NotEmpty(message = "Не указан предмет контракта")
    private String contractSubject;
    @NotEmpty(message = "Не указан тип документа")
    private String documentType;
    @NotNull(message = "Не указана дата начала контракта")
    private Date contractStartDate;
    @NotNull(message = "Не указана дата окончания контракта")
    private Date contractEndDate;
    @NotEmpty(message = "Не указана сумма контракта")
    private BigDecimal contractAmount;
    private BigDecimal contractBalanceAmount;

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

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public void setId(int item) {

    }
}