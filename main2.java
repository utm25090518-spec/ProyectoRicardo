import java.util.ArrayList;

public class main2{

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais", 3));
        animales.add(new pajaro("Piolín", 2));
        animales.add(new Perro("Max", 5));
        animales.add(new pajaro("Luna", 1));

        for (Animal animal : animales) {

            System.out.println(animal);

            animal.comer();
            animal.hacerSonido();

            if (animal instanceof Volador) {

                Volador volador = (Volador) animal;
                volador.volar();

            }

            System.out.println();
        }
    }
}
