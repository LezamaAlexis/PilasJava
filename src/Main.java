import java.util.Scanner;

/**
 * Created by Acer on 13/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Pila pila=new Pila();
        Scanner sLector = new Scanner(System.in);
        String opcion;
        do{
            System.out.println("************ STACKS *********");
            System.out.println("********* Menú Principal *********");
            System.out.println("________________________________");
            System.out.println("|1. Insertar    |   2. Mostrar |");
            System.out.println("|3. Buscar      |   4. Borrar  |");
            System.out.println("|5. Tamaño      |   0. Salir   |");
            System.out.println("|_______________|______________|");


            opcion = sLector.nextLine();
            switch (opcion) {
                case "0": {
                    System.exit(0);
                    break;
                }
                case "1": {
                    System.out.println("Insertar");

                    pila.push();
                    break;
                }
                case "2": {
                    System.out.println("Mostrar");
                    pila.peek();
                    break;
                }
                case "3": {
                    System.out.println("Buscar");
                    pila.Buscar();
                    break;
                }
                case "4": {
                    System.out.println("Borrar");
                    pila.pop();
                    break;
                }
                case "5": {
                    System.out.println("Tamaño");
                    pila.tamaño();
                    break;
                }
                default: {
                    System.out.println("opcion incorrecta");
                    break;

                }
            }
        }while(!opcion.equals("0"));

    }
}
