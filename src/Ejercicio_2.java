public class Ejercicio_2 {
    public static void main(String[] args) {

        // iva de colombia es 19 porciento
        double price = getPrecioIva(5000);
            System.out.println(price);
        }


    static double getPrecioIva(int precio) {
        return precio * 1.19 ;
    }
}