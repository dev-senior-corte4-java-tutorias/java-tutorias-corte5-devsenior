package models;

/**
 * Clase Restaurant - Representa el restaurante completo
 * RELACIÓN: AGREGACIÓN con Table[], Employee[] y Menu
 * El restaurante recibe objetos creados externamente (mesas, empleados, menú)
 * Estos objetos pueden existir independientemente del restaurante
 * Si el restaurante se destruye, estos objetos pueden seguir existiendo
 */
public class Restaurant {
    // Atributos privados
    private String name;           // Nombre del restaurante
    private String address;        // Dirección del restaurante
    private Table[] tables;        // Array de mesas (AGREGACIÓN)
    private Employee[] employees;  // Array de empleados (AGREGACIÓN)
    private Menu menu;             // Menú del restaurante (AGREGACIÓN)

    /**
     * Constructor que recibe todos los objetos ya creados externamente
     * @param name Nombre del restaurante
     * @param address Dirección del restaurante
     * @param tables Array de mesas creado externamente
     * @param employees Array de empleados creado externamente
     * @param menu Menú creado externamente
     */
    public Restaurant(String name, String address, Table[] tables, Employee[] employees, Menu menu) {
        this.name = name;
        this.address = address;
        this.tables = tables;      // AGREGACIÓN: recibimos objetos externos
        this.employees = employees; // AGREGACIÓN: recibimos objetos externos
        this.menu = menu;          // AGREGACIÓN: recibimos objetos externos
    }

    /**
     * Muestra el menú del restaurante
     */
    public void displayMenu() {
        menu.displayItems();
    }

    /**
     * Busca una mesa por su número
     * @param tableNumber Número de la mesa a buscar
     * @return Table encontrada o null si no existe
     */
    public Table findTable(int tableNumber) {
        // Iterar el array de mesas buscando el número
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] != null && tables[i].getTableNumber() == tableNumber) {
                return tables[i];
            }
        }
        System.out.println("Mesa " + tableNumber + " no encontrada");
        return null;  // No se encontró la mesa
    }

    /**
     * Obtiene el nombre del restaurante
     * @return nombre del restaurante
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene la dirección del restaurante
     * @return dirección del restaurante
     */
    public String getAddress() {
        return address;
    }

    /**
     * Obtiene el array de mesas
     * @return array de Table
     */
    public Table[] getTables() {
        return tables;
    }

    /**
     * Obtiene el array de empleados
     * @return array de Employee
     */
    public Employee[] getEmployees() {
        return employees;
    }

    /**
     * Obtiene el menú del restaurante
     * @return Menu del restaurante
     */
    public Menu getMenu() {
        return menu;
    }
}
