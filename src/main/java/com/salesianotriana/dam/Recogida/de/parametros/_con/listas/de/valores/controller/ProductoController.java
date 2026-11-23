package com.salesianotriana.dam.Recogida.de.parametros._con.listas.de.valores.controller;

import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@RestController
@Validated
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @GetMapping("/BuscarNombre")
    public ResponseEntity<Page<ProductoDTO>> buscarPorNombre(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String Apple,
            @RequestParam(required = false) String HP,
            @RequestParam(required = false) String Lenovo) {
        List<String> marcas = Stream.of(Apple, HP, Lenovo)
                .filter(Objects::nonNull)
                .toList();
        return ResponseEntity.ok(productoService.buscar(nombre, marcas));
    }

}
