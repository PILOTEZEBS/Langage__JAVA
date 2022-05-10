package exercice1;
import java.util.*;
public class Question3 {
      public static void main (String[] args){
            Scanner lire=new Scanner(System.in);
            int[] tab = {12, 15,13, 10, 8, 9, 13, 14};
            int i;
            System.out.print("les valeur du tableau avant changement sont: ");
            for(i=0; i<8; i++){
                  System.out.print(tab[i]+", ");
            }
            System.out.println("\nentrer le 1er indice a changer:");
            int pi=lire.nextInt();
            System.out.println("entrer le 2em indice a changer:");
            int di=lire.nextInt();  
            int c;
            c=tab[pi-1];
            tab[pi-1]=tab[di-1];
            tab[di-1]=c;
            System.out.print("les valeur du tableau apres changement sont: ");
            for(i=0; i<8; i++){
                  System.out.print(tab[i]+", ");
            }
      }
}
