package edu.desafio.dp.repository;

import edu.desafio.dp.model.EnderecoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<EnderecoModel, String> {
}
