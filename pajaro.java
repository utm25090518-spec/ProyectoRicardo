public class pajaro extends Animal implements Volador{

    public pajaro (String nombre, int edad){
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío!");
    }
    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}
