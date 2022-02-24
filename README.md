# Trivial

## Problema 0

Extraemos el código duplicado a un único método "nuevaPosicionJugador",
al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_un_1_voy_a_casilla_1"

## Problema 1
Modificamos el código en el método esJugable() en la clase Game,
para que devuelva false cuando hay menos de dos jugadores.

Creamos test unitario "la_partida_tiene_menos_de_2_jugadores"
para probar que si hay menos de dos jugadores devuelve false, y el 
test "la_partida_tiene_igual_o_mas_de_2_jugadores" para probar que 
devuelve true cuando son mas o igual a 2 jugadores.

## Problema 2
Modificamos el tamaño de los arrays: "posiciones", "monederos" y "enCasillaCastigo"
de [6] a [7].
También modificamos el código del método esJugable() en la clase Game para que devuelva
false si son mas de 6 jugadores.

Creamos test unitario "la_partida_tiene_mas_de_6_jugadores" , 
para probar que esJugable devuelve false si son mas de 6 jugadores, y 
creamos test "la_partida_tiene_menos_o_igual_a_6_jugadores"
para probar que si tiene menos o igual que 6 esJugable devuelve true

## Problema 3
modificamos tirar dado poniendo que "enCasillaCastigo[jugadorActual] = false".
Tambien se ha modificado enCasillaCastigo para que sea public y asi salga en los test.

Creamos tests unitarios jugador_entra_en_la_carcel_despues_fallar_una_pregunta, que comprueba 
que el jugador que falla la pregunta entra en la carcel y el test
jugador_sale_de_la_carcel_despues_de_sacar_impar que comprueba que el jugador
que saca impar sale de la carcel.

## Problema 4
Modificados GameLauncher.class, agregando un boolean ganador, el cual implementamos
en el while. 

## Problema 6
Se ha modificado el codigo de Game del metodo fueRespuestaCorrecta, para simplificar
el codigo. 

## Problema 7
Se ha modificado el metodo nuevaPosicionJugador() poniendo un bucle con una resta de la 
posicion del jugador para que se vuelva a poder jugar el tablero.

Se ha creado un test unitario que comprueba que el jugador vuelve a iniciar el tablero despues
de acabar las 11 casillas. 