package ru.ilnaz.springcontractmanager.models;

public class Id {

    protected int id;

    public Id(int id) {
        this.id = id;
    }

    public Id() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}