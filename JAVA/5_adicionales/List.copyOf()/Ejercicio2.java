import java.util.ArrayList;
import java.util.List;

public class Ejercicio2{

    public static void main(String[] args){

        List<String> ciudades = new ArrayList<>();

        ciudades.add("Bogotá");
        ciudades.add("Medellín");

        List<String> copia = List.copyOf(ciudades);

        ciudades.add("Cali");

        System.out.println("Original: " + ciudades);
        System.out.println("Copia: " + copia);

    }

}