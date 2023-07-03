package lesson08;

public class ExternalLoginPage extends LoginPage{
    @Override
    protected String usernameSelector() {
        return "ExternalLoginPage: usernameSelector";
    }

    @Override
    protected String passwordSelector() {
        return "ExternalLoginPage: passwordSelector";
    }

    @Override
    protected String loginBtnSelector() {
        return "ExternalLoginPage: loginBtnSelector";
    }
}
