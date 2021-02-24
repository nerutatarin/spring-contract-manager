package ru.ilnaz.springcontractmanager.repository;


import ru.ilnaz.springcontractmanager.models.Contract;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBRepositoryContract extends AbstractRepository<Contract> {
    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public Contract getModel(ResultSet rs) throws SQLException {
        return null;
    }
}
