<<<<<<< HEAD
## Arquitectura de tres capas
El proyecto tiene una arquitectura de tres capas:
- **Capa de Presentación**: Interactúa con el usuario final.
- **Capa de Negocio**: Contiene la lógica central del sistema.
- **Capa de Datos**: Maneja la persistencia y recuperación de datos.

=======
# Sistema de Reservas

## Descripción del Proyecto
Este proyecto es un sistema de reservas de ambientes. 
El sistema permite notificar a los usuarios sobre el estado de sus reservas.

## Arquitectura de tres capas 
El proyecto tiene una arquitectura de tres capas:
- **Capa de Presentación**: Interactúa con el usuario final.
- **Capa de Negocio**: Contiene la lógica central del sistema.
- **Capa de Datos**: Maneja la persistencia y recuperación de datos.

>>>>>>> 4c3b3dc92455ee40da9318d5b625922800079feb
## Patrones de Diseño Utilizados
- **Singleton**: Para asegurar que solo exista una instancia de `GestorDeReservas`.
- **Observer**: Para notificar a los usuarios (observadores) sobre los cambios en las reservas.
- **Bridge**: Para separar la abstracción (`Notificacion`) de su implementación (`NotificacionConsola`).

## Principios SOLID Aplicados
<<<<<<< HEAD
- **S**: Single Responsibility Principle (SRP): Cada clase tiene una única responsabilidad.
- **O**: Open/Closed Principle (OCP): Las clases están abiertas para la extensión pero cerradas para la modificación.
- **L**: Liskov Substitution Principle (LSP): Las subclases deben ser sustituibles por sus superclases.
- **I**: Interface Segregation Principle (ISP): Las interfaces específicas aseguran que las clases no dependan de métodos que no usan.
- **D**: Dependency Inversion Principle (DIP): Las clases dependen de abstracciones en lugar de concreciones.
=======
- Single Responsibility Principle (SRP): Se puede ver single responsibility por que cada clase maneja solo sus responsabilidades, lo podemos ver en reserva y gestor de reserva
- Open/Closed Principle (OCP): Las clases están abiertas para la extensión pero cerradas para la modificación.
- Liskov Substitution Principle (LSP): Las subclases deben ser sustituibles por sus superclases.
- Interface Segregation Principle (ISP): Las interfaces específicas aseguran que las clases no dependan de métodos que no usan.
- Dependency Inversion Principle (DIP): Las clases dependen de abstracciones en lugar de concreciones.
>>>>>>> 4c3b3dc92455ee40da9318d5b625922800079feb

## Instrucciones para Ejecutar la Aplicación
1. **Clonar el repositorio**:
    ```sh
    git clone https://github.com/tu-usuario/SistemaDeReservas.git
    cd SistemaDeReservas
    ```

2. **Abrir el proyecto en BlueJ**:
    - Abre BlueJ.
    - Selecciona `Project` > `Open Project...`.
    - Navega a la carpeta donde clonaste el repositorio y ábrelo.

3. **Ejecutar la aplicación**:
    - Compila todas las clases.
    - Ejecuta la clase `SistemaDeReservas` que se encuentra en el paquete `presentacion`.

## Estructura del Proyecto
```plaintext
SistemaDeReservas/
├── datos/
│   ├── NotificacionConsola.java         # Implementación de notificación específica para consola
│   ├── NotificacionImplementacion.java  # Interfaz para las implementaciones de notificación
├── negocio/
│   ├── GestorDeReservas.java            # Lógica central para gestionar las reservas
│   ├── Notificacion.java                # Clase abstracta para notificaciones
│   ├── NotificacionNormal.java          # Implementación de notificación normal
│   ├── NotificacionUrgente.java         # Implementación de notificación urgente
│   ├── Notificable.java                 # Interfaz para objetos que pueden ser notificados
│   ├── Observador.java                  # Interfaz para observadores
│   ├── Reserva.java                     # Clase abstracta para reservas
│   ├── ReservaDeAmbiente.java           # Implementación de reserva específica para ambientes
│   ├── Usuario.java                     # Representación de un usuario en el sistema
├── presentacion/
│   ├── SistemaDeReservas.java           # Punto de entrada de la aplicación
<<<<<<< HEAD
├── README.md                            # Documentación del proyecto
=======
├── README.md                            # Documentación del proyecto
>>>>>>> 4c3b3dc92455ee40da9318d5b625922800079feb
