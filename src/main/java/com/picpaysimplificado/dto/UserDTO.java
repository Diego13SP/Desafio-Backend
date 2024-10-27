package com.picpaysimplificado.dto;

import com.picpaysimplificado.Enumaration.UserType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;



public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
