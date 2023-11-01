package br.fatecrl.mvcdemo.controllers;

import
        br.fatecrl.mvcdemo.models.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosAPI {

    public List<Produto> produtos = new ArrayList<Produto>();

    public ProdutosAPI() {
        produtos.add(new Produto("222222", "Boneca", 12, 5));
        produtos.add(new Produto("666666", "Mesa", 90, 7));
        produtos.add(new Produto("199999", "blusa", 200, 45));
        produtos.add(new Produto("555555", "calça", 350, 3));
    }

    @GetMapping
    public List<Produto> getProdutos() {
        return produtos;
    }

}
