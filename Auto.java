/**
 * @author Guadalupe Medina
 * @version 01/2021
 * E-Mail: guada.m@gmail.com
*/
import java.text.DecimalFormat;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("###,###.00");
		return ("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo()	+ " // Pertas: " + this.getPuertas() + " // Precio: $" + decimal.format(this.getPrecio()));
	}
    
}
