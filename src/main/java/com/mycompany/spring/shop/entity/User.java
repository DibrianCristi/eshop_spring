/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.entity;

import static java.lang.Boolean.FALSE;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "enabled")
    private boolean is_admin;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.is_admin = FALSE;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public boolean isIs_admin() {
        return is_admin;
    }
    
}
