package edu.desafio.dp.service;

import edu.desafio.dp.model.EnderecoModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="viacep" ,url="https://viacep.com.br/ws")
public interface EnderecoService {
    @GetMapping("/{cep}/json/")
    EnderecoModel consultarCep(@PathVariable("cep") String cep);
}
