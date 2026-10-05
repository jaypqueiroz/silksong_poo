package br.com.silksong_poo;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG");
        System.out.println("      edicao POO em Java");
        System.out.println("=================================");
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        System.out.println("Carregando save de " + nome + "...\n");
    }
}
