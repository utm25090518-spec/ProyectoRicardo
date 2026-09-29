import java.util.ArrayList;

public class Main5{

    public static void main(String[] args) {

        ArrayList<Empleado2> empleados = new ArrayList<>();

        empleados.add(new Vendedor2("Frida", 8000, 1500));
        empleados.add(new Gerente2("Carlos", 12000, 3000));
        empleados.add(new Vendedor2("Ana", 9000, 2000));
        empleados.add(new Gerente2("Luis", 7500, 1000));

        Empleado2 empleadoMayor = null;

        for (Empleado2 empleado : empleados) {

            if (empleadoMayor == null ||
                empleado.calcularSueldo() > empleadoMayor.calcularSueldo()) {

                empleadoMayor = empleado;
            }
        }

        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + empleadoMayor.getNombre());
        System.out.println("Sueldo: $" + empleadoMayor.calcularSueldo());
    }
}