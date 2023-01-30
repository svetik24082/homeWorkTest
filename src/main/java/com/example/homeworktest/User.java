package com.example.homeworktest;

import java.util.Objects;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {
        this("логин", " емейл");
    }

    public String checkTheData() { // проверить данные
        return this.login + " ," + this.email;

    }

    public String checkTheDataForFillingInLogin(String login) { // проверить заполнены ли данные
        if (login == null || login.isBlank()) {
            login = " : Enter your data";

        }
        return this.login + login;

    }

    public String checkTheDataForFillingInEmail(String email) { // проверить заполнены ли данные
        if (email == null || email.isBlank()) {
            email = " : Enter your data";

        }
        return this.email + email;
    }

    public String emailCorrectness(String email, String s) {  // проверить на корректность заполнения
        if (!email.contains("@") || !email.contains(" . ")) {
            email = " : error";
        }
        return this.email + email;

    }

    public String checkForEquality(String login, String email) {// проверить  равны ли логин и емейл

        return login + " " + email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }


}
