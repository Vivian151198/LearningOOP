package lesson08;

public abstract class LoginPage {

    public void login(){
        System.out.println("User name: " + usernameSelector());
        System.out.println("Password: " + passwordSelector());
        System.out.println("Click on Login btn: " + loginBtnSelector());
    }

    protected abstract String usernameSelector();

    protected abstract String passwordSelector();

    protected abstract String loginBtnSelector();
}
