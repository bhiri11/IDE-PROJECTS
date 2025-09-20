import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    Zoo() {
        name="lion";
        city="tunis";
        nbrCages=10;
    }
    public Zoo(String name,String city,int nbrCages) {
        animals = new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        if(this.nbrCages>25){
            System.out.println(" le nombres de cages doit étre inferieur a 25");
        }
    };
    public void displayZoo(){
        System.out.println(this.name+" ggg "+this.city+" south africa "+this.nbrCages);
    }

}
