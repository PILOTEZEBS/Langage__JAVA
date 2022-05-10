
package exercice2;

import java.util.*;

public class Question2 {
     public static void main(String[] args){
           Scanner lire=new Scanner(System.in);
            int i,s=0;
            int[] tab=new int[6];
            for(i=0; i<6; i++){
                  System.out.println("entrer la valeur "+ (i+1) +" du tableau: ");
                  tab[i]=lire.nextInt();
                  s=s+tab[i];
            } 
            float m=(float)s/6;
            System.out.println("la moyenne vaut: "+m);
     }
}
