package basicas;
import auxiliares.*;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario extends Pessoa{
    //CADA funcionario tera um ArrayList de eventos criados por ele
    //a ideia é depois juntar todos os ArrayList dos funcionarios em um só ArrayList na classe CasaDeShows 
    //dar sort() por data e mostrar ao usuario
    
    public Funcionario(String nome, Date dataNasc, String cpf){
        super(nome, dataNasc, cpf);
    }

    public void criaEvento(String n, String g, Date d, int c, double v){
        Evento e = new Evento(n,g,d,c,v);
        listaEventos.add(e);
    }

    public void alteraEvento(String n, String g, Date d, int c, double v){

    }
}
