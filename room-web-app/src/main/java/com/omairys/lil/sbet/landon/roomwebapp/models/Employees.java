package com.omairys.lil.sbet.landon.roomwebapp.models;

public class Employees {
    private long id;
    private String number;
    private String firstName;
    private String lastName;
    private String Position;

    public Employees() { }

    public Employees(long id, String number, String firstName, String lastName, String position) {
        this.id = id;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        Position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
