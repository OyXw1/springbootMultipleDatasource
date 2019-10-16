package com.test.springboot.first;


import javax.persistence.*;
@Table(name = "user_one")
@Entity

public class UserOne {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int id;
    @Column
    private String username;
    @Column
    private String password;

    @Override
    public String toString() {
        return "UserOne{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
