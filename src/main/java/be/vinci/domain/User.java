package be.vinci.domain;

import org.mindrot.jbcrypt.BCrypt;

public class User {
    private int id;
    private String login;
    private String password;

    public String getLogin(){
        return login;
    }
    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public boolean checkPassword(String password){
        return BCrypt.checkpw(password, this.password);
    }

    @Override
    public String toString() {
        return "{id:" + id + ", login:" + login + ", password:" + password + "}";
    }
}
