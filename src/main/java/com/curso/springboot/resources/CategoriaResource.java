package com.curso.springboot.resources;

import com.curso.springboot.domain.Categoria;
import com.curso.springboot.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){

        Categoria categoria = categoriaService.find(id);
        return ResponseEntity.ok().body(categoria);

//        Categoria cat1 = new Categoria(1, "Informática");
//        Categoria cat2 = new Categoria(2, "Escritório");
//
//        List<Categoria> lista = new ArrayList<>();
//        lista.add(cat1);
//        lista.add(cat2);
//
//        return lista;
//        return "Rest está funcionando";
    }
}
