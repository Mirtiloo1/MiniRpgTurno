package model;

import java.util.Scanner;

public class Jogador {

    private String nomeJogador;
    private Classes classe;

    public Jogador(String nomeJogador, Classes classe) {
        this.nomeJogador = nomeJogador;
        this.classe = classe;
    }

    public Classes getClasse() {
        return this.classe;
    }

    public void setClasse(Classes classe) {
        this.classe = classe;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "Nome do Jogador: '" + nomeJogador + '\'' +
                ", Classe: " + classe +
                '}';
    }

    public static Jogador criarJogador() {
        Scanner sc = new Scanner(System.in);
        Classes classeEscolhida = null;

        System.out.println("Bem vindo aos campos de batalha Jogador! Como devo chamá-lo?");
        String nomeJogador = sc.nextLine();
        System.out.println("\nOlá " + nomeJogador + "! Antes de iniciar a batalha, escolha sua classe:");

        do{
            System.out.println("1. Mago\n2. Guerreiro");
            int escolha = sc.nextInt();
            if(escolha != 1 && escolha != 2){
                System.out.println("Opção inválida! Tente novamente!");
            }
            switch(escolha){
                case 1:
                    classeEscolhida = Classes.MAGO;
                    System.out.println("Você escolheu a classe Mago!");
                    break;
                case 2:
                    classeEscolhida = Classes.GUERREIRO;
                    System.out.println("Você escolheu a classe Guerreiro!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while(classeEscolhida == null);
        return new Jogador(nomeJogador, classeEscolhida);
    }

    public static Personagem criarPersonagem(Jogador jogador) {
        if (jogador.getClasse() == Classes.GUERREIRO){
            return new Guerreiro(jogador.getNomeJogador(), 50, 0, 5);
        }else if (jogador.getClasse() == Classes.MAGO){
            return new Mago(jogador.getNomeJogador(), 35, 5, 0, 50);
        }
        return null;
    }
}