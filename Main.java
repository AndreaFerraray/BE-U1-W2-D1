
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Random random = new Random();

        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }


        for (int num : array) {
            System.out.println(num);


    }     System.out.println("inserisci un numero");
        Scanner scanner=new Scanner(System.in);
        int numero = scanner.nextInt() ;
        if(numero <10){
        System.out.println("Hai inserito il numero: " + numero);
        }
        else{
            System.out.println("inserisci un valore minore di 10");
        };
        System.out.println("inserisci la posizione in cui vuoi inserirlo" );
        int posizione = scanner.nextInt();
        if (posizione >=0 && posizione < array.length){
            array[posizione]=numero;
            System.out.println("hai inserito " + numero + "nella posizione " + posizione );

        }

        else{
            System.err.println("posizione non accettata");

        }
        for (int num : array) {
            System.out.println(num);

        scanner.close();

} ;}}
