import java.util.ArrayList;
import java.util.Arrays;

public class Supermercado {
    private ArrayList<Producto> inventario;
    public Supermercado(){
        inventario=new ArrayList<>();
    }
    public void addProducto(Producto producto) {
        inventario.add(producto);
    }
    public void removeProducto(Producto producto) {
        inventario.remove(producto);
    }
    public ArrayList<Producto> getInventario() {
        return inventario;
    }
    public ArrayList<Producto> getProductosVencidos(){
        ArrayList<Producto> vencidos=new ArrayList<>();
        for (Producto aux: inventario){
            if (aux.estaVencido()){
                vencidos.add(aux);
            }
        }
        return vencidos;
    }

}
