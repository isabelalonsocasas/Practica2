package com.example.demo.model.modelo;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class controladorRest {

    @RestController
    public static class ControladorRest {
        private final Map<String, Carrito> carritos = new HashMap<>();


        @PostMapping("/api/carrito")
        @ResponseStatus(HttpStatus.CREATED)
        public Carrito crea(@Valid @RequestBody Carrito carritoNuevo) {
            carritos.put(carritoNuevo.idCarrito(), carritoNuevo);
            return carritoNuevo;
        }

        @GetMapping("/api/carrito")
        public Collection<Carrito> obtenerTodos() {
            return carritos.values();
        }

        @GetMapping("/api/carrito/{idCarrito}")
        public Carrito obtener(@PathVariable String idCarrito) {
            return carritos.get(idCarrito);
        }

        @PutMapping("/api/carrito/{idCarrito}/unidades/{unidades}")
        public Carrito actualizaUnidades(@PathVariable String idCarrito,
                                         @PathVariable Integer unidades) {

            Carrito carritoActual = carritos.get(idCarrito);

            Carrito carritoActualizado =
                    new Carrito(
                            carritoActual.idCarrito(),
                            carritoActual.idArticulo(),
                            carritoActual.descripcion(),
                            unidades
                    );

            carritos.put(idCarrito, carritoActualizado);

            return carritoActualizado;
        }

        @DeleteMapping("/api/carrito/{idCarrito}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void elimina(@PathVariable String idCarrito) {
            carritos.remove(idCarrito);
        }

    }
}
