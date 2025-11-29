package models;

/**
 * Clase OrderItem - Representa un ítem dentro de un pedido
 * Asocia un MenuItem con una cantidad específica
 */
public class OrderItem {
    // Atributos privados
    private MenuItem menuItem;  // Ítem del menú que se está ordenando
    private int quantity;       // Cantidad de este ítem

    /**
     * Constructor que inicializa el ítem del pedido
     * @param menuItem Ítem del menú
     * @param quantity Cantidad ordenada
     */
    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    /**
     * Obtiene el ítem del menú
     * @return MenuItem asociado
     */
    public MenuItem getMenuItem() {
        return menuItem;
    }

    /**
     * Obtiene la cantidad
     * @return cantidad ordenada
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Calcula el subtotal de este ítem
     * @return precio * cantidad
     */
    public double calculateSubtotal() {
        return menuItem.getPrice() * quantity;
    }
}
