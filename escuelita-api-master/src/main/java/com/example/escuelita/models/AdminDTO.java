package com.example.escuelita.models;

import lombok.Data;

@Data
public class AdminDTO {

    public static final String getUserDTO = null;
    private String userDTO;
    private String passwordDTO;
    public String getPasswordDTO;

    public AdminDTO(String userDTO, String passwordDTO) {
        this.userDTO = userDTO;
        this.passwordDTO = passwordDTO;
    }
}
