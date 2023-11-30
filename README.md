# Desarrollador Java Intermedio - Trabajo Práctico Integrador

## Sistema de Reporte de Incidentes

### Contexto general

Una importante empresa de soporte operativo solicita el diseño y desarrollo de un sistema que le permita la generación y seguimiento de los incidentes que se presentan. La empresa brinda soporte operativo sobre distintas aplicaciones (SAP, Tango, etc.) y sistemas operativos (Windows, MacOS, Linux Ubuntu).

- **RRHH:** Realiza altas, bajas y modificaciones de los técnicos.
- **Comercial:** Incorpora nuevos clientes y administra sus datos.
- **Mesa de Ayuda:** Atiende llamadas e ingresa incidentes.

### Ciclo de vida de un incidente

1. Cliente llama a la mesa de ayuda.
2. Mesa de ayuda ingresa datos del cliente y selecciona el servicio para reportar un incidente.
3. Sistema muestra técnicos disponibles.
4. Operador elige técnico y sistema informa tiempo estimado.
5. Se informa al cliente sobre la entrada del incidente y la fecha de posible resolución.
6. Sistema notifica al técnico sobre el nuevo incidente.
7. Técnico resuelve el incidente y marca como "resuelto".
8. Cliente recibe notificación por email.

### Otros requerimientos

- RRHH emite reportes diarios de incidentes asignados a técnicos y sus estados.
- Operador puede agregar "un colchón" de horas estimadas para problemas "complejos".
- Alta de incidentes con problemas relacionados.
- Informar:
    - Técnico con más incidentes resueltos en los últimos N días.
    - Técnico con más incidentes resueltos de una especialidad en los últimos N días.
    - Técnico que más rápido resolvió los incidentes.

### Consideraciones

- Cada tipo de problema puede ser solucionado por una o varias especialidades.
- Operadores y técnicos pueden definir tiempos de resolución y medios de notificación.
- Notificaciones pueden ser por Email o WhatsApp.

### Metodología

Metodología iterativa e incremental. Tres entregas con modelado, implementación, persistencia y exposición del trabajo.

### Entregas

#### Entrega 1

1. Modelo de datos (DER físico) que brinde solución al dominio.
2. Código con modelado de clases en un repositorio de [GitHub](https://github.com/).

Es recomendable usar Maven y la dependencia de Lombok para facilitar la generación de Setters y Getters.

#### Entrega 2

1. Mapeo (anotaciones JPA) de entidades para persistir el modelo con Hibernate.
2. Repositorios/Servicios para los siguientes requerimientos:
    - Técnico con más incidentes resueltos en los últimos N días.
    - Técnico con más incidentes resueltos de una especialidad en los últimos N días.
    - Técnico que más rápido resolvió los incidentes.

[Continuación en la próxima entrega...](#entrega-3)
