public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(4);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());

    }

}