public class App {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println(" demostracion de encapsulamiento en java");
        System.out.println("============================");

        System.out.println(" constructores");

        // construtor vacio
        Estudiante est1 = new Estudiante();
        System.out.println("constructor vacio ");
        System.out.println(" nombre " + est1.getNombre());
        System.out.println(" estado " + est1.getEstado());

        // constructor con parametros
        Estudiante est2 = new Estudiante("Ana garcia", 20, 4.5);
        System.out.println(" CONSTRUCTOR CON PARAMETROS ");
        System.out.println(" nombre " + est2.getNombre());
        System.out.println("edad " + est2.getEdad());
        System.out.println("promedio " + est2.getPromedio());

        // oonstructor completo

        Estudiante est3 = new Estudiante("carlos ", 23, 3.8, "Activo", 120);
        System.out.println(" nombre " + est3.getNombre());
        System.out.println(" creditos " + est3.getCreditosAprobados());

        // SETTERS
        System.out.println(" settes con validacion de if else ");

        Estudiante estudiante = new Estudiante();

        System.out.println("probando setNombre");
        estudiante.setNombre("maria lopez");
        System.out.println(" nombre establecido " + estudiante.getNombre());
        estudiante.setNombre("");

        System.out.println(" edad");
        estudiante.setEdad(78);
        System.out.println("edad establecida para el estudiante " + estudiante.getEdad());

        System.out.println(" promedio ");
        estudiante.setPromedio(4.2);
        System.out.println(" promedio establecido " + estudiante.getPromedio());

        /*
         * Demostraccion con switch
         */
        System.out.println(" probadno el switch");
        estudiante.setEstado("Activo");
        System.out.println("estado establecido " + estudiante.getEstado());

        // calificar el promedio
        Estudiante test1 = new Estudiante("test 1", 20, 5.0);
        Estudiante test2 = new Estudiante("test 2", 21, 4.9);
        Estudiante test3 = new Estudiante("test 3", 22, 4.8);
        Estudiante test4 = new Estudiante("test 4", 23, 4.7);
        Estudiante test5 = new Estudiante("test 5", 24, 4.6);

        System.out.println(test1.getNombre() + "promedio " + test1.getPromedio() + " con una calificacion de "
                + test1.obtenerCalificacion());

        System.out.println(test2.getNombre() + "promedio " + test2.getPromedio() + " con una calificacion de "
                + test2.obtenerCalificacion());

        System.out.println(test3.getNombre() + "promedio " + test3.getPromedio() + " con una calificacion de "
                + test3.obtenerCalificacion());

        System.out.println(test4.getNombre() + "promedio " + test4.getPromedio() + " con una calificacion de "
                + test4.obtenerCalificacion());

        System.out.println(test5.getNombre() + "promedio " + test5.getPromedio() + " con una calificacion de "
                + test5.obtenerCalificacion());

        // demostracion con los operadores ternarios

        System.out.println(" evaluando estado academico ");
        System.out.println(test1.getNombre() + "promedio " + test1.obtenerCalificacion() + " con una calificacion de "
                + test1.obtenerEstadoAcademico());

        System.out.println(test2.getNombre() + "promedio " + test2.obtenerCalificacion() + " con una calificacion de "
                + test2.obtenerEstadoAcademico());

        System.out.println(test3.getNombre() + "promedio " + test3.obtenerCalificacion() + " con una calificacion de "
                + test3.obtenerEstadoAcademico());
    }

/*
 * segun las variables que tenemos mirar que mas reportes podemos sacar 
 */
}
