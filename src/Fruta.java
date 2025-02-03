import java.time.LocalDate;

public class Fruta extends Producto {
    private String madurez;

    public Fruta(String nombre, double precio, double peso, LocalDate fechaVencimiento, String madurez) {
        super(nombre, precio, peso, fechaVencimiento);
        this.madurez = madurez;
    }

    public String getMadurez() {
        return madurez;
    }

    @Override
    public String toString() {
        return super.toString()+"Fruta{" +
                "madurez='" + madurez + '\'' +
                '}';
    }
}