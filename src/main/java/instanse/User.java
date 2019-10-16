package instanse;

public class User {
    String login;
    String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean checkLoginVallidation(String enteredLogin){
        if (enteredLogin != null && enteredLogin.length() > 6 && Character.isLetter(enteredLogin.charAt(0))){
            for (int i = 0; i < enteredLogin.length(); i++ ){
                if (!Character.isLetter(enteredLogin.charAt(i)) && !Character.isDigit(enteredLogin.charAt(i))) return false;
            }
            return true;
        }
        return false;
    }
}
