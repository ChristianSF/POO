package Trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ArrayList<Motorista> motoristas = new ArrayList();
        ArrayList<Veiculo> veiculos = new ArrayList();
        ArrayList<Multa> multas = new ArrayList();
        
        Scanner ler = new Scanner(System.in);
       
        
        
        Motorista motorista = new  Motorista("Christian", "Freitas", "123456", "55", "tarde", 555555);
        Motorista motorista1 = new  Motorista("Christia", "Freitas", "126", "55", "tarde", 555555);
        Motorista motorista2 = new  Motorista("Christi", "Freitas", "456", "55", "tarde", 555555);
        Motorista motorista3 = new  Motorista("Chri", "Freitas", "1256", "55", "tarde", 555555);
        motoristas.add(motorista);
        motoristas.add(motorista1);
        motoristas.add(motorista2);
        motoristas.add(motorista3);
        
        Veiculo veiculo = new Veiculo("Ford", "VHG-5555", "Carro", "123456");
        veiculos.add(veiculo);
        
        while(true){
            System.out.println("========Menu========");
            System.out.println("1- Mostrar veículos");
            System.out.println("2- Mostrar motoristas");
            System.out.println("3- Mostrar multas");
            System.out.println("4- Inserir Veiculos");
            System.out.println("5- Inserir Motorista");
            System.out.println("6- Inserir Multa");
            System.out.println("0 - Sair");
            System.out.println("\n");
            System.out.println("- Digite a opção que deseja entrar");
            int entrada = ler.nextInt();
            if(entrada == 0) {
                break;
            }
            else if(entrada == 1) {
                int i = 0;
                for(Veiculo v: veiculos) {
                    System.out.println("----- Veiculo N°: " + (i+1) + "-----");
                    System.out.println("Tipo: " + v.getTipo());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Motorista: " + v.getCpf_motorista());
                    System.out.println("\n");
                    i++;
                }
                System.out.println("Número de Veiculos cadastrados: " + i);
                System.out.println("\n");
            }
            else if(entrada == 2) {
                int i = 0;
                for(Motorista m: motoristas) {
                    System.out.println("----- Motorista N°: " + (i+1) + "-----");
                    System.out.println("Nome: " + m.getNome() + " " + m.getSobrenome());
                    System.out.println("Data de Nascimento: " + m.getDdn());
                    System.out.println("Cpf: " + m.getCPF());
                    System.out.println("Turno: " + m.getTurno());
                    System.out.println("Número celular: " + m.getNum_celular());
                    System.out.println("\n");
                    i++;
                }
                System.out.println("Número de Motoristas cadastrados: " + i);
                System.out.println("\n");
            }
            else if(entrada == 3) { 
                for(Multa mu: multas) {
                    System.out.println(mu);
                }
            }
            
            else if(entrada == 5) {
                System.out.println("Digite o nome do motorista:");
                String nome = ler.next();
                System.out.println("Digite o sobrenome do motorista: ");
                String sobrenome = ler.next();
                System.out.println("Digite o CPF do motorista: ");
                String CPF = ler.next();
                System.out.println("Digite a data de nascimento do motorista:");
                String ddn = ler.next();
                System.out.println("Digite o turno:");
                String turno = ler.next();
                System.out.println("Digite o número de celular: ");
                int num_celular = ler.nextInt();
                
                Motorista insere_motorista = new  Motorista(nome, sobrenome, CPF, ddn, turno, num_celular);
                motoristas.add(insere_motorista);
                
                System.out.println("Motorista cadastrado com sucesso!");
            }
        }
    }
}
