public class Vendedor2 extends Empleado2 {
    private double comision;

    public Vendedor2(String nombre, double sueldoBase, double comision) {
        super(nombre, sueldoBase);
        this.comision = comision;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + comision;
    }
}
