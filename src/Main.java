import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, contador =0;
        aleatorio = (int)(Math.random()*100);
        System.out.print(aleatorio);
        do {
            System.out.println("Ingrese un numero");
            numero = entrada.nextInt();
            contador ++;
            if (numero<aleatorio){
                System.out.println("El numero a adivinar es mayor");
            }
            else {
                if (numero>aleatorio);
                System.out.println("El numero a adivinar es menor");

            }
        }while (numero!=aleatorio);
        System.out.println("Has adivinado el numero y tus numero de intentos fueron: "+contador);
    }
}