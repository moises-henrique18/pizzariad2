package com.itb.inf2dm.pizzariad2.model.services;


import com.itb.inf2dm.pizzariad2.model.entity.Produto;
import com.itb.inf2dm.pizzariad2.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Autowired : Injeção de Dependência, ou seja, a referida classe exige o objeto declarado abaixo

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Listar todos os produtos

    public List<Produto> findall() {
        return produtoRepository.findAll();
    }

    // Salvar Produto

    public Produto save(Produto produto) {
        produto.setCodStatus(true);
        return produtoRepository.save(produto);
    }
    // Listar Produto por Id

    public Produto findById(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Produto não encontrado com o id: " + id));
    }

    // Atualizar Produto

    public Produto update(Long id, Produto produto) {
        Produto produtoExistente = findById(id);
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setDescricao(produto.getDescricao());
        produtoExistente.setTipo(produto.getTipo());
        produtoExistente.setValorVenda(produto.getValorVenda());
        produtoExistente.setValorCompra(produto.getValorCompra());
        produtoExistente.setQuantidadeEstoque(produto.getQuantidadeEstoque());
        return produtoRepository.save(produto);
    }

    // Excluir Produto

    public void delete(Long id) {
        Produto produtoExistente = findById(id);
        produtoRepository.deleteById(id);
    }

}
