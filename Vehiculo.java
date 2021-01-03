/**
 * @author Guadalupe Medina
 * @version 01/2021
 * E-Mail: guada.m@gmail.com
*/
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String mostrarMarcaModelo() {
        return (this.getMarca() + " " + this.getModelo());
	}
    @Override
    public int compareTo(Vehiculo o) {
        //Configuracion para ordenar de mayor a menor precio
        int aux = Double.compare(o.getPrecio(),this.getPrecio());
        return aux;
    }
}
