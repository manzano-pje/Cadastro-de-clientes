package com.pjem.pessoa.service;

import com.pjem.pessoa.DTO.PessoaDTO;
import com.pjem.pessoa.entity.Pessoa;
import com.pjem.pessoa.entity.Teste;
import com.pjem.pessoa.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaDTO cadastra(PessoaDTO pessoaDTO){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaDTO, pessoa);
        pessoaRepository.save(pessoa);
        return pessoaDTO;
    }

    public Optional<Pessoa> listaUnico(Integer id){
        Optional<Pessoa> pessoaCadastro = pessoaRepository.findById(id);
        return pessoaCadastro;
    }

    public List<Pessoa> lista(){
        return pessoaRepository.findAll();
    }

    public void apaga(Integer id){
        pessoaRepository.deleteById(id);

    }

 /*   public PessoaDTO altera(Integer id, PessoaDTO pessoaDTO){
        return PessoaDTO;
    }
*/


}
