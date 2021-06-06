package Trabalho;

import java.util.Scanner;

public class Teste {
  
    public static void main(String args[]) {
        
        Sistema sistema = new Sistema();

        Motorista motorista_teste = new Motorista("aaaa", "bbbb", "77", "c", "75", 4);
        sistema.InsereMotorista(motorista_teste);
        
        Automovel automovel_teste = new Automovel("ford", "sei lá", "5");
        sistema.InsereVeiculo(automovel_teste);
        
        Multa multa_teste = new Multa("Alcool", 100, "SP", 15, "77", "sei lá");
        sistema.InsereMulta(multa_teste);
        
        Scanner entrada = new Scanner(System.in);
        
        while(true) {
            System.out.println("\n");
            System.out.println("-------Menu-------");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("0- Sair do sistema");
            System.out.println("1- Inserir Motorista");
            System.out.println("2- Listar motoristas");
            System.out.println("3- Inserir Veiculo");
            System.out.println("4- Listar veiculos");
            System.out.println("5- Inserir multas");
            System.out.println("6- Listar multas");
            System.out.println("Digite a opção: ");
            int a = entrada.nextInt();
            
            if(a == 0) {
                System.out.println("Saindo do sistema");
                break;
            }
            
            else if(a == 1) {
                System.out.println("Digite o nome do motorista: ");
                String nome = entrada.next();
                System.out.println("Digite o sobrenome: ");
                String sobrenome = entrada.next();
                System.out.println("Digite o Id do motorista: ");
                String id = entrada.next();
                System.out.println("Digite a categoria da cnh: ");
                String categoria_cnh = entrada.next();
                System.out.println("Digite a data de nascimento: ");
                String data_nascimento = entrada.next();
                System.out.println("Digite o número de telefone: ");
                int num_telefone = entrada.nextInt();
                    
                Motorista motorista = new Motorista(nome, sobrenome, id, categoria_cnh, data_nascimento, num_telefone);
                sistema.InsereMotorista(motorista);
                System.out.println("Motorista cadastrado com sucesso!");
                System.out.println("\n");
            }
                    
            else if(a == 2){
              System.out.println("Listando motoristas");
              System.out.println("Número de motoristas cadastrados: " + sistema.TamanhoMotorista());
              sistema.ImprimeMotorista();  
            }
                    
            else if(a == 3) {
                System.out.println("Digite a categoria do veiculo (Automovel, Caminhao, Moto):");
                String categoria = entrada.next();
                System.out.println("Digite a placa do veiculo: ");
                String placa = entrada.next();
                System.out.println("Digite a marca do carro: ");
                String marca = entrada.next();
                System.out.println("Digite o id do motorista: ");
                String id_motorista = entrada.next();
                    
                if(categoria.equalsIgnoreCase("automovel")) {
                    Automovel automovel = new Automovel(marca, placa, id_motorista);
                    sistema.InsereVeiculo(automovel);
                }
            }
                   
            else if(a == 4) {
                System.out.println("Listando veiculos: ");
                System.out.println("Número de veiculos cadastrados: "+sistema.TamanhoVeiculo());
                sistema.ImprimeVeiculo();
            }
        
            else if(a == 5) {
                System.out.println("Digite a categoria da multa: ");
                String categoria_mu = entrada.next();
                System.out.println("Digite o preço da multa: ");
                float preco = entrada.nextFloat();
                System.out.println("Digite o ID do motorista: ");
                String id_mot = entrada.next();
                System.out.println("Digite a placa do carro: ");
                String placa_c = entrada.next();
                System.out.println("Digite o local: ");
                String local = entrada.next();
                System.out.println("Digite o número de de pontos na carteira: ");
                int pontos = entrada.nextInt();
                    
                Multa multa = new Multa(categoria_mu, preco, local, pontos, id_mot, placa_c);
                sistema.InsereMulta(multa);
                    
                System.out.println("Multa cadastrada com sucesso!");
                System.out.println("\n");
            }
                    
            else if(a == 6) {
                System.out.println("Listando multas: ");
                System.out.println("Número de multas: " + sistema.TamanhoMulta());
                sistema.ImprimeMulta();
            }
        }
    }
}
