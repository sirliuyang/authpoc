package entity;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;

    public User() {
        super();
    }

    public User(String username) {
        this.username = username;
    }

}