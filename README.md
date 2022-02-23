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