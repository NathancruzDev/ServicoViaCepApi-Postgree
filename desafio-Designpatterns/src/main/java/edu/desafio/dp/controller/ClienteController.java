package edu.desafio.dp.controller;

import edu.desafio.dp.model.ClienteModel;
import edu.desafio.dp.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<ClienteModel>> buscarTodosUsuariso(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<ClienteModel> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteModel> inserirCliente(@Valid @RequestBody ClienteModel clienteModel){
        clienteService.inserir(clienteModel);
        return ResponseEntity.ok(clienteModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> atualizarCliente(@PathVariable Long id,@RequestBody ClienteModel clienteModel){
        clienteService.atualizar(id,clienteModel);
        return ResponseEntity.ok(clienteModel);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
