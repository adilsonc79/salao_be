package controller;

import Dao.ClienteDao;
import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ??? query(S) como implementar
@Controller
@RequestMapping("/cliente") // mapeamento URLs
public class ClienteController {

    @Autowired
    private ClienteDao clienteDao;

    @PostMapping("/cadastroCl") // POST usado em iserções no BD
    public void cadastrarCliente(@RequestBody Cliente cliente){
        System.out.println("entrou");
       clienteDao.cadastrarCliente(cliente);
    }

    @GetMapping("/listaCl") // GET usado em consulta
    public List<Cliente> listarCliente(){
        return clienteDao.listarCliente();
    }

    @PutMapping ("/atualizarCl")
    public Cliente atualizarClinete(@RequestBody Cliente cliente){ // ??@RequestBody ??
        return clienteDao.atualizarCliente(cliente);
    }

    @DeleteMapping("excluirCl/{id_cliente}")
    public Cliente excluirCliente(@PathVariable("id_clinte") Integer id_cliente){
        return clienteDao.excluirCliente(id_cliente);
    }
}
