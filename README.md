# Trivial

## Problema 0

Extraemos el código duplicado a un único método "nuevaPosicionJugador",
al que llamamos desde ambos sitios.

Creamos test unitario "si_sl_principio_saco_un_1_voy_a_casilla_1"

## Problema 1
Modificamos el codigo en el metodo esJugable() en la clase Game,
para que devuelva false cuando hay menos de dos jugadores.

Creamos test unitario "la_partida_tiene_menos_de_2_jugadores"
para probar que si hay menos de dos jugadores devuelve false, y el 
test "la_partida_tiene_igual_o_mas_de_2_jugadores" para probar que 
devuelve true cuando son mas o igual a 2 jugadores.