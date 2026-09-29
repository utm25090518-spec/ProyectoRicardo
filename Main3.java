import java.util.ArrayList;
    public class Main3 {

    public static void main(String[] args) {

        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(6));
        figuras.add(new Circulo(2));

        double sumaAreas = 0;

        for (FiguraGeometrica figura : figuras) {
            sumaAreas += figura.calcularArea();
        }

        System.out.println("Cantidad de figuras: " + figuras.size());
        System.out.println("Suma de todas las áreas: " + sumaAreas);
    }
}
