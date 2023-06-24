package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;

    private String nome;
    private String telefone;
    private String email;

    @Temporal(TemporalType.DATE)
    private Date data_aniversario=new Date();

    @Temporal(TemporalType.DATE)
    private Date data_cadastro=new Date();


}


