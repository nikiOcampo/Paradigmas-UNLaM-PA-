# Guía de Ejercicios: Patrones de Diseño

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01: Composite
Augusto quiere ayudar a su hija con una tarea del jardín de infantes. Le han pedido que lleve materiales para pintar una serie de formas geométricas con colores. Habrá un grupo de formas que pintará de un color, y otro grupo que pintará de otro color, y así sucesivamente. Ella dispone por anticipado de las medidas y ubicaciones precisas de cada figura, pero necesita saber cuántos pomos de cada témpera debe comprar.
Sabiendo que un pomo de témpera tiene un poder cubritivo de 100cm2, y que no puede comprar "fracciones de pomo", se te pide que le muestres una forma de calcular las cantidades a comprar utilizando el patrón de diseño Composite.

> **Nota:** Las figuras no se solapan entre sí. Cada figura estará pintada al 100% del color indicado.

## Ejercicio 02: State
Considere que tiene una clase llamada "Tank" que representa a un tanque Terran en Starcraft 2. Implemente el patrón State para modelar los dos posibles estados del tanque: el estado "Modo Tanque" y el estado "Modo Asedio". A continuación, se proporcionan varios métodos que puede incluir en la implementación:

- Tank: la clase principal que representa un tanque Terran y contiene una referencia a un objeto de estado concreto.
- TankState: la interfaz que define los métodos comunes que deben implementar los estados concretos.
- TankModeTankState: una clase que implementa la interfaz TankState y representa el estado "Modo Tanque" del tanque. Debe proporcionar implementaciones para los métodos específicos de este estado, como moverse() y atacar().
- TankModeSiegeState: una clase que implementa la interfaz TankState y representa el estado "Modo Asedio" del tanque. Debe proporcionar implementaciones para los métodos específicos de este estado, como moverse() y atacar().