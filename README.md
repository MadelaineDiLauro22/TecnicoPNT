# Ejercicio Escuelita Somos PNT

Este proyecto implementa un programa en Java para gestionar un supermercado de barrio. El programa carga una lista de productos, los muestra por consola y luego muestra el producto más caro y el más barato según los criterios especificados.

## Requisitos del proyecto

- **Diseño orientado a objetos:** Se ha diseñado una solución utilizando programación orientada a objetos para una mejor organización y mantenibilidad del código.
- **Salida por consola:** La salida del programa se realiza por consola y cumple con el formato requerido en el enunciado.
- **Java 8:** El proyecto utiliza únicamente las clases provistas por Java 8.
- **Carga de productos en un único método:** Los productos se cargan en un único método para simplificar el proceso de inicialización.
- **Algoritmo independiente de la cantidad o tipo de productos:** El algoritmo utilizado para imprimir la lista de productos y determinar el producto más caro y más barato no depende de la cantidad o tipo de productos.
- **Interfaz Comparable:** Se implementa la interfaz Comparable para comparar los productos según su precio.
- **Sobrescritura de toString():** Se sobrescribe el método toString() en la clase Producto para personalizar la representación en forma de cadena de texto de cada objeto Producto.

## Ejecución del programa

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/MadelaineDiLauro22/Tecnico.PNT.git
   ```

2. **Importar el proyecto a Eclipse:**
   - Abre Eclipse.
   - Selecciona File > Import.
   - En el cuadro de diálogo Import, expande la carpeta General y selecciona Existing Projects into Workspace.
   - Haz clic en Next.
   - En el campo Select root directory, navega hasta la ubicación donde clonaste el repositorio y selecciona la carpeta del proyecto.
   - Haz clic en Finish.

3. **Ejecutar el programa:**
   - Abre la clase Main.java.
   - Haz clic derecho en el editor y selecciona Run As > Java Application.

4. **Visualizar la salida:**
   - La salida del programa se mostrará en la consola de Eclipse.

## Estructura del proyecto

El proyecto está estructurado de la siguiente manera:

```
ejercicio-escuelita-somos-pnt/
│
├── src/
│   ├── com/
│   │   └── somospnt/
│   │       └── model/
│   │           ├── Main.java
│   │           ├── Producto.java
│   │           └── Supermercado.java
│   └── README.md
└── .gitignore
```

- **src/:** Contiene el código fuente del proyecto.
- **com/somospnt/model/:** Contiene las clases Java del modelo.
- **Main.java:** Punto de entrada del programa.
- **Producto.java:** Definición de la clase Producto.
- **Supermercado.java:** Implementación de la lógica del supermercado.
- **.gitignore:** Archivo de configuración de Git para ignorar archivos y carpetas no deseados.

Para más detalles sobre la implementación del proyecto, consulta el código fuente y los comentarios en cada clase.

---
