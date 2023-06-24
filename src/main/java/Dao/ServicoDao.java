package Dao;

import model.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ServicoRepository;

import java.util.List;

@Service
public class ServicoDao {

    @Autowired
    private ServicoRepository servicoRepository;

    public void cadastrarServico(Servico servico){
        Servico servicoBD = servicoRepository.save(servico);
    }

    public List<Servico> listaServico(){

        return servicoRepository.findAll();
    }
     public Servico atualizarServico(Servico servico){
        return servicoRepository.saveAndFlush(servico);
     }

     public Servico excluirServico(int id_servico){
        Servico servico = servicoRepository.findById(id_servico).get();
        return servico;
     }
}
