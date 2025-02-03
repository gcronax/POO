import java.time.LocalDate;

public abstract class Producto {
    private String nombre;
    private double precio;
    private double peso;
    private LocalDate fechaVencimiento;

    public Producto(String nombre, double precio, double peso, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaVencimiento);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}

