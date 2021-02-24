package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.models.Contract;

import java.sql.SQLException;

public interface ContractRepository {
    void addContract(Contract contract) throws SQLException;

    void delContract(Contract contract);

    void updateContract(Contract contract);

    Contract getContract(int id);
}
