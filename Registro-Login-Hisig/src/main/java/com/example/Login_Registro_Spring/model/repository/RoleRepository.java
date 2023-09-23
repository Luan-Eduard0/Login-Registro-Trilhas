package com.example.Login_Registro_Spring.model.repository;

import com.example.Login_Registro_Spring.model.dao.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByNome(String nome);
}
