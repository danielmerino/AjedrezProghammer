# AjedrezProghammer

Encontré este código en un blog, Proghammer, que lo construía por capítulos explicando el código. La interfaz gráfica es de las mejores que he visto en un juego opensource y lo malo es que, como era un ejemplo de programación, no profundiza demasiado en implementar las reglas.

Tampoco se trabaja mucho el algoritmo, pero un juego con un minimax de profundidad 1 es tan malo que me parece el juego ideal para un niño (mi hijo mayor) que aprende a jugar. Con profundidad 2 ya da algo más de guerra, pero no mucha. Con profundidad 3 tarda demasiado en pensar.

## Cosas que me gustaría mejorar sobre el código inicial:

- Movimiento inicial de peones -> ya hecho.

- Configuración de juego personalizable (poner las piezas que yo quiera, por ejemplo 4 peones y un caballo en cada bando) -> ya hecho.

- Derivado del punto anterior: añadir condiciones nuevas de victoria (quedarse sin piezas). -> ya hecho.

- Detectar el mate y obligar a evitarlo (ahora se gana comiéndose al rey)

- Enroques.

- Promoción (siempre a dama).

- Mostrar piezas capturadas fuera del tablero.

- Comer al paso.

- Modo aprendizaje opcional: que al mover marque en rojo las casillas donde la pieza puede ser comida y que marque cuando una pieza esté en peligro tras mover el oponente.

## Cosas MUY difíciles que me gustaría hacer y que no podré:

- Vista de tablero opuesta jugando con negras (creo que el diseño inicial hace muy difícil algo así)

- Un minimax que con profundidad >2 no tarde tanto tiempo en mover.

## Cómo jugar.

- Hay un archivo AjedrezProghammer.jar en la carpeta bin. Pulsa sobre el archivo (botón derecho y guardar NO funcionará)
- En la pantalla que aparece, hay un botón Download para descargar el jar.
- En Windows, pulsa sobre Inicio y en el campo de texto escribe cmd y dale a intro.
- En la pantalla que aparece escribe "java" y pulsa intro. Si da error tendrás que instalar java en tu ordenador.
- Copia el archivo jar en la carpeta donde has aparecido al poner cmd.
- Finalmente, escribe "java -jar AjedrezProghammer.jar" y el programa debería funcionar.
- Si quieres poner piezas concretas añade a la línea anterior dos números binarios de 16 dígitos. Los 1 serán las piezas y los 0 los huecos. Por ejemplo los cuatro peones centrales serían "0011110000000000".
