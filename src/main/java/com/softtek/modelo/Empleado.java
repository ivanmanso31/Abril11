package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private int jefe;
}
