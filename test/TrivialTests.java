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

}
