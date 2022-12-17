package Basicas;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

abstract class Pessoa{
    String nome;
    Date dataNasc;
    String cpf;

    public Pessoa(String nome, Date dataNasc, String cpf){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date data) {
        this.dataNasc = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}