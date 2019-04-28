package com.curso.springboot.services;

import com.curso.springboot.domain.Categoria;
import com.curso.springboot.repository.CategoriaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id){
        Optional<Categoria> obj = categoriaRepository.findById(id);
        //return obj.orElse(null);
        return obj.orElseThrow(() -> new ObjectNotFoundException(Categoria.class,
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
