package com.curso.springboot;

import com.curso.springboot.domain.Categoria;
import com.curso.springboot.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

    @Autowired
    CategoriaRepository categoriaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");
        Categoria cat3 = new Categoria(null, "Cama");

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
