import java.util.ArrayList;
import java.util.List;

public class Ejercicio1{

    public static void main(String[] args){

        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");

        List<String> copia = List.copyOf(nombres);

        System.out.println(copia);

    }

}