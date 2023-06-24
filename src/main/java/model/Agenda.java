package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "agenda")
@Data
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_agenda;
    private int id_cliente;
    private String servico;

    @Temporal(TemporalType.DATE)
    private Date data= new Date();
    private String hora;

    /*
    public int getId_agenda() {
        return id_agenda;
    }
    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }*/

}


