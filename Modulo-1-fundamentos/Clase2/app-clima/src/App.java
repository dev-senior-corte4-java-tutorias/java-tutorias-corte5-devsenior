import java.util.Scanner;

public class App {
    /**
     * 
     * las temperatuas las manejaremos en grados C
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // constantes
        /*
         * la variable que sea final no se podra cambiar su contenido durante la
         * ejecucion del programa
         */
        final String FECHA_MEDICION = " 24/10/2025";
        final String NOMBRE_CANAL = "TV noticias";
        final int TEMPERATURA_ALERTA_CALOR = 35;
        final int TEMPERATURA_ALERTA_FRIO = 5;
        final double VIENTO_FUERTE = 30.0; // (KM/H)
        // variables del programa
        double fuerzaViento;
        boolean lluviaDiaAnterior;
        boolean posiblesPrecipitaciones;
        double temperaturaMaximaDiaAnterior;
        double temperaturaMinimaDiaAnterior;
        double promedioTemperatura;
        String horaMedicion;
        double visibilidadKm;
        int temperaturaExacta;
        double temperaturaHoy;

        // entrada de los datos

        System.out.println("==============================================");
        System.out.println("REPORTE DEL CLIMA -" + NOMBRE_CANAL);
        System.out.println("==============================================");

        System.out.println("temperatura maxima del dia anterior");
        temperaturaMaximaDiaAnterior = entrada.nextDouble();

        System.out.println(" temperatura minima del dia anterior ");
        temperaturaMinimaDiaAnterior = entrada.nextDouble();

        System.out.println(" fuerza del viento (km/h)");
        fuerzaViento = entrada.nextDouble();

        System.out.println(" hubo lluvia el dia anterior ?? responde con (true/false)");
        lluviaDiaAnterior = entrada.nextBoolean();

        System.out.println(" hubo posibles precipitaciones?? responde con (true/false)");
        posiblesPrecipitaciones = entrada.nextBoolean();

        System.out.println(" visibilidad en km");
        visibilidadKm = entrada.nextDouble();

        System.out.println("hora de medicion");
        horaMedicion = entrada.next();

        // CALCULOS CON OPERADORES ARITMETICOS
        promedioTemperatura = (temperaturaMaximaDiaAnterior + temperaturaMinimaDiaAnterior) / 2.0;

        // casting double a int
        temperaturaExacta = (int) promedioTemperatura;
        /* la programacion se escribe de iz a derecha y se lee de derecha a iz */

        // CALCULAR LA TEMPERATURA DEL DIA DE HOY
        temperaturaHoy = promedioTemperatura;

        // OPERADORES LOGICOS PARA ALERTAS
        boolean hayAlertaCalor =  temperaturaHoy>= TEMPERATURA_ALERTA_CALOR;
        boolean hayAlertaFrio = temperaturaHoy <= TEMPERATURA_ALERTA_FRIO;
        boolean hayVientoPeligroso = fuerzaViento > VIENTO_FUERTE;
        boolean hayCondicionesLLuvia = lluviaDiaAnterior && posiblesPrecipitaciones;
        boolean hayCondicionesExtremas = hayAlertaCalor || hayAlertaFrio || hayVientoPeligroso;

        // OPERADORES RELACIONALES
        boolean visibilidadBuena = visibilidadKm > 10.0;
        boolean visibilidadMala = visibilidadKm < 5.0;
        boolean temperaturaAgradable = temperaturaHoy >= 18.0 && temperaturaHoy <= 25.0;

        // CALCULOS ADICIONALES
        double variacionTemperatura = temperaturaMaximaDiaAnterior - temperaturaMinimaDiaAnterior;
        double promedioVientoTemperatura = (fuerzaViento + temperaturaHoy) / 2.0;
        int temperaturaRedondeada = (int) temperaturaHoy;

        // MOSTRAR LOS RESULTADOS:
        System.out.println("\n===================================================");
        System.out.println("            resultado del analisis      ");
        System.out.println("fecha "+FECHA_MEDICION);
        System.out.println("hora "+ horaMedicion);

        System.out.println( "\n--- DATOS DEL DIA ANTERIOR ----");
        System.out.println("temperatura maxima "+temperaturaMaximaDiaAnterior + " grados");
        System.out.println("temperatura minima "+temperaturaMinimaDiaAnterior+ " grados");
        System.out.println("promedio "+promedioTemperatura+" grados");
        System.out.println("promedio exacto "+temperaturaExacta+" grados");
        System.out.println( " variacion termica "+variacionTemperatura +" grados");

        System.out.println("\n condiciones actuales");
        System.out.println( " fuerza del viento"+fuerzaViento+" km/h");
        System.out.println("lluvia dia anterior "+lluviaDiaAnterior);
        System.out.println("posibles precipitaciones "+posiblesPrecipitaciones);

        System.out.println( "\n temperatura pronostica para hoy es:");
        System.out.println( " temperatura del dia de hoy "+temperaturaHoy +" grados");
        System.out.println("temperatura redondeada "+temperaturaRedondeada +" grados");

        System.out.println( "\n analisis con operadores logicos");
        System.out.println( "hay alerta de calor "+hayAlertaCalor);
        System.out.println( "hay alerta de frio "+hayAlertaFrio);
        System.out.println("vientos peligrosos "+hayVientoPeligroso);
        System.out.println("condiciones de lluvia "+hayCondicionesLLuvia);
        System.out.println("condiciones extremas "+hayCondicionesExtremas);
        System.out.println( "visibilidad buena "+visibilidadBuena);
        System.out.println(" visibilidad mala "+visibilidadMala);
        System.out.println( " temperatura agradable "+temperaturaAgradable);

        System.out.println("\n calculos adicionales ");
        System.out.println( " promedio viento temperatura "+promedioVientoTemperatura);

        System.out.println( "\n================================");
        System.out.println( " reporte terminado");
        System.out.println( "\n================================");

        entrada.close();
    }
}
