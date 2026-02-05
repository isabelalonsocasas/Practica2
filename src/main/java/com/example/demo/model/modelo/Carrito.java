package com.example.demo.model.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Random;

public record Carrito(

        @NotBlank
        String idCarrito,

        @NotBlank
        String idArticulo,

        @NotBlank
        String descripcion,

        @NotNull
        Integer unidades,

        Double precioFinal

) {

    // Constructor para precio
    public Carrito {
        int precioUnitario = new Random().nextInt(50) + 1; // 1..50
        precioFinal = (double) (unidades * precioUnitario);
    }

    public Carrito(String idCarrito,
                   String idArticulo,
                   String descripcion,
                   Integer unidades) {
        this(idCarrito, idArticulo, descripcion, unidades, null);
    }
}






