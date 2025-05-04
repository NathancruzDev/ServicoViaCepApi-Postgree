package edu.desafio.dp.repository;

import edu.desafio.dp.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConexaoJpa extends JpaRepository<ClienteModel, Long> {
    List<ClienteModel> findByEnderecoCep(String cep);
}
