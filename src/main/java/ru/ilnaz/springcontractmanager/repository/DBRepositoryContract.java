package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.models.Contract;
import ru.ilnaz.springcontractmanager.models.Id;

import javax.sql.DataSource;
import java.sql.*;

public class DBRepositoryContract extends AbstractRepository<Contract> {

    public DBRepositoryContract(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public String insertQuery() {
        return " (number, date, amount, subject, document_type, start_date, end_date) Values (?,?,?,?,?,?,?)";
    }

    @Override
    public String updateQuery() {
        return " set number=?, date=?, subject=?, document_type=?, start_date=?, end_date=? where id=?";
    }


    @Override
    public void insertFields(PreparedStatement ps, Contract contract) throws SQLException {
        ps.setString(1, contract.getContractNumber());
        ps.setDate(2, (Date) contract.getContractDate());
        ps.setBigDecimal(3, contract.getContractAmount());
        ps.setString(4, contract.getContractSubject());
        ps.setString(5, contract.getDocumentType());
        ps.setDate(6, (Date) contract.getContractStartDate());
        ps.setDate(7, (Date) contract.getContractEndDate());
    }

    @Override
    public void updateFields(PreparedStatement ps) throws SQLException {
        Contract contract = new Contract();
        ps.setString(1, contract.getContractNumber());
        ps.setDate(2, (Date) contract.getContractDate());
        ps.setBigDecimal(3, contract.getContractAmount());
        ps.setString(4, contract.getContractSubject());
        ps.setString(5, contract.getDocumentType());
        ps.setDate(6, (Date) contract.getContractStartDate());
        ps.setDate(7, (Date) contract.getContractEndDate());
        ps.setInt(8, contract.getId());
    }


    @Override
    public Contract getModel(ResultSet rs) throws SQLException {
        Contract contract = new Contract();
        contract.setId(rs.getInt("id"));
        contract.setContractNumber(rs.getString("number"));
        contract.setContractDate(rs.getDate("name"));
        contract.setContractAmount(rs.getBigDecimal("amount"));
        contract.setContractSubject(rs.getString("subject"));
        contract.setDocumentType(rs.getString("document_type"));
        contract.setContractStartDate(rs.getDate("start_date"));
        contract.setContractEndDate(rs.getDate("end_date"));
        return contract;
    }

    @Override
    public void update(Contract item) {

    }
}
