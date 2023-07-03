package lesson08;

public class InternalLoginPage extends LoginPage{
    @Override
    protected String usernameSelector() {
        return "InternalLoginPage: usernameSelector";
    }

    @Override
    protected String passwordSelector() {
        return "InternalLoginPage: passwordSelector";
    }

    @Override
    protected String loginBtnSelector() {
        return "InternalLoginPage: loginBtnSelector";
    }
}
