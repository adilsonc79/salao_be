package controller;

import Dao.AgendaDao;
import model.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaDao agendaDao;

    @PostMapping("/cadastroAg")
    public void cadastrarAgenda(@RequestBody Agenda agenda){
        agendaDao.cadastrarAgenda(agenda);
    }

    @GetMapping("/listaAg")
    public List<Agenda> listarAgenda(){
        return agendaDao.listarAgenda();
    }

    @PutMapping("/atualizarAg")
    public Agenda atualizarAgenda(@RequestBody Agenda agenda){
        return agendaDao.atualizarAgenda(agenda);
    }

    @DeleteMapping("/excluirAg/{id_cliente}")
    public Agenda excluirAgenda(@PathVariable("id_agenda") Integer id_cliente){
        return agendaDao.excluirAgenda(id_cliente);
    }


}
