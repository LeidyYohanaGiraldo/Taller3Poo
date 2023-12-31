package PooTaller3.JuegoDeCartas;

/**
 *
 * @author Leidy Giraldo
 */
public class Copas implements ICarta {

    private int numero;
    private String naipe;

    public Copas(int numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    @Override
    public String mostrarCarta() {
        return naipe + " " + numero;
    }

    @Override
    public int valorNumerico() {
        return numero;
    }

    @Override
    public String obtenerNaipe() {
        return naipe;
    }

}
