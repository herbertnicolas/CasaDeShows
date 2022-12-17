package Basicas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        while(true){
            System.out.println("Bem-vindo! Qual o tipo de usuário deseja cadastrar no banco de dados? \n1 - Cliente \n2 - Funcionario \n3 - Finalizar e listar cadastrados\n");
            int op = in.nextInt();

            if (op == 1) { // é cliente

                System.out.println("Qual o nome do cliente?"); 
                String nome = in.next();
                
                System.out.println("Agora digite sua data de nascimento no formato 'dd-MMM-yyyy':");

                String data = in.next();
                
                //pra convertendo de string pra date
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                Date date = null; 
                try{
                    date = dateFormat.parse(data);
                }catch(ParseException e){
                    e.printStackTrace();
                }

                System.out.println("Digite agora o seu CPF:");
                String cpf = in.next();
                Cliente c = new Cliente(nome, date, cpf);
                
                clientes.add(c);

            } else if (op == 2) {
                
                System.out.println("Ok. Qual o nome do cliente?");
                String nome = in.next();
                
                System.out.println("Agora digite sua data de nascimento no formato 'dd-MMM-yyyy':");
                
                String data = in.next();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                Date date = null; 
                try{
                    date = dateFormat.parse(data);
                }catch(ParseException e){
                    e.printStackTrace();
                }

                System.out.println("Digite agora o seu CPF:");
                String cpf = in.next();

                Funcionario f = new Funcionario(nome, date, cpf);
                funcionarios.add(f);

            } else if (op == 3) {
                for (int i = 0; i < clientes.size(); i++) {
                    System.out.printf("Cliente --- -  Nome: %s , Aniversário: %tB %<te %<tY , CPF: %s \n", clientes.get(i).nome,
                            clientes.get(i).dataNasc, clientes.get(i).cpf);
                }
                for (int i = 0; i < funcionarios.size(); i++) {
                    System.out.printf("Funcionario - Nome: %s , Aniversário: %tB %<te %<tY , CPF: %s \n", funcionarios.get(i).nome,
                            funcionarios.get(i).dataNasc, funcionarios.get(i).cpf);
                }
                break;
            }
        }
    }
}
