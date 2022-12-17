package Auxiliares;

import java.util.ArrayList;
import java.util.Date;
import Basicas.Cliente;

public class Evento {
    String evento;
    String genero;
    Date dataEvento;
    int capacidade;
    public double valorIngresso;
    ArrayList<Cliente> participantes;
    public boolean isFull;
}
