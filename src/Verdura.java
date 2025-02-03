import java.time.LocalDate;

public class Verdura extends Producto {
    private String frescura;

    public Verdura(String nombre, double precio, double peso, LocalDate fechaVencimiento, String frescura) {
        super(nombre, precio, peso, fechaVencimiento);
        this.frescura = frescura;
    }

    public String getFrescura() {
        return frescura;
    }

    @Override
    public String toString() {
        return super.toString()+"Verdura{" +
                "frescura='" + frescura + '\'' +
                '}';
    }
}
