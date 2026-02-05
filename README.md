# Práctica2 – Carrito

## Descripción

En esta práctica se ha desarrollado una **API** que implementa la clase **Carrito**.

Cada carrito contiene **un único producto**.

## Funciones

La aplicación permite:

- Crear un carrito.
- Obtener un carrito por su identificador.
- Obtener todos los carritos.
- Actualizar el número de unidades de un carrito.
- Eliminar un carrito.

El precio final del carrito se **calcula automáticamente** en función del número de unidades y un precio unitario aleatorio.

## Clase carrito

La **Carrito** contiene los siguientes campos:

- `idCarrito`: identificador único del carrito.
- `idArticulo`: identificador del artículo.
- `descripcion`: descripción del artículo.
- `unidades`: número de unidades del artículo.
- `precioFinal`: importe final del carrito (calculado automáticamente).

Se han utilizado **validaciones** (`@NotBlank`, `@NotNull`).

## Endpoints principales

- `POST /api/carrito` → Crear un carrito
- `GET /api/carrito/{idCarrito}` → Obtener un carrito
- `GET /api/carrito` → Obtener todos los carritos
- `PUT /api/carrito/{idCarrito}/unidades/{unidades}` → Actualizar unidades
- `DELETE /api/carrito/{idCarrito}` → Eliminar carrito

La aplicación utiliza un `HashMap` para guardar los diferentes carritos.
