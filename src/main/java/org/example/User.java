package org.example;

public class User {
    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected String email;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
