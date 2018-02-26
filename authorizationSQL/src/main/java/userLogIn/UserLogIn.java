package userLogIn;

public class UserLogIn {

    private String name;
    private String password;

    public UserLogIn(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public UserLogIn() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
