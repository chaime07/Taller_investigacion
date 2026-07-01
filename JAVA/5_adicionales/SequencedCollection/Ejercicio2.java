import java.util.ArrayList;

public class Ejercicio2{

    public static void main(String[] args){

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Juan");
        estudiantes.add("Ana");

        estudiantes.addFirst("Pedro");
        estudiantes.addLast("Laura");

        System.out.println(estudiantes);

    }

}