record Producto(String nombre,double precio){}

public class Ejercicio2 {

    public static void main(String[] args) {

        Object obj = new Producto("Mouse",80000);

        if(obj instanceof Producto(String nombre,double precio)){

            System.out.println("Producto: "+nombre);
            System.out.println("Precio: "+precio);

        }

    }

}