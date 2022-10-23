package com.pjem.pessoa.controller;

import com.pjem.pessoa.entity.Pessoa;
import com.pjem.pessoa.service.PessoaService;
import com.pjem.pessoa.DTO.PessoaDTO;
import lombok.AllArgsConstructor;
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
    public PessoaDTO cadastra(@RequestBody @Valid PessoaDTO pessoaDTO){
        return pessoaService.cadastra(pessoaDTO);
    }

    @GetMapping("/pessoa")
    public List<Pessoa> lista(){
        return pessoaService.lista();
    }

    @GetMapping("/pessoa/{id}")
    public Optional<Pessoa> listaUnico(@PathVariable Integer id){
        return pessoaService.listaUnico(id);
    }

    @DeleteMapping("/pessoa/{id}")
    public void apaga(@PathVariable Integer id){
        pessoaService.apaga(id);
    }


 /*   @PutMapping("/pessoa/{id}")
    public PessoaDTO altera(@PathVariable Integer id, @RequestBody PessoaDTO pessoaDTO){
        return pessoaService.altera(id,pessoaDTO);
    }
*/

}
