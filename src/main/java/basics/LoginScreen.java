package basics;

public class LoginScreen extends Screen {

    String userName;
    String password;
    public static final String LOGIN_BUTTON = "Login";

    public LoginScreen(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCredentials() {
        String credentials = userName + ":" + password;
        return credentials;
    }

}
