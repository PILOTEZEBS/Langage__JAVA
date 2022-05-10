
package exercice2;
import java.util.*;
public class Question3 {
     public static void main(String[] args){
           Scanner lire=new Scanner(System.in);
           System.out.println("entrer la taille de votre taleau: ");
           int n=lire.nextInt();
           int[] tab=new int[n];
           int i, s=0;
           for(i=0; i<n; i++){
                 System.out.println("entrer l entier "+ (i+1));
                 tab[i]=lire.nextInt();
                 s=s+tab[i];
           }
           float m=(float)s/n;
           int max=tab[0];
           for(i=1; i<n; i++){
                 if(tab[i]>max){
                       max=tab[i];
                 }
           }
           System.out.println("le max= "+max+" ; la moyenne= "+m);
     }
}
