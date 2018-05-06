package basics;

public class App {

    public static void main(String[] args) {
//        Screen screen = new Screen("Constructor screen", 1090);
//        screen.setScreenName("LoginScreen");
//        screen.setScreenId(123 + 321);
//        screen.setScreenToTest(true);
//
//        screen.printScreen();
        LoginScreen loginScreen = new LoginScreen("lev", "qwerty");
        loginScreen.setScreenName("LoginPage");
        loginScreen.setScreenId(1082);
        loginScreen.setScreenToTest(true);
        loginScreen.printScreenDetails();
        loginScreen.getScreenToTest();
        String credentials = loginScreen.getCredentials();
        System.out.println("Credentials:" + credentials);
        loginScreen.pressButton(LoginScreen.LOGIN_BUTTON);

    }
}
