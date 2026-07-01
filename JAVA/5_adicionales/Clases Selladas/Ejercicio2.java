sealed interface Animal permits Perro,Gato{}

final class Perro implements Animal{}

final class Gato implements Animal{}

public class Ejercicio2{

    public static void main(String[] args){

        Animal a = new Gato();

        if(a instanceof Gato){

            System.out.println("Es un gato");

        }

    }

}