package models;

/**
 * Clase Employee - Representa un empleado del restaurante
 * Clase básica que contiene información del empleado
 */
public class Employee {
    // Atributos privados
    private String name;  // Nombre del empleado
    private String id;    // Identificador del empleado

    /**
     * Constructor que inicializa los atributos del empleado
     * @param name Nombre del empleado
     * @param id Identificador único del empleado
     */
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Obtiene el nombre del empleado
     * @return nombre del empleado
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el ID del empleado
     * @return identificador del empleado
     */
    public String getId() {
        return id;
    }
}
