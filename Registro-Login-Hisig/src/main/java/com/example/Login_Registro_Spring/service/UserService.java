package com.example.Login_Registro_Spring.service;

import com.example.Login_Registro_Spring.model.dto.UserDto;
import com.example.Login_Registro_Spring.model.dao.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByTelefone(String telefone);

    List<UserDto> findAllUsers();
}
