package com.example.deloitte.controller;

import com.example.deloitte.model.entity.Livro;
import com.example.deloitte.repository.LivroRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@AllArgsConstructor
public class LivroController {

    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> listarLivros() {
       return livroRepository.findAll();
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @DeleteMapping("/{id}")
    public void removerLivro(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }
}
