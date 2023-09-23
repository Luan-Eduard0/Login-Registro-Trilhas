package com.example.Login_Registro_Spring.model.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto
{
    private Long id;
    @NotEmpty
    private String Nome;
    @NotEmpty
    private String Sobrenome;
    @NotEmpty(message = "Telefone não pode ser vazio")
    private String telefone;
    @NotEmpty(message = "Senha não pode ser vazia")
    private String senha;


}
