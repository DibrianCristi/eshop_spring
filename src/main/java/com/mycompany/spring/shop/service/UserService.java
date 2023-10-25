/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.spring.shop.service;

import com.mycompany.spring.shop.entity.User;
import java.util.List;


public interface UserService {
 public List<User> getAllUsers();
public void saveUser(User user);
public User getUser(int id);
public void deleteUser(int id);   
}
