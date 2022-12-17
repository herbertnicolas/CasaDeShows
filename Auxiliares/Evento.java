package auxiliares;

import java.util.ArrayList;
import java.util.Date;
import basicas.Cliente;

public class Evento {
    public String nomeEvento;
    String genero;
    Date dataEvento;
    int capacidade;
    public double valorIngresso;
    ArrayList<Cliente> participantes;
    public boolean isFull;

    public Evento(String n, String g, Date d, int c, double v){
        this.nomeEvento = n;
        this.genero = g;
        this.dataEvento = d;
        this.capacidade = c;
        this.valorIngresso = v;
    }
}
