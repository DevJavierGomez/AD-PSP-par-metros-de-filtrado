package com.salesianotriana.dam.Recogida.de.parametros._con.listas.de.valores.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.web.PageableDefault;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("api/v1/marca")
@RequiredArgsConstructor
public class MarcaController {

    @GetMapping("/productos")
    public String filtrarProductos(
            @RequestParam MultiValueMap<String, String> queryParams,
            @PageableDefault(size = 10) Pageable pageable) {
        List<String> marcas = queryParams.get("marcas");
        System.out.println("Marcas recibidas: " + marcas);
        return "Filtros recibidos";
    }

}
