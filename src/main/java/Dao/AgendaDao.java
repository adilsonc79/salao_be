package Dao;

import model.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AgendaRepository;

import java.util.List;

public class AgendaDao {

    @Autowired
    private AgendaRepository agendaRepository;

    public void cadastrarAgenda(Agenda agenda ){
        Agenda agendaBD = agendaRepository.save(agenda);

    }

    public List<Agenda> listarAgenda(){
        return agendaRepository.findAll();
    }

    public Agenda atualizarAgenda(Agenda agenda){

        return agendaRepository.saveAndFlush(agenda);
    }

    public Agenda excluirAgenda(int id_agenda){
        Agenda agenda = agendaRepository.findById(id_agenda).get();
        agendaRepository.delete(agenda);
        return agenda;
    }
}
