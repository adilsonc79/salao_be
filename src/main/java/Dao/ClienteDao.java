package Dao;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

// ??? método é o correto - qual return é melhor ???
@Service
public class ClienteDao {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente cadastrarCliente(Cliente cliente){ // PUBLIC VOID - DISPENSA RETURN
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarCliente(){
        return clienteRepository.findAll();
    }

    public Cliente atualizarCliente(Cliente cliente){
        return clienteRepository.saveAndFlush(cliente);
    }

    public Cliente excluirCliente(int id_cliente){
        Cliente cliente = clienteRepository.findById(id_cliente).get();
        clienteRepository.delete(cliente);
        return cliente;
    }
    //??? conferir o método

    public String nomeCliente(int id_cliente) {
        Optional<Cliente> nome = Optional.of(clienteRepository.findById(id_cliente).get());
        if (nome.isPresent()) {
            Cliente cliente = nome.get();
            return cliente.getNome();
        } else {
            return " ";
        }


    }



}
