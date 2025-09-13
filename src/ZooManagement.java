import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages");
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zooName = sc.nextLine();
        System.out.print("Entrez le nombre de cages : ");
        nbrCages = sc.nextInt();

        if (nbrCages <= 0 || zooName.isEmpty()) {
            System.out.println("Erreur : le nom du zoo doit être non vide et le nombre de cages positif !");
        } else {
            System.out.println(zooName + " comporte " + nbrCages + " cages");
        }

        sc.close();
    }
}
