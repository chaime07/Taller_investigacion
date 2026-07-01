public class Ejercicio2 {

    static void figura(Object obj){

        switch(obj){

            case String s -> System.out.println("Figura: " + s);

            case Integer lados ->
                System.out.println("Tiene " + lados + " lados");

            default ->
                System.out.println("Dato no válido");
        }

    }

    public static void main(String[] args) {

        figura("Cuadrado");
        figura(4);

    }
}