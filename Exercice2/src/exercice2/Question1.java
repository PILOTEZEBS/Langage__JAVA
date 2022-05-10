
package exercice2;
import java.util.Scanner;

public class Question1 {

      public static void main(String[] args) {
            Scanner lire=new Scanner(System.in);
            int i;
            int[] tab=new int[6];
            for(i=0; i<6; i++){
                  System.out.println("entrer la valeur "+ (i+1) +" du tableau: ");
                  tab[i]=lire.nextInt();
            }
            int max=tab[0];
            for(i=1; i<6; i++){
                  if(tab[i]>max){
                        max=tab[i];
                  }
            }
            System.out.println("le max de votre tableau est: "+max);
      }
      
}
