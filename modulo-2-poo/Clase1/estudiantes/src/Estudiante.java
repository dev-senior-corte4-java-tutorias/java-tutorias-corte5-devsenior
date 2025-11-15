 // POJO = JAVABEANS
public class Estudiante {
    // atributos privados (encapsulamiento)
    private String nombre;
    private int edad;
    private double promedio;
    private String estado; // "activo", " inactivo" "graduado"
    private int creditosAprobados;

    // constructor vacio
    public Estudiante() {
        this.nombre = "sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
        this.estado = "Inactivo";
        this.creditosAprobados = 0;
    }

    // constructor con parametros
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // construtor completo
    public Estudiante(String nombre, int edad, double promedio, String estado, int creditosAprobados) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.estado = estado;
        this.creditosAprobados = creditosAprobados;
    }

    /*
     * GETTER -> OBTENER
     * public tipoDeDATO getNombre(){
     * return nombre;
     * }
     */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEstado() {
        return estado;
    }

    public int getCreditosAprobados() {
        return creditosAprobados;
    }

    /*
     * SETTERS: (permiten editar el contenido del atributo) -> con validaciones
     */

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println(" ERROR: -> El nombre no puede estar vacío");
        }
    }

    /*
     * trim nos permite eliminar los espacios al principio y al final de un entrada
     * de tipo String
     */
    /* [hola] */
    /* [hola] */
    /*
     * isEmpty nos permite revisar si lo que viene dentro de la cadena viene vacio
     */
    /* [ ] */

    // setter de edad
    public void setEdad(int edad) {
        if (edad >= 15 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("ERROR: -> edad invalida debe estar entre 15 y 100");
        }
    }

    // setter de promedio
    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0) {
            this.promedio = promedio;
            actualizarEstadoPromedio();
        } else {
            System.out.println("ERROR-> promedio invalido ");
        }
    }

    public void setEstado(String estado) {
        switch (estado) {
            case "Activo":
            case "inactivo":
            case "graudado":
                this.estado = estado;
                break;
            default:
                System.out.println(" error -> estado invalido");
                break;
        }
    }

    public void setCreditosAprobados(int creditosAprobados) {
        // validacion con operador ternario
        this.creditosAprobados = (creditosAprobados >= 0) ? creditosAprobados : 0;
    }

    /* metodos que hacen operaciones internas dentro de una clase van privados */
    private void actualizarEstadoPromedio() {
        if (this.promedio >= 3.0) {
            this.estado = "Activo";

        } else if (this.promedio >= 2.0) {
            System.out.println(" advertencias promedio bajo");
        }

        else {
            this.estado = "Inactivo";
            System.out.println(" estudiante en riesgo academico");
        }
    }

    public String obtenerCalificacion() {
        String calificacion;
        int promedioEntero = (int) this.promedio;

        switch (promedioEntero) {
            case 5:
                calificacion = "Excelente";

                break;
            case 4:
                calificacion = "Sobresaliente";
                break;

            case 3:

                calificacion = "Aceptable";
                break;

            case 2:
                calificacion = "Insuficiente";
                break;

            default:
                calificacion = "Deficiente";
                break;
        }
        return calificacion;
    }

    // metodo para devolver si esta aprobado (true/false)
    public boolean estaAprobado() {
        return (this.promedio >= 3.0) ? true : false;
    }

    //
    public String obtenerEstadoAcademico() {
        return (this.promedio >= 3.0) ? "Aprobado" : "reprobado";
    }

    /*
     * @Override
     * public String toString() {
     * return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", promedio=" +
     * promedio + ", estado=" + estado
     * + ", creditosAprobados=" + creditosAprobados + "]";
     * }
     */
    // metodo para mostrar la informacion

    public void mostrarInformacion() {
        System.out.println(" informacion del estudiante ");
        System.out.println(" nombre " + this.nombre);
        System.out.println("edad " + this.edad);
        System.out.println(" promedio" + this.promedio);
        System.out.println(" estado " + this.estado);
        System.out.println(" creditos aprovados" + this.creditosAprobados);
        System.out.println("calificaciones" + obtenerCalificacion());
        System.out.println(" puede graduarse " + (puedeGraduarse() ? "si" : "No"));
    }

    private boolean puedeGraduarse() {
        return (this.creditosAprobados >= 160 && this.promedio >= 3.0) ? true : false;
    }

}
