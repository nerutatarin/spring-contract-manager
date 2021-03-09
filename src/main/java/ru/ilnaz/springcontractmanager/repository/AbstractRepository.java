package ru.ilnaz.springcontractmanager.repository;

import ru.ilnaz.springcontractmanager.models.Id;
import ru.ilnaz.springcontractmanager.utils.DBConnection;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractRepository<T extends Id> implements Repository<T> {

    protected DataSource dataSource;

    public AbstractRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void add(T item) {

        String query = "insert into " + this.getTableName() + this.insertQuery();

        try (PreparedStatement ps = dataSource.getConnection().prepareStatement(query)) {

            insertFields(ps, item);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*@Override
    public void update(T item) {

        String query = "update " + this.getTableName() + this.updateQuery();

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = dataSource.getConnection().prepareStatement(query)) {

            updateFields(ps);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    @Override
    public void delete(T item) {

        String query = "delete from " + this.getTableName() + " where id=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = dataSource.getConnection().prepareStatement(query)) {

            ps.setInt(1, item.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T getById(int id) {

        String query = "select * from " + this.getTableName() + " where id=?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = dataSource.getConnection().prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return getModel(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract String getTableName();

    public abstract String insertQuery();

    public abstract String updateQuery();

    public abstract T getModel(ResultSet rs) throws SQLException;

    public abstract void insertFields(PreparedStatement ps, T item) throws SQLException;

    public abstract void updateFields(PreparedStatement ps) throws SQLException;
}
