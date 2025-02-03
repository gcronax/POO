import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fruta manzana = new Fruta("Manzana",
                0.5, 0.3, LocalDate.of(2023, Month.MAY, 1),
                "Madura");
        Verdura zanahoria = new Verdura("Zanahoria",
                0.4, 0.5, LocalDate.of(2029, Month.APRIL, 15),
                "Fresca");
        Conserva judias = new Conserva("Judias",
                1.2, 0.4, LocalDate.of(2029, Month.JUNE, 1),
                LocalDate.of(2022, Month.DECEMBER, 15));

        Supermercado sup = new Supermercado();

        sup.addProducto(manzana);
        sup.addProducto(zanahoria);
        sup.addProducto(judias);

        sup.getInventario().forEach(System.out::println);
        System.out.println("caducado");
        sup.getProductosVencidos().forEach(System.out::println);

        sup.removeProducto(manzana);



    }
}
