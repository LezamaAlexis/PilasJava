import java.util.Scanner;

/**
 * Created by Acer on 13/11/2017.
 */
public class Pila {
    Scanner teclado = new Scanner(System.in);
    Nodo primero;
    int i = 0;

    public Pila(){
        primero = null;
    }

    public boolean vacia(){
        return(primero==null);
    }

    public void push(){
        Nodo nuevo = new Nodo();
        System.out.println("ingrese el dato que contendra el nuevo nodo");
        nuevo.dato = teclado.nextInt();

        nuevo.siguiente = primero;
        primero = nuevo;
        i ++;
        System.out.println("\n Nodo ingresado con exito");
    }
    public void peek(){
        Nodo actual = new Nodo();
        actual = primero;
        if(primero != null){
            while(actual != null){
                System.out.println(" "+ actual.dato);
                actual = actual.siguiente;
            }
        }else{
            System.out.println(" \n La pila se encuentra vacia\n ");
        }
    }
    public void Buscar(){
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;

        System.out.println("ingrese el dato que desea buscar");
        int nodoBuscado = teclado.nextInt();
        if(primero != null){
            while(actual != null && encontrado != true){
                if(actual.dato == nodoBuscado){
                    System.out.println("\n Nodo con el dato " + nodoBuscado + " Encontrado \n");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado){
                System.out.println("\n Nodo no encontrado\n");
            }
        }
    }
    public void pop(){
        if(primero == null){
            System.out.println("La pila se encuentra vacia");
        }else{
            primero = primero.siguiente;
            System.out.println("Se elimino elemento");
            i --;
        }
    }
    public void tamaño(){
        System.out.println("El tamaño de la pila es de: " + i +"  Elementos");
    }
}

