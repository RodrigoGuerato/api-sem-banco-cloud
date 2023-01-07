package br.com.edusync.api.controllers;

import br.com.edusync.api.models.Pessoa;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {
    @ApiOperation(value = "Listar Pessoas", notes = "Lista todas as pessoas")
    @GetMapping
    public ResponseEntity<List<Pessoa>> listarTodos() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @ApiOperation(value = "Incluir Pessoa", notes = "Adiciona uma nova pessoa na lista")
    @PostMapping()
    public ResponseEntity<Pessoa> incluir(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(new Pessoa());
    }
    @ApiOperation(value = "Alterar Pessoa", notes = "Modifica dados de uma pessoa da lista")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Pessoa> alterar(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(new Pessoa());
    }

    @ApiOperation(value = "Deletar Pessoa", notes = "Remove uma pessoa da lista")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        return ResponseEntity.ok(new String());
    }
    @ApiOperation(value = "Consultar Pessoa", notes = "Recupera uma pessoa da Lista")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> buscaPorID(@PathVariable Long id) {
        return ResponseEntity.ok(new Pessoa());
    }

}

