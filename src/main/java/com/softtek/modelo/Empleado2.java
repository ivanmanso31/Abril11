package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Empleado2 {

    private int idEmpleado;
    private String nombre;
    private LocalDate nacimiento;
    private String ciudad;
}
