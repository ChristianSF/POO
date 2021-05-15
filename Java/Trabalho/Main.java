package Trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ArrayList<Motorista> motoristas = new ArrayList();
        ArrayList<Veiculo> veiculos = new ArrayList();
        ArrayList<Multa> multas = new ArrayList();
        
        Scanner ler = new Scanner(System.in);
        
        Motorista motorista = new  Motorista("Gabriel", "Vasconcelos", "123456", "55", "tarde", 555555);
        Motorista motorista1 = new  Motorista("Gabrie", "Vasco", "126", "55", "dia", 555555);
        Motorista motorista2 = new  Motorista("Ga", "Celos", "456", "55", "tarde", 555555);
        Motorista motorista3 = new  Motorista("Briel", "Vasconcelos", "1256", "55", "noite", 555555);
        motoristas.add(motorista);
        motoristas.add(motorista1);
        motoristas.add(motorista2);
        motoristas.add(motorista3);
        
        Automovel automovel = new Automovel("Ford", "VHG-5555", "123456");
        veiculos.add(automovel);
        
        Multa multa = new Multa("Transito", (float)58.0, "123456", "VHG-5555");
        multas.add(multa);
        
        while(true){
            System.out.println(" _________Menu_________ ");
            System.out.println("|1- Mostrar veículos   |");
            System.out.println("|2- Mostrar motoristas |");
            System.out.println("|3- Mostrar multas     | ");
            System.out.println("|4- Inserir Veiculos   |");
            System.out.println("|5- Inserir Motorista  |");
            System.out.println("|6- Inserir Multa      |");
            System.out.println("|0- Sair               |");
            System.out.println(" ----------------------");
            System.out.println("\n");
            System.out.println("- Digite a opção que deseja entrar");
            int entrada = ler.nextInt();
            
            if(entrada == 0) {
                System.out.println("Saindo do sistema!");
                break;
            }
            else if(entrada == 1) {
                int i = 0;
                for(Veiculo v: veiculos) {
                    System.out.println("----- Veiculo N°: " + (i+1) + "-----");
                    System.out.println("Tipo: " + v.getTipo());
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Placa: " + v.getPlaca());
                    for(Motorista m: motoristas) {
                        if(v.getCpf_motorista().equalsIgnoreCase(m.getCPF())) {
                            System.out.println("Motorista: " + m.getNome() + " " + m.getSobrenome());
                            System.out.println("CPF: " + v.getCpf_motorista());
                        }
                    }
                    
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
                int i = 0;
                for(Multa mu: multas) {
                    System.out.println("-----Multa N°: " +(i+1) + "-----");
                    System.out.println("Tipo de multa: " +mu.getTipo());
                    System.out.println("Valor da multa: R$" + mu.getValor());
                    for(Motorista m: motoristas) {
                        if(mu.getCpf().equals(m.getCPF())){
                            System.out.println("Motorista: " + m.getNome() + " " + m.getSobrenome());
                            System.out.println("CPF: " + mu.getCpf());
                        }
                    }
                   
                    for(Veiculo v: veiculos) {
                        if(mu.getPlaca().equalsIgnoreCase(v.getPlaca())) {
                            System.out.println("Placa: " + mu.getPlaca());
                        }
                    }
                    i++;
                    System.out.println("\n");
                }
                System.out.println("Número de Multas cadastrados: " + i);
            }
            
            else if(entrada == 4) {
                System.out.println("Digite o tipo do veiculo (Automovel, Moto, Caminhão): ");
                String tipo = ler.next();
                System.out.println("Digite a marca do veiculo: ");
                String marca = ler.next();
                System.out.println("Digite a placa: ");
                String placa = ler.next();
                System.out.println("Digite o CPF do motorista: ");
                String cpf = ler.next();
                
                if(tipo.equalsIgnoreCase("automovel")) {
                    Automovel insere_automovel = new Automovel(marca, placa, cpf);
                    veiculos.add(insere_automovel);
                    
                    System.out.println("Automóvel Cadastrado com sucesso!");
                    System.out.println("\n");
                }
                
                else if(tipo.equalsIgnoreCase("moto")) {
                
                    Moto insere_moto = new Moto(marca, placa, cpf);
                    veiculos.add(insere_moto);
                    
                    System.out.println("Moto cadastrada com sucesso!");
                    System.out.println("\n");
                }
                
                else if(tipo.equalsIgnoreCase("Caminhão")) {
                    Caminhao insere_caminhao = new Caminhao(marca, placa, cpf);
                    veiculos.add(insere_caminhao);
                    
                    System.out.println("Caminhão cadastrado com sucesso!");
                    System.out.println("\n");
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
                System.out.println("\n");
            }
            
            else if(entrada == 6) {
                System.out.println("Digite o tipo da multa: ");
                String tipo = ler.next();
                System.out.println("Digite o valor da multa: ");
                float valor = ler.nextFloat();
                System.out.println("Digite o cpf do motorista: ");
                String cpf = ler.next();
                System.out.println("Digite a placa do carro: ");
                String placa = ler.next();
                
                Multa insere_multa = new Multa(tipo, valor, cpf, placa);
                multas.add(insere_multa);
                
                System.out.println("Multa cadastrada com sucesso!");
                System.out.println("\n");
            }
        }
    }
}
