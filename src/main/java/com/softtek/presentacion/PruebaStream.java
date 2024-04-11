package com.softtek.presentacion;

import com.softtek.modelo.EjerciciosStream;
import com.softtek.persistencia.AccesoEmpleado;
import com.softtek.persistencia.AccesoStream;
import com.softtek.persistencia.Conexion;

import java.sql.SQLException;

public class PruebaStream {

    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        AccesoStream as = new AccesoStream();
        EjerciciosStream es = new EjerciciosStream();
        try{
            System.out.println("1");
            es.metodo1(as.obtenerProductos(),2);
            System.out.println("2");
            es.metodo2(as.obtenerProductos());
            System.out.println("3");
            es.metodo3(as.obtenerProductos());
            System.out.println("4");
            es.metodo4(as.obtenerProductos());
            System.out.println("5");
            es.metodo5(as.obtenerProductos());
            System.out.println("6");
            es.metodo6(as.obtenerEmpleado2());
            System.out.println("7");
            es.metodo7(as.obtenerProductos());
            System.out.println("8");
            es.metodo8(as.obtenerEmpleado2());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
