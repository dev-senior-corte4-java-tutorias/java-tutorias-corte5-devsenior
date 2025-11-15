import java.util.Scanner;

public class App {
    // variables goblales para almacenar productos (maximo 3 producto)
    static String producto1 = "";
    static double precio1 = 0, cantidad1 = 0;

    static String producto2 = "";
    static double precio2 = 0, cantidad2 = 0;

    static String producto3 = "";
    static double precio3 = 0, cantidad3 = 0;

    static int totalProductos = 0;

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int opcion =0;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    registrarProducto(scanner);
                    break;
                case 2:
                mostrarProducto();
                break;
                case 3:
                calcularInventarioTotal();
                break;
                
                case 4: 
                aplicarDescuento(scanner);
                break;

                case 5: 
                System.out.println(" saliendo del sistema.............");
                break;
                default:
                System.out.println(" opcion invalida");
                    break;
            }
        } while (opcion!=5);
        scanner.close();
    }

    // mostrar el menu
    /*
     * modificador de acceso -> public
     * pertence a la clase -> static
     * no retornamos nada -> void
     * no recibimos nada -> ()
     */
    public static void mostrarMenu() {
        System.out.println(" sistema de gestion de tienda ");
        System.out.println("1. registrar un producto");
        System.out.println("2. mostrar el inventario ");
        System.out.println(" 3. calcular el valor del inventario ");
        System.out.println("4. aplicar descuento a un producto");
        System.out.println("5. salir ");
        System.out.println(" seleccione una opción");

    }

    // registrar un nuevo producto
    public static void registrarProducto(Scanner scanner) {
        System.out.println("== registrando un producto==  ");
        System.out.println(" ingresa el nombre del producto ");
        String nombre = scanner.nextLine();

        System.out.println(" ingresa el precio del producto ");
        double precio = scanner.nextDouble();

        System.out.println(" ingrese la cantidad en inventario");
        double cantidad = scanner.nextDouble();

        scanner.nextLine();

        // guardar segun el numero del producto

        if (totalProductos == 0) {
            producto1 = nombre;
            precio1 = precio;
            cantidad1 = cantidad;
            totalProductos++;
        }

        else if (totalProductos == 1) {
            producto2 = nombre;
            precio2 = precio;
            cantidad2 = cantidad;
            totalProductos++;
        }

        else if (totalProductos == 2) {
            producto3 = nombre;
            precio3 = precio;
            cantidad3 = cantidad;

            totalProductos++;
        }

        double valorTotal = calcularValorProducto(precio, cantidad);
        mostrarResumenProducto(nombre, precio, cantidad, valorTotal);
    }

    public static void mostrarResumenProducto(String nombre, double precio, double cantidad, double valorTotal) {
        System.out.println(" producto registrado exitosamente ");
        System.out.println("Nombre " + nombre);
        System.out.println(" precio unitario " + precio);
        System.out.println(" cantidad " + cantidad);
        System.out.println(" valor total " + valorTotal);
    }

    public static double calcularValorProducto(double precio, double cantidad) {
        return precio * cantidad;
    }

    // mostrar productos

    public static void mostrarProducto() {
        System.out.println(" inventario productos");

        for (int i = 1; i <= totalProductos; i++) {
            String nombre = obtenerNombreProducto(i);
            double precio = obtenerPrecioProducto(i);
            double cantidad = obtenerCantidadProduto(i);
            double valorTotal = calcularValorProducto(precio, cantidad);
        }

    }

    public static String obtenerNombreProducto(int posicion) {

        // primera forma de comprobrar
        if (posicion == 1) {
            return producto1;
        } else if (posicion == 2) {
            return producto2;
        } else {
            return producto3;
        }

    }

    // obtener el precio del producto

    public static double obtenerPrecioProducto(int posicion) {
        // segunda forma de comprobar
        if (posicion == 1) {
            return precio1;
        } else if (posicion == 2) {
            return precio2;
        }

        else if (posicion == 3) {
            return precio3;
        }

        return 0;
    }

    //
    public static double obtenerCantidadProduto(int posicion) {
        if (posicion == 1) {
            return cantidad1;
        } else if (posicion == 2) {
            return cantidad2;
        }

        else if (posicion == 3) {
            return cantidad3;
        }

        return 0;
    }

    // imprimir detalle del producto

    public static void imprmirDetalleDelProduto(int numero, String nombre, double precio, double cantidad,
            double valorTotal) {

        System.out.println(" producto" + numero + " ---");
        System.out.println("nombre " + nombre);
        System.out.println(" precio " + precio);
        System.out.println(" cantidad " + cantidad);
        System.out.println(" valor total " + valorTotal);

    }

    // calcular el invetario total

    public static void calcularInventarioTotal() {
        System.out.println(" valor total del inventario");

        double sumaTotal = 0;
        // ERROR CORREGIDO: Se agregó esta variable para sumar todas las unidades de productos
        // Antes solo se dividía entre el número de productos registrados (totalProductos)
        // Ahora se divide entre el total de unidades (sumaCantidades)
        // Ejemplo: 1 producto con precio 4000 y cantidad 2 = valor total 8000
        // Antes: 8000 / 1 producto = 8000 (INCORRECTO)
        // Ahora: 8000 / 2 unidades = 4000 (CORRECTO - precio unitario promedio)
        double sumaCantidades = 0;


        for (int i = 1; i <= totalProductos; i++) {
            double precio = obtenerPrecioProducto(i);
            double cantidad = obtenerCantidadProduto(i);
            double valorProducto = calcularValorProducto(precio, cantidad);
            sumaTotal = sumaValores(sumaTotal, valorProducto);
            // Se acumula la cantidad total de unidades de todos los productos
            sumaCantidades = sumaValores(sumaCantidades, cantidad);
        }

        mostrarValorTotal(sumaTotal);

        // CORRECCIÓN: Se cambió totalProductos por sumaCantidades para calcular el valor promedio por unidad
        calcularPromedioValor(sumaTotal, sumaCantidades);
    }

    public static double sumaValores(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static void mostrarValorTotal(double total) {
        System.out.println(" valor total del inventario " + total);
    }

    // calcular promedio

    // ERROR CORREGIDO: Se cambió el parámetro de int a double para aceptar la suma de cantidades
    // Antes: int cantidadProductos (número de productos diferentes registrados)
    // Ahora: double cantidadProductos (total de unidades de todos los productos)
    public static void calcularPromedioValor(double total, double cantidadProductos) {
        if (cantidadProductos > 0) {
              System.out.println(" hola "+ total+" "+"cantidad "+cantidadProductos);
            double promedio = dividirValores(total, cantidadProductos);

            System.out.println(" valor promedio por producto " + promedio);
        }
    }

    // metodo de dividir valores

    public static double dividirValores(double dividendo, double divisor) {

        return dividendo / divisor;
    }

    // aplicar descuento

    public static void aplicarDescuento(Scanner scanner) {
        System.out.println(" aplicar descuento ");
        System.out.println(" ingrese el numero de producto (1- " + totalProductos + "): ");
        int numeroProducto = scanner.nextInt();

        System.out.println(" ingrese el porcentaje  de descuento ");
        double porcentajeDescuento = scanner.nextDouble();

        scanner.nextLine();

        double precioOriginal = obtenerPrecioProducto(numeroProducto);
        double descuento = calcularDescuento(precioOriginal, porcentajeDescuento);

        double precioFinal = restarValores(precioOriginal, descuento);

        actualizarPrecioProducto(numeroProducto, precioFinal);

        mostrarResultadoDescuento(precioOriginal, descuento, precioFinal);

    }

    // calcular el descuento

    public static double calcularDescuento(double precio, double porcentaje) {
        return multiplicarValores(precio, porcentaje) / 100;

    }

    public static double multiplicarValores(double valor1, double valor2) {
        return valor1 * valor2;
    }

    // metodo apra restar valores

    public static double restarValores(double valor1, double valor2) {
        return valor1 - valor2;
    }

    // metodo para actualizar el precio de un producto

    public static void actualizarPrecioProducto(int posicion, double nuevoPrecio) {
        if (posicion == 1) {
            precio1 = nuevoPrecio;
        } else if (posicion == 2) {
            precio2 = nuevoPrecio;
        }

        else if (posicion == 3) {
            precio3 = nuevoPrecio;
        }

    }

    // metodo para mostrar el resultado del descuento 
    public static void mostrarResultadoDescuento(double precioOriginal, double descuento, double precioFinal){
        System.out.println(" descuento aplicado con exito ");
        System.out.println(" precio original "+precioOriginal);
        System.out.println(" decuento "+descuento);
        System.out.println(" precio final "+precioFinal);
    }
}

