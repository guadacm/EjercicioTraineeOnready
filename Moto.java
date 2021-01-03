/**
 * @author Guadalupe Medina
 * @version 01/2021
 * E-Mail: guada.m@gmail.com
*/
import java.text.DecimalFormat;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("###,###.00");
		return ("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo()	+ " // Cilindrada: " + this.getCilindrada() + " // Precio: $" + decimal.format(this.getPrecio()));
	}
}
