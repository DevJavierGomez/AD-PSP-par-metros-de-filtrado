package com.salesianotriana.dam.Recogida.de.parametros._con.listas.de.valores.config;

import com.salesianotriana.dam.Recogida.de.parametros._con.listas.de.valores.model.Producto;
import com.salesianotriana.dam.Recogida.de.parametros._con.listas.de.valores.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeed implements CommandLineRunner {
    private final ProductoRepository productoRepository;

    public DataSeed(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    @Override public void run(String... args)
                throws Exception { if (productoRepository.count() == 0) { List.of(
                new Producto("MacBook Pro 16", 2499.99, "Apple"),
                new Producto("iPhone 15 Pro", 1199.00, "Apple"),
                new Producto("Pavilion 15", 749.99, "HP"),
                new Producto("OMEN 16 Gaming", 1599.00, "HP"),
                new Producto("ThinkPad X1 Carbon", 1899.00, "Lenovo"),
                new Producto("Legion Pro 5", 1450.00, "Lenovo")
            );
            productoRepository.saveAll(productos);
        }
    }
}