package edu.desafio.dp.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;
    @Column(nullable = false ,length = 8)
    private String password;
    @Autowired
    @ManyToOne
    private EnderecoModel endereco;

    public ClienteModel(){
        super();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }
}
