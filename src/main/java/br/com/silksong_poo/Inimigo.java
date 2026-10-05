package br.com.silksong_poo;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString 
public class Inimigo {
    private final static int MAXIMO_VIDA = 20;
    private final static int MINIMO_VIDA = 1;
    private final static int PADRAO_VIDA = 10;
    private final static int MAXIMO_DANO = 2;
    private final static int MINIMO_DANO = 1;
    private final static int PADRAO_DANO = 1;
    private String nome;
    private int vida;
    private int dano;

    Inimigo(String nome, int vida, int dano){
        if(vida < MINIMO_VIDA || vida > MAXIMO_VIDA){
            this.vida = PADRAO_VIDA;
        }
        else{
            this.vida = vida;
        }
        if(dano < MINIMO_DANO || dano > MAXIMO_DANO){
            this.dano = PADRAO_DANO;
        }
        else{
            this.dano = dano;
        }
        this.nome = nome;
    }
    Inimigo(String nome){
        this(nome,PADRAO_VIDA,PADRAO_DANO);
    }
    void receberGolpe(){
        vida = Math.max(vida-1,0);
        System.out.println(nome+" recebeu 1 de dano.");
    }
    boolean estaDerrotado(){
        return vida == 0;
    }
}
