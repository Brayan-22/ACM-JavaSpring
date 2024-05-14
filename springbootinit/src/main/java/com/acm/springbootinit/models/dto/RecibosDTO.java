package com.acm.springbootinit.models.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecibosDTO {
    private int id;
    private LocalDate fechaCompra;
    private int productos;
}
