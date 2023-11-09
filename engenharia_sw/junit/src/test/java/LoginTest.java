import org.junit.jupiter.api.Test;

import junit.Login;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    @Test
    public void testValidLogin() {
        Login loginService = new Login();
        String actualOutput = loginService.login("otavio@gmail.com", "admin123@");
        assertEquals("Valid Login", actualOutput);
    }

    @Test
    public void testInvalidLoginDueToPassword() {
        Login loginService = new Login();
        String actualOutput = loginService.login("otavio@gmail.com", "wrongPassword");
        assertEquals("Invalid Login", actualOutput);
    }

    @Test
    public void testInvalidLoginDueToUsername() {
        Login loginService = new Login();
        String actualOutput = loginService.login("wrongUsername", "admin123@");
        assertEquals("Invalid Login", actualOutput);
    }

    @Test
    public void testInvalidLoginDueToBoth() {
        Login loginService = new Login();
        String actualOutput = loginService.login("wrongUsername", "wrongPassword");
        assertEquals("Invalid Login", actualOutput);
    }
}
