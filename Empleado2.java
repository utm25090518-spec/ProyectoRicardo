public class Empleado2{

    protected String nombre;
    protected double sueldoBase;

    public Empleado2(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldo() {
        return sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }
}