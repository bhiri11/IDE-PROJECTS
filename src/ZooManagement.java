import java.util.Scanner;

public class ZooManagement {



    public static void main(String[] args) {
        int nbrCages = 0;
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
        Animal tiger = new Animal("tigers", "tiger" , 36 , false );
        Animal poo = new Animal( "poo" , "pp" , 26 , true );
        Zoo africa = new Zoo( "poo" , "africa" , 21 );
        africa.displayZoo();
        System.out.println(tiger);
        System.out.println(africa.toString());
        sc.close();
    }
}
