package com.example.escuelita.models;

import lombok.Data;

@Data
public class AdminDTO {

    public static final String getUserDTO = null;
    private String userDTO;
    private String passwordDTO;
    public String getPasswordDTO;

    public AdminDTO(String userDTO, String passwordDTO) {
        this.setUserDTO(userDTO);
        this.setPasswordDTO(passwordDTO);
    }

    public String getPasswordDTO() {
        return passwordDTO;
    }

    public void setPasswordDTO(String passwordDTO) {
        this.passwordDTO = passwordDTO;
    }

    public String getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(String userDTO) {
        this.userDTO = userDTO;
    }
}
