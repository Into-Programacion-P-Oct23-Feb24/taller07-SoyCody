package problema02;

public class Problema02 {

    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;
        int suma = 2;
        do {
            System.out.printf("%s\n", numero);
            suma = suma + 2;
            numero = numero + suma;
            contador = contador + 1;
        } while (contador <= 9);
    }
}
