package kz.tezdet.lessons.springmvc.models;


public class User {
    private String username ;
    private String passwd ;
    private boolean admin ;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public User(){

    }
    public User(String name, String password) {
        this.username = name;
        this.passwd = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
