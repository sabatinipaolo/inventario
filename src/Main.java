import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vector<Prodotto> product= new Vector<Prodotto>();
        int scelta ;
        Scanner s = new Scanner(System.in);

        do{
            System.out.println("=== GESTIONE INVENTARIO ===");
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Visualizza inventario");
            System.out.println("0. Esci");
            scelta = s.nextInt();
            s.nextLine();
            switch(scelta){

                case 1:
                    System.out.println("inserisci nome: ") ;
                    String nome= s.nextLine();
                    System.out.println("inserisci prezzo: ");
                    double prezzo= s.nextInt();
                    s.nextLine();
                    System.out.println("inserisci quantita: ");
                    int quantita = s.nextInt();
                    s.nextLine();
                    System.out.println("congratulazioni hai aggiunto un prodottto");
                    product.add(new Prodotto(nome,prezzo, quantita));
                    break;




                case 2:
                    System.out.println("inventario");
                    for(Prodotto prd : product ){
                        System.out.println(prd);
                    }
                    break;


                case 0:
                    System.out.println("stai uscendo");
                    break;

                default:
                    System.out.println("SCELTA NON VALIDA ");
            }

        }while(scelta != 0);
        s.close();
    }
}