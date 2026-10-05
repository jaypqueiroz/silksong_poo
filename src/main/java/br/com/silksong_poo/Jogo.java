package br.com.silksong_poo;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) throws Exception{
        System.out.println("=================================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG");
        System.out.println("      edicao POO em Java");
        System.out.println("=================================");
        System.out.println("Carregando save...\n");
        var heroina = new Heroina("Hornet");
        System.out.println(heroina);

        var inimigo = new Inimigo("Moss Mother", 12, 1);
        Scanner leitor = new Scanner(System.in);
        int turno = 1;
        boolean fugiu = false;
        while(!fugiu && !inimigo.estaDerrotado() && !heroina.estaDerrotada()){
            
            System.out.println("========== Turno " +turno+ " ==========");
            System.out.println(heroina);
            System.out.println(inimigo);
            
            System.out.println("1-Atacar 2-Curar 0-Fugir");
            System.out.printf("Escolha: ");
            int escolha = leitor.nextInt();
            switch(escolha){
                case 1:
                heroina.atacar();
                inimigo.receberGolpe();
                break;
                case 2:
                heroina.curar();
                break;
                case 0:
                System.out.println(heroina.getNome()+" fugiu da batalha.");
                fugiu = true;
                break;
                default:
                System.out.println("Opcao invalida.");
                break;
            }
            if(!inimigo.estaDerrotado() && turno%3 == 0 && !fugiu){
                System.out.println(inimigo.getNome()+" ataca!");
                heroina.receberDano(inimigo.getDano());
            }
            if(escolha >= 0 && escolha <= 2) turno++;
            Thread.sleep(1000);
        }
        if(inimigo.estaDerrotado()){
            System.out.println("Vitoria sobre " +inimigo.getNome() + "!");
        }
        else{
            System.out.println("Fim de jogo.");
        }
        System.out.println(heroina);
        
        leitor.close();
    }
}
