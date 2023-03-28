import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public Tienda(){
        this.productos = new ArrayList<Producto>();
    }

    public void menu(){
        Scanner leer = new Scanner(System.in);
        int opcionUsuario = 0;

        do {
            opcionUsuario = leer.nextInt();
            switch (opcionUsuario){
                case 1:
                    showALLProducts();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    findProductByName();
                    break;
                case 4:
                    findProductByCategory();
                    break;
                default:
                    break;
            }
        } while (opcionUsuario > 0);
    }

//Mostrar TODOS los productos disponibles, con su información completa.
    public void showALLProducts() {
        for (){}

    }

// Buscar un producto por su nombre o categoría.
    public List<Producto> findProductByName (String name){
        List<Producto> productByName = new ArrayList<>();
        for (Producto producto : this.productos){
            if (producto.getName().equals(name)){
                productByName.add(producto);
            } else System.out.println("Este producto no está en la lista");
        }
        for (Producto producto : productByName){
            System.out.println(productByName);
        }
        return productByName;
    }
    public Producto findProductByCategory (String category){
        for (Producto producto : this.productos){
            if (producto.getName().equals(category)){
                return producto;
            } //else System.out.println("Este producto no está en la lista");
        }
        return null;
    }

// Agregar un nuevo product a la list.
    //for (Producto producto : this.productos){
//            if (producto.getName().equals(name)){
//                this.productos.add(producto);
//            }
//        }
//        return productos;
    public List<Producto> agregarProducto(String name){

    }

// Modificar la información de un producto existente.

// Eliminar un producto de la lista.
    public boolean deleteProduct(String name, Producto producto){
        if (findProductByName(name) == null){
            this.productos.add(producto);
            return true;
        } else {
            return false;
        }
        return false;
    }
// Realizar una compra, disminuyendo el stock del producto vendido.
    public boolean buyProduct(int stock, Producto producto){

        if (stock == 0){
            deleteProduct(producto);
        }

        return false;
    }

}
