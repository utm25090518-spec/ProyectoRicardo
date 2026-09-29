public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre , int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer(){
        System.out.println(nombre + "esta comiedo");
    }

    public void hacerSonido(){
        System.out.println(nombre +"hace sonido");
    }
    @Override
    public String toString(){
        return nombre + "("+ edad + "años)";
    }
}

