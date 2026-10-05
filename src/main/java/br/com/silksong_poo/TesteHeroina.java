package br.com.silksong_poo;

public class TesteHeroina {
    public static void main(String[] args) {
        var personagem = new Heroina("Hornet");
        System.out.println(personagem);
        personagem.curar();
        personagem.atacar(9);
        System.out.println(personagem);
        personagem.receberDano(4);
        System.out.println(personagem);
        personagem.curar();
        System.out.println(personagem);
        personagem.receberDano(10);
        System.out.println(personagem);
        System.out.println("Derrotada? "+personagem.estaDerrotada());
    }
}
