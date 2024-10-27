import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nbr;

        System.out.println("Veuillez entrez le nombre dont vous souhaitez savoir la parité");
        Scanner sc = new Scanner (System.in);
        nbr = sc.nextInt();
        if (nbr % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");


    }
}