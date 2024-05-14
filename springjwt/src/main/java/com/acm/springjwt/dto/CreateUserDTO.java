package com.acm.springjwt.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserDTO {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @Email
    private String email;
    // @NotBlank
    // private String role;
}
