package com.project.ecommerce.ecommerce.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DetalleOrden {

    private Integer id;
    private String nombre;
    private Double cantidad;
    private Double precio;
    private Double total;

    public DetalleOrden() {

    }

    public DetalleOrden(Integer id, String nombre, Double cantidad, Double precio, Double total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }
}
