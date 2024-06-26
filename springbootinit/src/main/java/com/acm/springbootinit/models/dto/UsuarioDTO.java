package com.acm.springbootinit.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private String full_name;
    private List<RecibosDTO> recibo;
}
