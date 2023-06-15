package ejpila;

/**
 *
 * @author Ana Salas
 */
public class Animal {

    private String especie;
    private int tiempoVida;
    private double precio;

    public Animal() {
        this.especie = "";
        this.tiempoVida = 0;
        this.precio = 0.00d;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the tiempoVida
     */
    public int getTiempoVida() {
        return tiempoVida;
    }

    /**
     * @param tiempoVida the tiempoVida to set
     */
    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
