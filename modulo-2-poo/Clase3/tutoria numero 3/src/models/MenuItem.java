package models;

/**
 * Clase MenuItem - Representa un ítem del menú del restaurante
 * Clase básica que contiene información de un platillo o bebida
 */
public class MenuItem {
    // Atributos privados
    private String name;    // Nombre del ítem
    private double price;   // Precio del ítem

    /**
     * Constructor que inicializa los atributos del ítem
     * @param name Nombre del ítem del menú
     * @param price Precio del ítem
     */
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Obtiene el nombre del ítem
     * @return nombre del ítem
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el precio del ítem
     * @return precio del ítem
     */
    public double getPrice() {
        return price;
    }
}
