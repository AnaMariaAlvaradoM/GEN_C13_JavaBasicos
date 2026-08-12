package poo.herencia.Animal;

public class Main {
    public static void main(String[] args) {

        Perro perro1  = new Perro("Firulais");
        Gato gato1 = new Gato("Michi");

        System.out.println(perro1.hacerSonido());
        System.out.println(gato1.hacerSonido());

        //!Polimorfismo

        Animal animal1 = new Perro("Rex");
        System.out.println(animal1.hacerSonido());

        Animal a1 = new Perro("Rex");
        Animal a2 = new Gato("Pelusa");
        Animal a3 = new Animal("Criatura");


        //Animal a4 = new Pajaro("Piolin");

        System.out.println(a1.hacerSonido());
        System.out.println(a2.hacerSonido());
        System.out.println(a3.hacerSonido());

        System.out.println(a1.describir());
    }
}
