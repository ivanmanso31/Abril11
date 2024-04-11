package com.softtek.persistencia;

import com.softtek.modelo.Empleado;
import com.softtek.modelo.Empleado2;
import com.softtek.modelo.Producto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoStream extends Conexion{

    public List<Producto> obtenerProductos() throws  ClassNotFoundException, SQLException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select product_id, product_name, unit_price, category_id from products;";
        List<Producto> productos = new ArrayList<>();
        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);
        while (resultado.next()){
            productos.add(new Producto(resultado.getInt("product_id"),
                    resultado.getString("product_name"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("category_id")));
        }
        return productos;
    }

    public List<Empleado2> obtenerEmpleado2() throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        ResultSet resultado;
        String sql = "SELECT employee_id, first_name, birth_date, city FROM employees";
        List<Empleado2> empleados = new ArrayList<>();
        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        resultado = sentencia.executeQuery();
        while (resultado.next()){
            empleados.add(
                    new Empleado2(
                            resultado.getInt("employee_id"),
                            resultado.getString("first_name"),
                            resultado.getDate("birth_date").toLocalDate(),
                            resultado.getString("city")
                    )
            );
        }
        return empleados;
    }
}
