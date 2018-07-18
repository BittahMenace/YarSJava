package lesson33ConsoleMenu;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private static  final long SerialVersionUID = 100L;
    private static int nextID = 1000;
    private int id;
    private String login;
    private String password;
    private LocalDate created;

    public User() {
        setId();
        this.login = "login";
        this.password = "password";
        this.created = LocalDate.now();
    }



    public User( String login, String password, LocalDate created) {
        setId();
        this.login = login;
        this.password = password;
        this.created = created;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    private void setId() {
        this.id = nextID;
        nextID++;
    }

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

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", created=" + created +
                '}';
    }
}
