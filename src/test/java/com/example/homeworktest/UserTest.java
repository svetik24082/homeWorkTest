package com.example.homeworktest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {

    private final User user = new User("Светлана", "svetik24082@mail.ru");
    private final User user2 = new User(" Elena1256 ", " elenaivanov12267@mail.ru ");

    @Test
    @DisplayName("When the user passes the parameters then it is checked whether the data is being installed")
    void checkTheDataTest() {
        String actualResult = user.checkTheData();
        Assertions.assertEquals(user.getLogin() + " ," + user.getEmail(), actualResult, " Должно вернуть Светлана svetik24082@mail.ru");
    }

    @Test
    @DisplayName("When login  is null then the user returns Enter your data")
    void emptyUserTest() {
        String actualResult = user.checkTheDataForFillingInLogin(null);
        Assertions.assertEquals(user.getLogin() + " : Enter your data", actualResult);
    }


    @Test
    @DisplayName("When  email is null then the user returns Enter your data")
    void nullUserTest() {
        String actualResult = user2.checkTheDataForFillingInEmail(null);
        Assertions.assertEquals(user2.getEmail() + " : Enter your data", actualResult);

    }

    @Test
    @DisplayName("When email are equal correct then the user returns  svetik24082@mail.ru")
    void emailCorrectnessTest() {
        String actualResult = user.emailCorrectness("@", " . ");
        Assertions.assertEquals(user.getEmail() + " : error", actualResult);

    }

    @Test
    @DisplayName("When the login and email are different, then we return the user")
    void checkForEqualityTest() {
        String actualResult = user.checkForEquality(" Светлана", "svetik24082@mail.ru");
        Assertions.assertNotEquals(" Enter a different username and email" + user.getLogin() + user.getEmail(), actualResult);
    }


}
