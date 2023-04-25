package com.example.exchangeratechange.coursework;

import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastname;

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee emloyee = (Employee) o;
        return firstname.equals(emloyee.firstname) && lastname.equals(emloyee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
