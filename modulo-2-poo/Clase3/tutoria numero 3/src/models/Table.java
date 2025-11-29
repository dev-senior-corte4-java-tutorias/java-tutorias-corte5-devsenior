package models;

/**
 * Clase Table - Representa una mesa del restaurante
 * RELACIÓN: ASOCIACIÓN con Order
 * La mesa puede tener un pedido asignado, pero el pedido existe independientemente
 * La mesa solo mantiene una referencia al pedido
 */
public class Table {
    // Atributos privados
    private int tableNumber;      // Número de la mesa
    private int capacity;         // Capacidad de personas
    private boolean isOccupied;   // Estado de ocupación
    private Order currentOrder;   // Pedido actual (ASOCIACIÓN)

    /**
     * Constructor que inicializa la mesa
     * @param tableNumber Número de la mesa
     * @param capacity Capacidad de personas
     */
    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = false;  // Inicialmente desocupada
    }

    /**
     * Asigna un pedido a la mesa
     * @param order Pedido a asignar
     */
    public void assignOrder(Order order) {
        this.currentOrder = order;
        this.isOccupied = true;
    }

    /**
     * Limpia la mesa, removiendo el pedido y marcándola como libre
     */
    public void clearTable() {
        this.currentOrder = null;
        this.isOccupied = false;
    }

    /**
     * Obtiene el número de la mesa
     * @return número de la mesa
     */
    public int getTableNumber() {
        return tableNumber;
    }

    /**
     * Obtiene la capacidad de la mesa
     * @return capacidad de personas
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Verifica si la mesa está ocupada
     * @return true si está ocupada, false si está libre
     */
    public boolean isOccupied() {
        return isOccupied;
    }

    /**
     * Obtiene el pedido actual de la mesa
     * @return pedido actual o null si no hay pedido
     */
    public Order getCurrentOrder() {
        return currentOrder;
    }
}
