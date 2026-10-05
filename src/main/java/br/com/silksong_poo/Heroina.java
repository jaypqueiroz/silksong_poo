package br.com.silksong_poo;

import lombok.Getter;

@Getter 
public class Heroina {
    private final static int MAXIMO_MASCARAS = 5;
    private final static int PADRAO_MASCARAS = 5;
    private final static int MINIMO_MASCARAS = 0;
    private final static int MAXIMO_SEDA = 9;
    private final static int PADRAO_SEDA = 0;
    private final static int MINIMO_SEDA = 0;
    private String nome;
    private int mascaras;
    private int seda;

    public Heroina(String nome){
        this.nome = nome;
        mascaras = PADRAO_MASCARAS;
        seda = PADRAO_SEDA;
    }
    
    public void atacar(){
        System.out.println(nome+"  ataca com a agulha!");
        seda = Math.min(seda+1, MAXIMO_SEDA);
    }
    public void atacar(int vezes){
        int i = 0;
        while (i < vezes) {
            atacar();
            i++;
        }
    }
    public void receberDano(int dano){
        System.out.println(nome+" recebeu "+dano+" de dano.");
        if(mascaras<=dano){
            mascaras = MINIMO_MASCARAS;
            estaDerrotada();
        }
        else{
            mascaras = mascaras - dano;
        }
    }
    public void curar(){
        if(seda == MAXIMO_SEDA){
            mascaras = mascaras <= 2 ? mascaras + 3 : MAXIMO_MASCARAS;
            seda = MINIMO_SEDA;
            System.out.println(nome + " se amarrou com seda e recuperou mascaras.");
        }
        else{
            System.out.println(nome + " nao tem seda suficiente para se curar.");
        }
    }
    public boolean estaDerrotada(){
        return mascaras == MINIMO_MASCARAS;
    }

    @Override 
    public String toString(){
        return String.format("%s | Mascaras: %d/%d | Seda: %d/%d", nome, mascaras, MAXIMO_MASCARAS, seda
, MAXIMO_SEDA);
    }
}