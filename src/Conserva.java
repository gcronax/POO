import java.time.LocalDate;

public class Conserva extends Producto {
    private LocalDate fechaElaboarcion;
    public Conserva(String nombre, double precio,  double peso,  LocalDate fechaVencimiento,
                     LocalDate fechaElaboarcion){
        super(nombre, precio, peso, fechaVencimiento);
        this.fechaElaboarcion=fechaElaboarcion;
    }

    public LocalDate getFechaElaboarcion() {
        return fechaElaboarcion;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Conserva{" +
                "fechaElaboarcion=" + fechaElaboarcion +
                '}';
    }
}
