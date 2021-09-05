package com.java.comment.s.site.demo.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private final Long id;
    @Column(name = "name")
    private final String name;
    @Column(name = "email")
    private final String email;
    @Column(name = "password")
    private final String password;

    public User(Long id, String name, String email, String password) {this.id = id; this.name = name; this.email = email; this.password = password;}
    public Long getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
}
