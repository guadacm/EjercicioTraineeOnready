/**
 * @author Guadalupe Medina
 * @version 01/2021
 * E-Mail: guada.m@gmail.com
*/
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;

public class EjercicioTraineeOnready {
    static LinkedList<Vehiculo> lista = new LinkedList<Vehiculo>();

    public static void main(String[] args) {
        Vehiculo aux;

        DecimalFormat decimal = new DecimalFormat("###,###.00");
        cargarLista();
        mostrarLista();
        System.out.println("=============================");
        aux = masCaro();
        System.out.println("Vehículo más caro: " + aux.mostrarMarcaModelo());
        aux = masBarato();
        System.out.println("Vehículo más barato: " + aux.mostrarMarcaModelo());
        aux = contieneY();
        System.out.println("Vehículo que contiene en el modelo la letra 'Y' : " + aux.mostrarMarcaModelo() + " "
                + decimal.format(aux.getPrecio()));
        System.out.println("=============================");
        mostrarListaOrdenada();

    }

    public static void cargarLista() {
        lista.add(new Auto("Peugeot", "206", 4, 200000.00));
        lista.add(new Moto("Honda", "Titan", 125, 60000.00));
        lista.add(new Auto("Peugeot", "208", 5, 250000.00));
        lista.add(new Moto("Yamaha", "YBR", 160, 80500.50));
    }

    public static void mostrarLista() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    public static Vehiculo masCaro() {
        Vehiculo aux = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).getPrecio() > aux.getPrecio()) {
                aux = lista.get(i);
            }
        }
        return aux;
    }

    public static Vehiculo masBarato() {
        Vehiculo aux = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).getPrecio() < aux.getPrecio()) {
                aux = lista.get(i);
            }
        }
        return aux;
    }

    public static Vehiculo contieneY() {
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).getMarca().contains("Y")) {
                return lista.get(i);
            }
        }
        return null;
    }

    public static void mostrarListaOrdenada() {
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).mostrarMarcaModelo());
        }
    }
}