public class Main4 {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("juan ramo", 8000, 1500);

        Gerente gerente = new Gerente("Carlos", 12000, 3000);

        System.out.println("Vendedor: " + vendedor.calcularSueldo());
        System.out.println("Gerente: " + gerente.calcularSueldo());
    }
}
