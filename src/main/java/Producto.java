public class Producto {
    private String name, description, category;
    private double price;
    private int stock;

    public Producto(String name, String description, String category, double price, int stock) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + '\'' +
                "Descripción: " + this.description + '\'' +
                "Precio: " + this.price + '\'' +
                "Stock: " + this.stock + '\'' +
                "Categoría: " + this.category;
    }
}
