package br.com.fiap.anime.controller;

import br.com.fiap.anime.model.Obra;
import br.com.fiap.anime.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/obras")
public class ObraController {

    @Autowired
    private ObraRepository repository;

    @GetMapping
    public List<Obra> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Obra cadastrar(@RequestBody Obra obra) {
        return repository.save(obra);
    }

    @PutMapping("/{id}")
    public Obra atualizar(@PathVariable Long id, @RequestBody Obra obra) {
        obra.setId(id);
        return repository.save(obra);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}