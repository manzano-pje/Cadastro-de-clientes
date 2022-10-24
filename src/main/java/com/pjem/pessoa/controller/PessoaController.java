package com.pjem.pessoa.controller;

import com.pjem.pessoa.entity.Pessoa;
import com.pjem.pessoa.service.PessoaService;
import com.pjem.pessoa.DTO.PessoaDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v01")
public class PessoaController {

    private  PessoaService pessoaService;

    @PostMapping("/pessoa")
    public ResponseEntity<Object> cadastra(@RequestBody @Valid PessoaDTO pessoaDTO){
        return pessoaService.cadastra(pessoaDTO);
    }

    @GetMapping("/pessoa")
    public ResponseEntity<List<Pessoa>> lista(){
        return pessoaService.lista();
    }

    @GetMapping("/pessoa/{id}")
    public ResponseEntity<Object> listaUnico(@PathVariable Integer id){

        return pessoaService.listaUnico(id);
    }

    @DeleteMapping("/pessoa/{id}")
    public ResponseEntity<String> apaga(@PathVariable Integer id){
        return pessoaService.apaga(id);
    }


    @PutMapping("/pessoa/{id}")
    public Object altera(@PathVariable Integer id, @RequestBody PessoaDTO pessoaDTO){
        return pessoaService.altera(id, pessoaDTO);
    }


}
