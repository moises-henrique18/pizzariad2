package com.itb.inf2dm.pizzariad2.controller;

import com.itb.inf2dm.pizzariad2.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();

    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabresa");
        p1.setDescricao("Calabresa com cebola");
        p1.setValorVenda(20.00);

        // Crie mais um e adicione a lista de produtos

        // Adicionando o produto à lista

        produtos.add(p1);
        return produtos;
    }

}
