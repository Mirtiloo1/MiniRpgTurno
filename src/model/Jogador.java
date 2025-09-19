package model;

import java.util.*;

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
            List<Classes> listaDeClasses = List.of(Classes.values());
            for(int i = 0; i < listaDeClasses.size(); i++){
                System.out.println(i + 1 + ". " + listaDeClasses.get(i).toString());
            }
            int escolha = sc.nextInt();

            for (Classes listaDeClass : listaDeClasses) {
                int classePercorrida = listaDeClass.ordinal() + 1;
                if (escolha == classePercorrida) {
                    System.out.println("Você escolheu a classe: " + listaDeClass);
                    classeEscolhida = listaDeClass;
                }
            }
        }while(classeEscolhida == null);
        return new Jogador(nomeJogador, classeEscolhida);
    }

    public static Personagem criarPersonagem(Jogador jogador) {
        return jogador.getClasse().criarPersonagem(jogador.getNomeJogador());
    };
}