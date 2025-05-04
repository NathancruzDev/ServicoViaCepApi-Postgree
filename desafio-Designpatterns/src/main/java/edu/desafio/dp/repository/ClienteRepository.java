package edu.desafio.dp.repository;

import edu.desafio.dp.model.ClienteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Long> {
    List<ClienteModel> findByEnderecoCep(String cep);
}
