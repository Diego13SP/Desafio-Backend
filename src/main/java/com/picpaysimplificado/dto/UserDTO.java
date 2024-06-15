package com.picpaysimplificado.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class UserDTO {
    private Long id;

    private String email;
    private String document;
    private String senha;
    private String firstName;
    private String lastName;
    private String password;
    private BigDecimal balance;
}
