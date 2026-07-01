import java.util.ArrayList;

public class Ejercicio1{

    public static void main(String[] args){

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Pera");

        System.out.println(frutas.getFirst());
        System.out.println(frutas.getLast());

    }

}