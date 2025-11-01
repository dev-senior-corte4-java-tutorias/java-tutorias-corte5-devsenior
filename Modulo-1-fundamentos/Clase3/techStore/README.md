# TechStore - Sistema de Gestión de Ventas

![Carátula TechStore](img/caratulas%20tutorias%20dev%20senior.gif)

## Descripción del Proyecto

TechStore es un sistema de gestión de ventas desarrollado en Java que permite administrar las operaciones diarias de una tienda de tecnología. El sistema está diseñado para vendedores y supervisores, ofreciendo funcionalidades completas para el registro de ventas, cálculo de comisiones, seguimiento de metas y generación de reportes.

## Características Principales

### Gestión de Vendedores
- Sistema de roles (Vendedor/Supervisor)
- Salarios base diferenciados:
  - Vendedor: $1,500.000
  - Supervisor: $2,000.000
- Cálculo automático de comisiones
- Bonificaciones por rendimiento

### Catálogo de Productos
| Producto | Precio |
|----------|--------|
| Laptop | $1,600.000 |
| Tablet | $1,000.000 |
| Celular | $2,000.000 |
| Auriculares | $100.000 |
| Mouse Inalámbrico | $100.000 |

### Sistema de Comisiones
- **8%** para ventas mayores a $110.000
- **5%** para ventas mayores a $80.000
- **3%** para ventas menores a $80.000
- **Bonus del 20%** adicional para supervisores

### Descuentos por Tarjeta de Fidelidad
- **15%** de descuento en compras mayores a $200.000
- **10%** de descuento en compras mayores a $120.000
- **5%** de descuento en compras mayores a $70.000

### Métodos de Pago
- Efectivo (con cálculo de cambio)
- Tarjeta de crédito
- Transferencia bancaria

### Bonificaciones por Meta
- **$200.000** - Bonificación de Excelencia (200% de la meta)
- **$120.000** - Bonificación Destacado (150% de la meta)
- **$100.000** - Bonificación por Cumplimiento (100% de la meta)

## Funcionalidades del Sistema

### 1. Registrar Nueva Venta
- Selección de múltiples productos del catálogo
- Aplicación automática de descuentos según tarjeta de fidelidad
- Procesamiento de diferentes métodos de pago
- Cálculo de comisiones en tiempo real
- Generación de tickets de venta

### 2. Estadísticas Detalladas
- Información del vendedor y cargo
- Rendimiento de ventas
- Total vendido y meta mensual
- Porcentaje de cumplimiento de meta
- Promedio de venta
- Total de descuentos otorgados
- Calificación del vendedor:
  - **VENDEDOR ESTRELLA** (150%+ de la meta)
  - **Cumpliste la meta** (80%+ de la meta)
  - **Sigue mejorando** (20%+ de la meta)
  - **Reunión proximamente** (menos del 20%)

### 3. Calcular Salario Mensual
- Salario base según cargo
- Comisiones acumuladas
- Bonificaciones por rendimiento
- Cálculo de deducciones (12%)
- Salario neto final

### 4. Evaluar Cumplimiento de Meta
- Meta mensual: $2,000.000
- Seguimiento de progreso en tiempo real
- Indicadores de rendimiento

### 5. Procesar Devolución
- Gestión de devoluciones de productos

### 6. Cerrar Sesión
- Finalización segura del sistema

## Estructura del Proyecto

```
techStore/
├── src/
│   └── App.java           # Clase principal del sistema
├── lib/                   # Dependencias externas
├── bin/                   # Archivos compilados
├── img/                   # Recursos gráficos
│   └── caratulas tutorias dev senior.gif
└── README.md             # Documentación del proyecto
```

## Requisitos del Sistema

- **Java Development Kit (JDK)** 8 o superior
- **IDE recomendado:** Visual Studio Code con extensión de Java
- **Sistema Operativo:** Windows, Linux o macOS

## Instalación y Configuración

### 1. Clonar el Repositorio
```bash
git clone <url-del-repositorio>
cd techStore
```

### 2. Compilar el Proyecto
```bash
javac src/App.java -d bin
```

### 3. Ejecutar la Aplicación
```bash
java -cp bin App
```

## Uso del Sistema

### Inicio de Sesión
1. Ingrese su nombre cuando se le solicite
2. Indique si es supervisor (1=Sí, 2=No)
3. El sistema configurará automáticamente su salario base y permisos

### Navegación por el Menú
- Utilice los números del **1 al 6** para seleccionar las opciones
- Siga las instrucciones en pantalla para cada operación
- El sistema validará automáticamente las entradas

### Registro de Ventas
1. Seleccione la opción **1** del menú principal
2. Indique cuántos productos diferentes comprará el cliente
3. Para cada producto:
   - Seleccione el número del producto (1-5)
   - Ingrese la cantidad a comprar
4. Indique si el cliente tiene tarjeta de fidelidad
5. Seleccione el método de pago
6. Complete el proceso según el método elegido

## Conceptos de Java Aplicados

Este proyecto implementa los siguientes conceptos fundamentales de Java:

- **Variables y Tipos de Datos** (String, double, int, boolean)
- **Operadores Aritméticos y Lógicos**
- **Operador Ternario** para decisiones rápidas
- **Estructuras de Control:**
  - `if-else` para validaciones
  - `switch-case` para menús y selecciones
  - `while` para validaciones de entrada
  - `do-while` para el menú principal
  - `for` para iteraciones en múltiples productos
- **Scanner** para entrada de datos del usuario
- **Concatenación de Strings**
- **Formateo de Salida**

## Ejemplos de Uso

### Ejemplo 1: Venta con Descuento
```
Cliente compra:
- 2 Laptops = $3,200.000
- 1 Celular = $2,000.000
Subtotal: $5,200.000

Con tarjeta de fidelidad: 15% descuento = $780.000
Total a pagar: $4,420.000

Comisión vendedor (8%): $353.600
```

### Ejemplo 2: Cálculo de Salario
```
Salario Base (Vendedor): $1,500.000
Comisiones Acumuladas: $850.000
Bonificación (Meta 150%): $120.000
-----------------
Salario Bruto: $2,470.000
Deducciones (12%): $296.400
Salario Neto: $2,173.600
```

## Autor

Proyecto desarrollado para el curso de Tutorías Java - Corte 5 DevSenior
Módulo 1: Fundamentos - Clase 3

## Licencia

Este proyecto es de uso educativo y fue desarrollado con fines de aprendizaje.

---

**Desarrollado con Java | DevSenior Tutorías 2025**
