package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "servico")
@Data
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_servico;
    private int id_agenda;
    private String servico;
    private String colaborador;
    private String produto;
    private float precoProduto;
    private float precoServico;
    private double precoTotal; // ??? é double???
    private String observacao;

    @Temporal(TemporalType.DATE)
    private Date dataHora= new Date();

    private String hora;


    /*
    public int getId_servico() {
        return id_servico;
    }
    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }
    public int getId_agenda() {
        return id_agenda;
    }
    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public String getColaborador() {
        return colaborador;
    }
    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public float getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }
    public float getPrecoServico() {
        return precoServico;
    }
    public void setPrecoServico(float precoServico) {
        this.precoServico = precoServico;
    }
    public double getPrecoTotal() {
        return precoTotal;
    }
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;

    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Date getDataHora() {
        return dataHora;
    }
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }*/

}


