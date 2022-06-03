
package statistique;
import java.util.Scanner;
public class Statistique {
       //@zebs code isj
    public static void main(String[] args) {
        Scanner lire=new Scanner(System.in);
            System.out.println("Bonjour! entrer le nombre de valeur que vous voulez avoir dans votre tableau: ");
            int nbreval=lire.nextInt();
            while(nbreval<=0){
                if(nbreval<0){
                    System.out.print("La valeur que vous avez entrer est negative! entrer un nombre  positif: ");
                    int nbreva=lire.nextInt();
                    nbreval=nbreva;
                }
                if(nbreval==0){
                     System.out.print("vous n avez aucune valeur pour votre tableau entrer une valeur positive: ");
                     int nbreva=lire.nextInt();
                     nbreval=nbreva;
                }               
            }
             //@zebs code isj
            
            int i; int s=0;
            int[] tab=new int[nbreval];
            for(i=0;i<nbreval;i++){
                System.out.print("entrer la valeur "+(i+1)+" du tableau:\f");
                tab[i]=lire.nextInt();
                s=s+tab[i];               
            }
            System.out.println("la somme des valeur du tableau vaux: "+s);
            float M=(float)s/nbreval;
            System.out.println("la moyenne est: "+M);
            int min; int max;
            min=tab[0]; max=tab[0];
            for(i=1; i<nbreval; i++){
                if(tab[i]<min){
                    min=tab[i];
                } //@zebs code isj
            }
            for(i=1; i<nbreval; i++){
                if(tab[i]>max){
                    max=tab[i];
                }
            }
            System.out.println("la plus petite valeur du tableau est: "+min);
            System.out.println("la plus grande valeur du tableau est: "+max);
            
            
             //@zebs code isj
            
            float xi=0;
             for(i=0; i<nbreval;i++){
                xi=xi+(tab[i]-M)*(tab[i]-M);
             }
              float v=(float)xi/nbreval;
               System.out.println("a variance est: "+v);
                System.out.println("l ecart type est: "+Math.sqrt(v));
               
    } //@zebs code isj
    
}
