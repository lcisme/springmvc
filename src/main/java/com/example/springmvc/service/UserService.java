package com.example.springmvc.service;

import com.example.springmvc.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUser();
    void createrUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUSer(Integer id);
    UserDTO getUserById(int id);
}
