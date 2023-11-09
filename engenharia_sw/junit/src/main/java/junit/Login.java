package junit;

public class Login {

    public String login(String username, String password) {
        if ("otavio@gmail.com".equals(username) && "admin123@".equals(password)) {
            return "Valid Login";
        } else {
            return "Invalid Login";
        }
    }
}