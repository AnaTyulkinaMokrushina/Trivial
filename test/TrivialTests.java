import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        //Arranque
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    //Problema 1
    @Test
    public void la_partida_tiene_menos_de_2_jugadores(){
        Game game = new Game();
        game.agregar("Juan");

        Assertions.assertFalse(game.esJugable());
    }
    @Test
    public void la_partida_tiene_igual_o_mas_de_2_jugadores(){
        Game game = new Game();
        game.agregar("Juan");
        game.agregar("Maria");

        Assertions.assertTrue(game.esJugable());
    }

    //Problema 2
    @Test
    public void la_partida_tiene_mas_de_6_jugadores(){
        Game game = new Game();
        try{
            game.agregar("Juan");
            game.agregar("Maria");
            game.agregar("Pepe");
            game.agregar("Ana");
            game.agregar("Carlos");
            game.agregar("Teresa");
            game.agregar("Marcos");
            Assertions.assertTrue(game.esJugable());
        }catch (ArrayIndexOutOfBoundsException e){
            Assertions.assertFalse(game.esJugable());
        }
    }
    @Test
    public void la_partida_tiene_menos_o_igual_a_6_jugadores(){
        Game game = new Game();
        try{
            game.agregar("Juan");
            game.agregar("Maria");
            game.agregar("Pepe");
            game.agregar("Ana");
            game.agregar("Carlos");
            game.agregar("Teresa");
            Assertions.assertTrue(game.esJugable());
        }catch (ArrayIndexOutOfBoundsException e){
            Assertions.assertFalse(game.esJugable());
        }
    }

}
