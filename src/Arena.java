import model.*;
import model.classes.Guerreiro;
import model.classes.Mago;

import static model.Jogador.criarPersonagem;

public class Arena {
    public static void main(String[] args) {
        Jogador infoJogador = Jogador.criarJogador();
        Personagem personagemDoJogador = criarPersonagem(infoJogador);

        Personagem oponente = null;
        if (personagemDoJogador instanceof Guerreiro) {
            oponente = new Mago();
        } else if (personagemDoJogador instanceof Mago) {
            oponente = new Guerreiro();
        }

        int turno = 1;
        while (personagemDoJogador.isVivo() && oponente.isVivo()) {
            System.out.println("\n---- TURNO " + turno + " ----");

            Personagem atacanteAtual;
            Personagem alvoAtual;

            if (turno % 2 != 0){
                atacanteAtual = personagemDoJogador;
                alvoAtual = oponente;
            }else{
                atacanteAtual = oponente;
                alvoAtual = personagemDoJogador;
            }
            atacanteAtual.atacar(alvoAtual);

            System.out.println("---------------------\nStatus:\n" + personagemDoJogador.getNome() + " HP: " + personagemDoJogador.getVida() +
                    "\n" + oponente.getNome() + " HP: " + oponente.getVida() + "\n---------------------");
            turno ++;
        }
        if (personagemDoJogador.isVivo()) {
            System.out.println("Você venceu!!");
        }else if(!personagemDoJogador.isVivo()){
            System.out.println(oponente.getNome() + " Venceu!");
        }
    }
}