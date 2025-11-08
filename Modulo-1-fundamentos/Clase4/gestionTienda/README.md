![Dev Senior](caratula%20dev%20senior.jpg)

# Sistema de Gestión de Tienda

## Descripción del Proyecto

Este es un sistema de gestión de inventario para una tienda desarrollado en Java. El programa permite administrar hasta 3 productos diferentes mediante un menú interactivo en consola.

### Funcionalidades Principales

1. **Registrar Producto**: Permite ingresar un nuevo producto con su nombre, precio unitario y cantidad en inventario. El sistema calcula automáticamente el valor total del producto y muestra un resumen.

2. **Mostrar Inventario**: Lista todos los productos registrados con sus detalles (nombre, precio, cantidad y valor total).

3. **Calcular Valor del Inventario**: Calcula y muestra el valor total de todo el inventario, así como el valor promedio por unidad de producto.

4. **Aplicar Descuento**: Permite aplicar un descuento porcentual a un producto específico, actualizando su precio y mostrando el precio original, el descuento aplicado y el precio final.

5. **Salir**: Cierra el sistema de gestión.

### Características Técnicas

- **Variables Globales**: Utiliza variables estáticas para almacenar información de hasta 3 productos (nombre, precio, cantidad).
- **Métodos Modulares**: El código está organizado en métodos específicos para cada funcionalidad, siguiendo principios de programación modular.
- **Operaciones Matemáticas**: Incluye métodos reutilizables para operaciones básicas como suma, resta, multiplicación y división.
- **Validación**: Controla el número máximo de productos que se pueden registrar.
- **Interfaz de Usuario**: Menú interactivo que se ejecuta en un bucle hasta que el usuario decida salir.

### Métodos Destacados

- `mostrarMenu()`: Presenta el menú principal de opciones
- `registrarProducto()`: Gestiona el registro de nuevos productos
- `mostrarProducto()`: Muestra el inventario completo
- `calcularInventarioTotal()`: Calcula el valor total y promedio del inventario
- `aplicarDescuento()`: Aplica descuentos porcentuales a productos
- `calcularValorProducto()`: Calcula el valor total de un producto (precio × cantidad)

### Correcciones Implementadas

El código incluye correcciones importantes en el cálculo del promedio del inventario. Anteriormente se dividía entre el número de productos registrados, ahora se divide correctamente entre el total de unidades de todos los productos, proporcionando el precio unitario promedio real.

