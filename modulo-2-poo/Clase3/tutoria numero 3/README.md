## orden de creacion 

NIVEL 1 (Independientes)
├─ MenuItem.java
└─ Employee.java

NIVEL 2 (Usan Nivel 1)
├─ OrderItem.java (usa MenuItem)
└─ Menu.java (usa MenuItem[]) → AGREGACIÓN

NIVEL 3 (Composición)
└─ Order.java (crea OrderItem[]) → COMPOSICIÓN

NIVEL 4 (Asociación)
└─ Table.java (usa Order)

NIVEL 5 (Agrega todo)
└─ Restaurant.java (usa Table[], Employee[], Menu) → AGREGACIÓN

NIVEL 6 (Ejecuta todo)
└─ RestaurantApp.java


## COMPOSICIÓN (Relación Fuerte - "NO PUEDE EXISTIR SIN")

Analogía: Una casa y sus habitaciones

Si destruyes la casa, las habitaciones dejan de existir
La casa CREA las habitaciones cuando se construye


En código: El objeto "TODO" crea el array internamente

Order crea su propio array de OrderItem[]
├─ El Order NACE con su array creado dentro
└─ Si eliminas el Order, los OrderItems no tienen sentido

## AGREGACIÓN (Relación Débil - "PUEDE EXISTIR INDEPENDIENTEMENTE")

Analogía: Una universidad y sus profesores

Si cierras la universidad, los profesores siguen existiendo
Los profesores existían antes y pueden ir a otra universidad


En código: El objeto "TODO" recibe el array ya creado desde afuera