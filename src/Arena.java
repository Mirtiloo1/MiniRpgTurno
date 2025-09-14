import model.Guerreiro;
import model.Mago;

public class Arena {
    public static void main(String[] args) {

        Guerreiro guerreiro1 = new Guerreiro("Jefferson", 50, 0, 5);
        Mago mago1 = new Mago("Kevin", 35, 5, 0, 50);

        int contador = 0;

        // APENAS PARA VER A VIDA INICIAL
        System.out.println("-----------------------------");
        System.out.println("Vida do guerreiro: " + guerreiro1.getPontoDeVida());
        System.out.println("Vida do mago: " + mago1.getPontoDeVida());
        System.out.println("-----------------------------\n");

        while(guerreiro1.isVivo() && mago1.isVivo()){
            contador++;

            if(contador % 3 == 0){
                System.out.println("---- Turno " + contador + "----");
                System.out.println("---- AMBOS UTILIZAM SUA HABILIDADE ESPECIAL ----\n");
                guerreiro1.usarHabilidade(mago1);
                System.out.println("\nLogo em seguida:");
                mago1.usarHabilidade(mago1);

                System.out.println("-----------------------------");
                System.out.println("Vida do guerreiro: " + guerreiro1.getPontoDeVida());
                System.out.println("Vida do mago: " + mago1.getPontoDeVida());
                System.out.println("-----------------------------");
            }else{
                System.out.println("---- Turno " + contador + "----");

                guerreiro1.atacar(mago1);
                System.out.println("\nMago HP: " + mago1.getPontoDeVida() + "/100\nGuerreiro HP: " + guerreiro1.getPontoDeVida() + "/100\n");

                mago1.atacar(guerreiro1);
                System.out.println("\nMago HP: " + mago1.getPontoDeVida() + "/100\nGuerreiro HP: " + guerreiro1.getPontoDeVida() + "/100\n");

                if (!mago1.isVivo()){
                    break;
                }
            }
        }
        System.out.println("\nFim do X1!");
        if(!mago1.isVivo()){
            System.out.println(mago1.getNome() + " (Guerreiro) é o vencedor!");
        }
        else{
            System.out.println(guerreiro1.getNome() + " (Mago) é o vencedor!");
        }
    }
}