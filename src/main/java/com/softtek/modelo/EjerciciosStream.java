package com.softtek.modelo;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@NoArgsConstructor
public class EjerciciosStream {

    public void metodo1(List<Producto> list, int categoria) {
        Predicate<Producto> fx = e -> e.getCategoria()==categoria;
        list.stream()
                .filter(fx)
                .forEach(System.out::println);
    }

    public void metodo2(List<Producto> list) {
        list.stream()
                .filter(p -> p.getNombreProducto().startsWith("N"))
                .forEach(System.out::println);
    }

    public void metodo3(List<Producto> list) {
        list.stream()
                .sorted(Comparator.comparing(Producto::getNombreProducto))
                .forEach(System.out::println);
    }

    public void metodo4(List<Producto> list) {
        Optional<Producto> productoMaxPrecio = list.stream()
                .max(Comparator.comparing(Producto::getPrecioUnitario));
        productoMaxPrecio.ifPresent(System.out::println);
    }

    public void metodo5(List<Producto> list) {
        Double promedio = list.stream()
                .mapToDouble(Producto::getPrecioUnitario)
                .average()
                .orElse(0.0);
        System.out.println("Promedio de precios: " + promedio);
    }

    public void metodo6(List<Empleado2> list) {
        LocalDate fechaActual = LocalDate.now();
        list.stream()
                .filter(e -> {
                    LocalDate fechaNacimiento = e.getNacimiento();
                    int edad = Period.between(fechaNacimiento, fechaActual).getYears();
                    return edad > 68;
                })
                .forEach(System.out::println);
    }

    public void metodo7(List<Producto> list) {
        Map<Integer, Long> countByCategory = list.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.counting()));
        countByCategory.forEach((categoria, cantidad) -> System.out.println("Categoría: " + categoria + ", Cantidad: " + cantidad));
    }

    public void metodo8(List<Empleado2> list) {
        Set<String> ciudades = list.stream()
                .map(Empleado2::getCiudad)
                .collect(Collectors.toSet());
        ciudades.forEach(System.out::println);
    }





}
