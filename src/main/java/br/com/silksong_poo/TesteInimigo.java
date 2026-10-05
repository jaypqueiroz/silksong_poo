package br.com.silksong_poo;

public class TesteInimigo {
    public static void main(String[] args) {
        var inimigo1 = new Inimigo("Moss Mother",12,1);
        var inimigo2 = new Inimigo("Besouro Peregrino");
        var inimigo3 = new Inimigo("Inimigo Bugado",50,7);
        System.out.println(inimigo1);
        System.out.println(inimigo2);
        System.out.println(inimigo3);
        while(!inimigo2.estaDerrotado()){
            inimigo2.receberGolpe();
        }
        System.out.println(inimigo2);
        System.out.println("Derrotado? " +inimigo2.estaDerrotado());
    }
}
