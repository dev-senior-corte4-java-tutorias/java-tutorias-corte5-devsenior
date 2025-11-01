import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // variables del vendedor
        String nombreVendedor = "";
        double salarioBase = 1500.000;
        double comisionTotal = 0.0;
        double metaMensual = 2000.000;
        boolean esSupervisor = false;
        int clienteAtendidos = 0;
        double descuentosOtorgados = 0.0;
        double totalvendido = 0.0;
        int ventasRealizadas = 0;

        // bienvenida
        System.out.println("===========================================");
        System.out.println("bienvenido al sistema de gestión de ventas ");
        System.out.println("===========================================");
        System.out.println(" ingrese su nombre");
        nombreVendedor = scanner.nextLine();

        System.out.println(" es usted supervisor (1=si, 2= no)");
        int rolDecision = scanner.nextInt();

        esSupervisor = (rolDecision == 1) ? true : false;

        salarioBase = esSupervisor ? 2000.000 : 1500.000;

        String cargo = esSupervisor ? "supervisor de ventas" : "vendedor";

        System.out.println(" hola " + nombreVendedor + " :)");
        System.out.println(" cargo" + cargo);
        System.out.println(" meta mensual de ventas " + metaMensual);

        /* MENU PRINCIPAL CON UN DO WHILE */
        int opcionMenu;
        boolean sistemaActivo = true;

        do {
            System.out.println("=========================================");
            System.out.println(" Resumen actual ");
            System.out.println("===========================================");
            System.out.println(" vendedor " + nombreVendedor + "(" + cargo + " )");
            System.out.println(" total vendido " + totalvendido);
            System.out.println(" meta mensual " + metaMensual);
            System.out.println(" progreso " + (totalvendido / metaMensual));
            System.out.println(" ventas realizadas " + ventasRealizadas);
            System.out.println(" comision acumulada " + comisionTotal);

            // menu principal
            System.out.println(" Menu principal !!!!!");
            System.out.println("1. registrar una nueva venta ");
            System.out.println("2. ver estadista detallada");
            System.out.println("3. calcular el salario mensual ");
            // desde aca hasta el numero 5 es la tarea 
            System.out.println("4. evaluar cumplimiento de meta ");
            System.out.println("5. procesar devolución");
            System.out.println("6. cerrar seccion");
            System.out.print("\nselecciona una opcion");

            opcionMenu = scanner.nextInt();
            while (opcionMenu < 1 || opcionMenu > 6) {
                System.out.println(" opcion invalida por favor digita un numero valido ");
                opcionMenu = scanner.nextInt();
            }

            switch (opcionMenu) {
                case 1:
                    System.out.println("========================");
                    System.out.println(" registro de nueva venta ");
                    System.out.println("========================");

                    clienteAtendidos++;
                    System.out.println(" catalogo de productos");
                    System.out.println(" 1. laptop - 1600.000");
                    System.out.println(" 2. tablet - 1000.000");
                    System.out.println("3. celular - 2000.000");
                    System.out.println("4. auriculares - 100.000");
                    System.out.println("5. mouse inalambrico 100.000");
                    System.out.println(" cuantos productos diferentes comprara el cliente");
                    int cantidadProductos = scanner.nextInt();

                    // validaciones con un while

                    while (cantidadProductos < 1 || cantidadProductos > 5) {
                        System.out.println(" ingrese un numero valido");
                        cantidadProductos = scanner.nextInt();
                    }

                    double totalVenta = 0.0;

                    for (int i = 1; i <= cantidadProductos; i++) {

                        System.out.println("\n--- producto # " + i + "---");
                        System.out.println(" seleccione el producto entre 1 - 5");
                        int productoSeleccionado = scanner.nextInt();
                        System.out.println(" cantidad a comprar ");
                        int cantidad = scanner.nextInt();

                        double precioUnitario = 0.0;
                        String nombreProducto = "";

                        // switch para el precio del producto
                        switch (productoSeleccionado) {
                            case 1:
                                precioUnitario = 1600.000;
                                nombreProducto = "laptop";
                                break;

                            case 2:
                                precioUnitario = 1000.000;
                                nombreProducto = "tablet";
                                break;

                            case 3:

                                precioUnitario = 2000.000;
                                nombreProducto = "celular";
                                break;

                            case 4:
                                precioUnitario = 100.000;
                                nombreProducto = "auriculares";
                                break;

                            case 5:
                                precioUnitario = 100.000;
                                nombreProducto = "Mouse inalambrico";
                                break;

                            default:
                                precioUnitario = 0.0;
                                nombreProducto = " nombre no valido";

                        }
                        double subtotal = precioUnitario * cantidad;
                        System.out.println("cantidad " + cantidad + " x " + nombreProducto + " = $ " + subtotal);

                    }

                    System.out.println(" subtotal" + totalVenta);

                    System.out.println(" aplicar descuento si tiene tajeta de fidelidad  ( 1. si, 2. no)");
                    int tieneTarjeta = scanner.nextInt();

                    double descuento = 0.0;

                    if (tieneTarjeta == 1) {
                        if (totalVenta >= 200.000) {
                            descuento = totalVenta * 0.15;
                            System.out.println(" descuento aplicado del 15% por compra mayor a 200.000");

                        } else if (totalVenta >= 120.000) {
                            descuento = totalVenta * 0.10;
                            System.out.println(" descuento aplicado del 10% por compra mayor a 120.000");
                        } else if (totalVenta >= 70.000) {
                            descuento = totalVenta * 0.05;
                            System.out.println(" descuento aplicado es del 5% por compras mayores a 70.000");

                        } else {
                            System.out.println(" compra minima para aplicar a un descuento es de 70.000");
                        }
                        descuentosOtorgados = descuentosOtorgados + descuento;
                    }

                    totalVenta = totalVenta - descuento;

                    System.out.println(" total a pagar " + totalVenta);
                    // seleccion del metodo de pago
                    System.out.println("\n metodo de pago ");
                    System.out.println(" 1.efectivo ");
                    System.out.println("2. tarjeta de credito");
                    System.out.println("3. trasnferencia bancaria");
                    System.out.print(" seleccione ");
                    int metodoPago = scanner.nextInt();

                    String metodoTexto = "";

                    switch (metodoPago) {
                        case 1:
                            metodoTexto = "efectivo";
                            System.out.println(" monto recibido $");
                            double montoRecibido = scanner.nextDouble();
                            double cambio = montoRecibido - totalVenta;

                            // operador ternario
                            String mensaje = (cambio >= 0) ? "cambio " + cambio : " monto insuficiente";

                            System.out.println(mensaje);
                            if (cambio < 0) {
                                System.out.println(" venta cancelada");
                                break;
                            }
                            break;

                        case 2:
                            metodoTexto = " tarjeta de credito";
                            System.out.println(" pago procesado correctamente");
                            break;
                        case 3:
                            metodoTexto = " tranferencia bancaria";
                            System.out.println(" transferencia confirmada");
                            break;

                        default:
                            metodoTexto = " metodo no valido para pagar";
                            System.out.println(" metodo de pago no valido ");
                            break;

                    }
                    if (metodoPago >= 1 && metodoPago <=3){

                        double comision = 0.0;

                        if (totalVenta>=110.000){
                            comision = totalVenta *0.08; // 8%

                        }
                        else if (totalVenta >= 80.0000){
                            comision = totalVenta *0.05; // 5%

                        }
                        else {
                            comision  = totalVenta +0.03; // 3%
                        }
                        // bonus por ser supervisor 
                        comision = esSupervisor ? comision *1.2 : comision;

                        comisionTotal = comisionTotal + comision;
                        totalvendido = totalvendido + totalVenta;
                        ventasRealizadas ++;
                        
                        System.out.println(" venta registrada exitosamente ");
                        System.out.println( " tikect"+ventasRealizadas);
                        System.out.println( " monto "+totalVenta);
                        System.out.println( "metodo "+metodoTexto);
                        System.out.println( " tu comisión "+comision);

                    }

                case 2:
                System.out.println( " estadistica detallada ");
                System.out.println("vendedor "+nombreVendedor);
                System.out.println(" salario base"+salarioBase);
                System.out.println( " rendimiento");
                System.out.println("ventas realizadas"+ventasRealizadas);
                System.out.println(" clientes atendidos "+ clienteAtendidos);
                System.out.println(" total vendido"+totalvendido);
                System.out.println(" meta mensual"+metaMensual);
                
                double porcentajeMeta = (totalvendido / metaMensual)*100;
                System.out.println(" cumplimiento "+ porcentajeMeta+ "%");
                System.out.println( "comision ");
                System.out.println(" comisiones acumuladas"+comisionTotal);

                // calcular el promedio de venta 
                double promedioVenta = (ventasRealizadas>0) ? totalvendido / ventasRealizadas :0;
                System.out.println( " promedio de venta "+ promedioVenta);
                System.out.println( " descuento aplicado "+descuentosOtorgados);

                System.out.println(" calificacion al vendedor ");
                    if (totalvendido >= metaMensual *1.5){
                        System.out.println("VENDEDOR ESTRELLA");

                    }
                    else if(totalvendido >= metaMensual*0.8){
                        System.out.println(" cumpliste la meta");
                    }
                    else if (totalvendido >= metaMensual*0.2) {
                        System.out.println(" sigue mejorando");
                    }
                    else {
                        System.out.println(" reunion proximamente ");
                    }
                    break;
                case 3:
                 System.out.println( " calcular el salario ");
                 System.out.println(" salario base "+ salarioBase);
                 System.out.println(" comision"+comisionTotal);
                 double bonificacion = 0.0;

                 if(totalvendido >= metaMensual){
                    if (totalvendido >= metaMensual *2) {
                        bonificacion = 200.000;
                        System.out.println(" bonficacion de excelencia ");
                        
                    }
                    else if (totalvendido >= metaMensual *1.5){
                        bonificacion = 120.000;
                        System.out.println(" bonificacion de destacado");

                    }
                    else {
                        System.out.println(" sin bonificacion no se alcanzo la meta");

                    }
                 }


                 double salarioTotal = salarioBase +comisionTotal + bonificacion;
                 double deducciones = salarioTotal = salarioTotal * 0.12;
                 double salarioNeto = salarioTotal -deducciones; 

                 System.out.println(" bonificacion "+ bonificacion);
                 System.out.println( "======================");
                 System.out.println(" salario bruto "+salarioTotal);
                 System.out.println("======================");
                 System.out.println(" salario con deduciones "+deducciones);
                 System.out.println(" =============================");
                 System.out.println( " salario neto "+salarioNeto);
                 break;
                default:
                    break;
            }

        } while (sistemaActivo);

    }
}
