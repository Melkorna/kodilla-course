package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstname;
    private String lastname;
    private String peselId;

    public LibraryUser(String olek, String orlowski, String s) {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, peselId);
    }
}
