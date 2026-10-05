package br.com.silksong_poo;

public class Heroina {
    private final static int MAXIMO_MASCARAS = 5;
    private final static int PADRAO_MASCARAS = 5;
    private final static int MAXIMO_SEDA = 9;
    private final static int PADRAO_SEDA = 0;
    private String nome;
    private int mascaras;
    private int seda;

    public Heroina(String nome){
        this.nome = nome;
        mascaras = PADRAO_MASCARAS;
        seda = PADRAO_SEDA;
    }

    public String getNome(){
        return nome;
    }
    public int mascaras(){
        return mascaras;
    }
    public int seda(){
        return seda;
    }
    
    @Override 
    public String toString(){
        return String.format("%s | Mascaras: %d/%d | Seda: %d/%d", nome, mascaras, MAXIMO_MASCARAS, seda
, MAXIMO_SEDA);
    }
}