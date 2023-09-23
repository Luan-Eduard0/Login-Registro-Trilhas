package com.example.Login_Registro_Spring.model.repository;

import com.example.Login_Registro_Spring.model.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByTelefone(String telefone);
}
