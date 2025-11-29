package models;

/**
 * Clase Order - Representa un pedido del restaurante
 * RELACIÓN: COMPOSICIÓN con OrderItem[]
 * El pedido CREA y POSEE sus items - los items no existen independientemente del pedido
 * Cuando el pedido se destruye, sus items también se destruyen
 */
public class Order {
    // Atributos privados
    private int orderNumber;     // Número de identificación del pedido
    private String status;       // Estado del pedido (Pending, In Progress, Completed)
    private OrderItem[] items;   // Array de items del pedido (COMPOSICIÓN)
    private int itemCount;       // Contador de items agregados

    /**
     * Constructor que inicializa el pedido
     * @param orderNumber Número del pedido
     * @param maxItems Capacidad máxima de items en el pedido
     */
    public Order(int orderNumber, int maxItems) {
        this.orderNumber = orderNumber;
        this.status = "Pending";
        this.items = new OrderItem[maxItems];  // COMPOSICIÓN: creamos el array internamente
        this.itemCount = 0;
    }

    /**
     * Añade un ítem al pedido
     * @param item OrderItem a añadir
     */
    public void addItem(OrderItem item) {
        // Buscar la primera posición null en el array
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("El pedido está lleno");
        }
    }

    /**
     * Calcula el total del pedido sumando todos los subtotales
     * @return total del pedido
     */
    public double calculateTotal() {
        double total = 0.0;
        // Iterar el array y sumar subtotales (verificar null)
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                total += items[i].calculateSubtotal();
            }
        }
        return total;
    }

    /**
     * Muestra los detalles del pedido en consola
     */
    public void displayDetails() {
        System.out.println("\n--- DETALLES DEL PEDIDO #" + orderNumber + " ---");
        System.out.println("Estado: " + status);
        System.out.println("Items:");

        // Iterar e imprimir cada item
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                OrderItem item = items[i];
                System.out.printf("  - %s x%d - $%.2f\n",
                    item.getMenuItem().getName(),
                    item.getQuantity(),
                    item.calculateSubtotal());
            }
        }
    }

    /**
     * Obtiene el número del pedido
     * @return número del pedido
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Obtiene el estado del pedido
     * @return estado del pedido
     */
    public String getStatus() {
        return status;
    }

    /**
     * Obtiene los items del pedido
     * @return array de OrderItem
     */
    public OrderItem[] getItems() {
        return items;
    }
}
