package edu.desafio.dp.service;

import edu.desafio.dp.model.ClienteModel;
import edu.desafio.dp.model.EnderecoModel;
import edu.desafio.dp.repository.ClienteRepository;
import edu.desafio.dp.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteEnderecoImplementacao implements ClienteService {


    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;
    private final EnderecoService enderecoService;

    @Autowired
    public ClienteEnderecoImplementacao(
            ClienteRepository clienteRepository,
            EnderecoRepository enderecoRepository,
            EnderecoService enderecoService) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.enderecoService = enderecoService;
    }


    @Override
    public Iterable<ClienteModel> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public ClienteModel buscarPorId(Long id) {
        Optional<ClienteModel> cliente= clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(ClienteModel cliente) {
        salvarClienteComCep(cliente);

    }

    @Override
    public void atualizar(Long id, ClienteModel cliente) {
        Optional<ClienteModel> clienteSGBD=clienteRepository.findById(id);
        if(!clienteSGBD.isEmpty()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
    clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(ClienteModel cliente){
        String cep= cliente.getEndereco().getCep();
        EnderecoModel endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            EnderecoModel novoEndereco = enderecoService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
