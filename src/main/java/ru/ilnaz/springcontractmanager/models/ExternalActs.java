package ru.ilnaz.springcontractmanager.models;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "external_acts")
public class ExternalActs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "sum", nullable = false)
    private BigDecimal sum;

    @Column(name = "contract_id", nullable = false)
    private Integer contractId;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getContractId() {
        return contractId;
    }

    @Override
    public String toString() {
        return "ExternalActs{" +
                "id=" + id + '\'' +
                "number=" + number + '\'' +
                "date=" + date + '\'' +
                "sum=" + sum + '\'' +
                "contractId=" + contractId + '\'' +
                '}';
    }
}
