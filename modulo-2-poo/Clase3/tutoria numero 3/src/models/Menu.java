package models;

/**
 * Clase Menu - Representa el menú del restaurante
 * RELACIÓN: AGREGACIÓN con MenuItem[]
 * El menú contiene items que fueron creados externamente
 * Los MenuItems pueden existir independientemente del menú
 * Si el menú se destruye, los items siguen existiendo
 */
public class Menu {
    // Atributos privados
    private String name;          // Nombre del menú
    private MenuItem[] items;     // Array de items del menú (AGREGACIÓN)

    /**
     * Constructor que recibe el array de items ya creado externamente
     * @param name Nombre del menú
     * @param items Array de MenuItem creado externamente
     */
    public Menu(String name, MenuItem[] items) {
        this.name = name;
        this.items = items;  // AGREGACIÓN: recibimos el array desde fuera
    }

    /**
     * Muestra todos los items del menú
     */
    public void displayItems() {
        System.out.println("\n=== " + name + " ===");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.printf("%d. %s - $%.2f\n",
                    (i + 1),
                    items[i].getName(),
                    items[i].getPrice());
            }
        }
    }

    /**
     * Busca un ítem por nombre en el menú
     * @param itemName Nombre del ítem a buscar
     * @return MenuItem encontrado o null si no existe
     */
    public MenuItem findItem(String itemName) {
        // Iterar el array buscando el item
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(itemName)) {
                return items[i];
            }
        }
        return null;  // No se encontró el item
    }

    /**
     * Obtiene el nombre del menú
     * @return nombre del menú
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el array de items
     * @return array de MenuItem
     */
    public MenuItem[] getItems() {
        return items;
    }
}
