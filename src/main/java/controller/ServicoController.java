package controller;

import Dao.ServicoDao;
import model.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    private ServicoDao servicoDao;

    @PostMapping("/cadastroSr")
    public void cadastrarServico(@RequestBody Servico servico){
        servicoDao.cadastrarServico(servico);
    }

    @GetMapping("/listaSr")
    public List<Servico> listarServico(){
        return servicoDao.listaServico();
    }

    @PutMapping("/atualizaSr")
    public Servico atualizarServico(@RequestBody Servico servico){
        return servicoDao.atualizarServico(servico);
    }

    @DeleteMapping("/excluirSr/{id_servico}")
    public Servico excluirServico(@PathVariable ("id_servico") Integer id_servico){
        return servicoDao.excluirServico(id_servico);
    }
}
