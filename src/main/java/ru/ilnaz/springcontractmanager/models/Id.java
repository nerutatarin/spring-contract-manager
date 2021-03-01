package ru.ilnaz.springcontractmanager.models;

public abstract class Id <T>{

    public abstract T getId();

    abstract void setId(int item);

}