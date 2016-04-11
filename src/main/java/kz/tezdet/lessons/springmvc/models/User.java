package kz.tezdet.lessons.springmvc.models;


import javax.validation.constraints.Size;

public class User {
    @Size(min=6, message = "Қолданушының есімі 6 символдан кем болмауы тиіс")
    private String username ;
    @Size(min=5, max=6, message =
            "Пароль 5 символдан кем емес және 15 символдан артық болмауы тиіс")
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
