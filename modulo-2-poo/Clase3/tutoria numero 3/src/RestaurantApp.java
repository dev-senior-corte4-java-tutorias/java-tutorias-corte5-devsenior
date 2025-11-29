import models.*;

/**
 * Clase principal RestaurantApp
 * Demuestra el sistema completo de gestión del restaurante
 * Ilustra las relaciones de Composición, Agregación y Asociación
 */
public class RestaurantApp {
    public static void main(String[] args) {
        // 1. Crear ítems del menú
        MenuItem burger = new MenuItem("Hamburguesa Clásica", 15.0);
        MenuItem pizza = new MenuItem("Pizza Margherita", 18.0);
        MenuItem soda = new MenuItem("Refresco", 3.0);
        MenuItem salad = new MenuItem("Ensalada César", 12.0);

        // 2. Crear array de MenuItems y el Menu (AGREGACIÓN)
        MenuItem[] menuItems = {burger, pizza, soda, salad};
        Menu mainMenu = new Menu("Menú Principal", menuItems);

        // 3. Crear empleados
        Employee emp1 = new Employee("Carlos", "E001");
        Employee emp2 = new Employee("María", "E002");
        Employee[] staff = {emp1, emp2};

        // 4. Crear mesas
        Table table1 = new Table(1, 4);
        Table table2 = new Table(2, 2);
        Table[] tables = {table1, table2};

        // 5. Crear restaurante (AGREGACIÓN)
        Restaurant restaurant = new Restaurant("La Buena Mesa", "Calle Principal 123", tables, staff, mainMenu);

        // 6. Mostrar menú
        System.out.println("=== BIENVENIDO A " + restaurant.getName() + " ===\n");
        restaurant.displayMenu();

        // 7. Crear pedido para mesa 1 (COMPOSICIÓN)
        Order order1 = new Order(101, 5); // número de orden, max 5 items

        // 8. Buscar items en el menú y crear OrderItems
        MenuItem foundBurger = mainMenu.findItem("Hamburguesa Clásica");
        MenuItem foundSoda = mainMenu.findItem("Refresco");

        if (foundBurger != null) {
            order1.addItem(new OrderItem(foundBurger, 2));
        }
        if (foundSoda != null) {
            order1.addItem(new OrderItem(foundSoda, 2));
        }

        // 9. Asignar pedido a mesa
        Table myTable = restaurant.findTable(1);
        if (myTable != null) {
            myTable.assignOrder(order1);
            System.out.println("\n=== PEDIDO ASIGNADO A MESA " + myTable.getTableNumber() + " ===");
        }

        // 10. Mostrar detalles del pedido
        order1.displayDetails();
        System.out.printf("\nTOTAL A PAGAR: $%.2f\n", order1.calculateTotal());

        // 11. Simular que terminan de comer
        System.out.println("\n=== MESA LIBERADA ===");
        myTable.clearTable();
    }
}
