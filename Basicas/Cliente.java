package basicas;
import auxiliares.Evento;
import java.util.Date;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private double saldo;
    ArrayList<Evento> reservas;

    public Cliente(String nome, Date dataNasc, String cpf) {
        super(nome, dataNasc, cpf);
        this.saldo = 0;
    }

    public void fazReserva(Evento event){
        if(!event.isFull){
            if(saldo >= event.valorIngresso){
                reservas.add(event);
                saldo -= event.valorIngresso;
            }
        }
    }
}
