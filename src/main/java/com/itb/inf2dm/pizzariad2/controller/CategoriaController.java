package com.itb.inf2dm.pizzariad2.controller;

import com.itb.inf2dm.pizzariad2.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    List<Categoria> categoria = new ArrayList<Categoria>();

    @GetMapping
    public List<Categoria> findAll() {

        Categoria c1 = new Categoria();
        c1.setDescricao("Tamanho da pizza");
        c1.setNome("Tamanho");


        categoria.add(c1);
        return categoria;

    }
}