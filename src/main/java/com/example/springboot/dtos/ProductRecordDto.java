package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

//Record já traz vários metodos prontos(getters, toString, etc),
// mas os records são imutaveis, uma vez criado não consegue mudar seus valores
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

}
