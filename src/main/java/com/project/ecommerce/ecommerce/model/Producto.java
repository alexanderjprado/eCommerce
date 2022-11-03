package com.project.ecommerce.ecommerce.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Producto {

    private Integer id;
    private String name;
    private String descripcion;
    private String image;
    private Double precio;
    private Integer cantidad;

    public Producto() {

    }

    public Producto(Integer id, String name, String descripcion, String image, Double precio, Integer cantidad) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.image = image;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
