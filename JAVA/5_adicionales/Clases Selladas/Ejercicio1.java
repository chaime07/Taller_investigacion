sealed interface Vehiculo permits Carro,Moto{}

final class Carro implements Vehiculo{}

final class Moto implements Vehiculo{}

public class Ejercicio1{

    public static void main(String[] args){

        Vehiculo v = new Carro();

        if(v instanceof Carro){

            System.out.println("Es un carro");

        }

    }

}