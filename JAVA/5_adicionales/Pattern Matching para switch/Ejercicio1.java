public class Ejercicio1 {

    static void mostrar(Object dato) {

        switch (dato) {
            case Integer i -> System.out.println("Número entero: " + i);
            case Double d -> System.out.println("Número decimal: " + d);
            case String s -> System.out.println("Texto: " + s);
            default -> System.out.println("Tipo desconocido");
        }
    }

    public static void main(String[] args) {
        mostrar(100);
        mostrar(15.7);
        mostrar("Java");
    }
}