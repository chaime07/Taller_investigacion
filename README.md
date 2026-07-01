# Taller: Métodos Abreviados y Sintaxis Comprimidas en Java

Este repositorio contiene la investigación, análisis y ejemplos prácticos correspondientes al **Taller de Investigación sobre Métodos Abreviados y Sintaxis Comprimidas en Java**. El objetivo del proyecto es documentar características modernas del lenguaje que permiten escribir código más eficiente, legible y mantenible, reduciendo el código repetitivo (*boilerplate*).

---

##  Estructura del Proyecto

El proyecto está dividido en dos secciones principales, cubriendo un total de 20 características sintácticas avanzadas:
1. **Temas Propuestos (15):** Selección de las mejores herramientas de optimización sintáctica tradicionales y modernas desde Java 7 hasta Java 16.
2. **Investigación Adicional (5):** Análisis de características de vanguardia introducidas en las versiones más recientes, incluyendo **Java 17** y **Java 21**.

---

##  Explicación de los Ejemplos Implementados

Para cada tema se ha desarrollado una comparación directa entre la **Forma Tradicional** (verbosa) y la **Forma Abreviada**, estructurado bajo los siguientes criterios:
- **Explicación:** Fundamento teórico de la sintaxis.
- **Ventajas y Desventajas:** Análisis de legibilidad, mantenimiento y rendimiento.
- **Cuándo utilizarlo:** Guía práctica de aplicación en desarrollo real.

### Resumen de Características Implementadas

#### Parte 1: Temas Propuestos (Listado del Instructor)
1. **Operador Ternario (`?:`):** Compactación de estructuras condicionales `if-else` en asignaciones de una sola línea.
2. **Ciclo For-each:** Iteración limpia y segura sobre colecciones e iterables sin manejo manual de índices.
3. **Inferencia de Tipos (`var`):** Omisión del tipo explícito en variables locales delegando la deducción al compilador (Java 10+).
4. **Expresiones Lambda:** Implementación compacta de interfaces funcionales promoviendo la programación funcional (Java 8+).
5. **Referencias a Métodos (`::`):** Reducción extrema de lambdas al invocar directamente métodos existentes (Java 8+).
6. **API Streams:** Procesamiento declarativo y encadenado de secuencias de datos mediante transformaciones (*pipelines*) (Java 8+).
7. **Clase `Optional`:** Contenedor elegante para mitigar y manejar la ausencia de valores sin usar `null` (Java 8+).
8. **Switch Expression:** Evolución del `switch` clásico como expresión que retorna valores directos usando `->` (Java 14+).
9. **Text Blocks:** Cadenas multilínea literales delimitadas por tres comillas dobles, perfectas para scripts SQL, JSON o HTML sin concatenaciones (Java 15+).
10. **Records:** Clases transportadoras de datos inmutables con getters, constructor y `toString` automáticos (Java 16+).
11. **Pattern Matching con `instanceof`:** Combinación de verificación de tipo y casteo automático en una única línea (Java 16+).
12. **Métodos de Fábrica (`List.of` / `Set.of`):** Inicialización rápida e inmutable de colecciones sin instanciaciones repetitivas (Java 9+).
13. **Método `forEach()`:** Operaciones iterativas directas y funcionales sobre colecciones (Java 8+).
14. **Método `removeIf()`:** Eliminación condicional segura en colecciones sin riesgo de `ConcurrentModificationException` (Java 8+).
15. **Operador Diamond (`<>`):** Omisión redundante de tipos genéricos en la instanciación de constructores (Java 7+).

#### Parte 2: Investigación Adicional (Modernización Avanzada)
1. **Pattern Matching para `switch` (Java 21):** Estructuras de decisión complejas basadas directamente en el tipo del objeto y no solo en constantes.
2. **Record Patterns (Java 21):** Desestructuración y extracción inmediata de las propiedades de un `Record` durante una validación.
3. **Clases Selladas (`sealed`):** Restricción y control absoluto a nivel de compilador sobre qué clases pueden heredar de una base (Java 17).
4. **Secuencias en Colecciones (`SequencedCollection`):** API unificada para manipulación directa del primer y último elemento de una colección ordenada (Java 21).
5. **Copia Inmutable (`List.copyOf`):** Mecanismo de programación defensiva para clonar listas bloqueando cualquier mutación externa (Java 10+).

---

##  Referencias Académicas Utilizadas

- **Oracle Java SE Documentation:** Especificaciones de las JEPs (*JDK Enhancement Proposals*).
- **Effective Java (3rd Edition) - Joshua Bloch:** Buenas prácticas en colecciones, `Optional` e inmutabilidad.
- **OpenJDK Project:** Documentación técnica de estándares para Java 17 y Java 21.

---
*Desarrollado como entregable del Taller de Investigación sobre el lenguaje de programación Java.*