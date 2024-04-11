package com.softtek.presentacion;

import com.softtek.modelo.Empleado;
import com.softtek.persistencia.AccesoEmpleado;
import com.softtek.persistencia.Conexion;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        AccesoEmpleado ap= new AccesoEmpleado();
        try{
            System.out.println(ap.obtenerTodos());;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            System.out.println("Introduzca id del empleado");
            System.out.println(ap.obtenerUno(sc.nextInt()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /*
        try{
            Empleado i= new Empleado();
            System.out.println("Introduzca id del empleado a insertar");
            i.setIdEmpleado(sc.nextInt());
            System.out.println("Introduzca nombre del empleado a insertar");
            i.setNombre(sc.next());
            System.out.println("Introduzca apellido del empleado a insertar");
            i.setApellidos(sc.next());
            System.out.println("Introduzca jefe del empleado a insertar");
            i.setJefe(sc.nextInt());
            ap.insertarEmpleado(i);
            ap.obtenerTodos();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try{
            Empleado u= new Empleado();
            System.out.println("Introduzca id del empleado a modificar");
            u.setIdEmpleado(sc.nextInt());
            System.out.println("Introduzca nombre del empleado a modificar");
            u.setNombre(sc.next());
            System.out.println("Introduzca apellido del empleado a modificar");
            u.setApellidos(sc.next());
            System.out.println("Introduzca jefe del empleado a modificar");
            u.setJefe(sc.nextInt());
            ap.modificarEmpleado(u);
            ap.obtenerTodos();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         */
        try{
            System.out.println("Introduzca id del empleado a borrar");
            ap.borrarEmpleado(sc.nextInt());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
