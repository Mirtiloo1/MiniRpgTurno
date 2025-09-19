import model.*;

import static model.Jogador.criarPersonagem;

public class Arena {
    public static void main(String[] args) {
        Jogador infoJogador = Jogador.criarJogador();
        Personagem personagemDoJogador = criarPersonagem(infoJogador);

        Personagem oponente = null;
        if (personagemDoJogador instanceof Guerreiro) {
            oponente = new Mago("O Temível Kevin", 35, 5, 0, 50);
        } else if (personagemDoJogador instanceof Mago) {
            oponente = new Guerreiro("O Brutal Jefferson", 50, 0, 5);
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

            System.out.println("---------------------\nStatus:\n" + personagemDoJogador.getNome() + " HP: " + personagemDoJogador.getPontoDeVida() +
                    "\n" + oponente.getNome() + " HP: " + oponente.getPontoDeVida() + "\n---------------------");
            turno ++;
        }
        if (personagemDoJogador.isVivo()) {
            System.out.println("Você venceu!!");
        }else if(!personagemDoJogador.isVivo()){
            System.out.println(oponente.getNome() + " Venceu!");
        }
    }
}