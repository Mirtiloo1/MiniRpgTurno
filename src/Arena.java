import model.Guerreiro;
import model.Mago;

public class Arena {
    public static void main(String[] args) {

        Guerreiro guerreiro1 = new Guerreiro("Jefferson", 50, 0, 5);
        Mago mago1 = new Mago("Kevin", 35, 8, 0, 50);

        int contador = 0;
        while(guerreiro1.isVivo() && mago1.isVivo()){
            contador++;
            System.out.println("---- Turno " + contador + "----");

            guerreiro1.atacar(mago1);
            System.out.println("\nMago HP: " + mago1.getPontoDeVida() + "/100\nGuerreiro HP: " + guerreiro1.getPontoDeVida() + "/100\n");

            if (!mago1.isVivo()){
                break;
            }

            mago1.atacar(guerreiro1);
            System.out.println("\nMago HP: " + mago1.getPontoDeVida() + "/100\nGuerreiro HP: " + guerreiro1.getPontoDeVida() + "/100\n");
        }

        System.out.println("Fim do X1!");
        if(!mago1.isVivo()){
            System.out.println(mago1.getNome() + " (Guerreiro) é o vencedor!");
        }
        else{
            System.out.println(guerreiro1.getNome() + " (Mago) é o vencedor!");
        }
    }
}