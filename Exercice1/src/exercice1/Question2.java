package exercice1;
import java.util.*;
public class Question2 {
      public static void main(String[] argv){
             int[] tab = {12, 15,13, 10, 8, 9, 13, 14};
          Scanner lire=new Scanner(System.in);
          System.out.println("entrer un entier de verification: ");
          int nbre,i;
          int vf=0,s=0;
          if(lire.hasNextInt()){
                nbre=lire.nextInt();
                for(i=0; i<8; i++){
                      if(tab[i]==nbre){
                            vf=1;
                            s=i+1;
                      }
                }
                if(vf==1){
                      System.out.println("Oui! "+s+" em Position");
                }else{
                      System.out.println("Non! Aucune position");
                }
          }else{
                System.out.println("erreur vous avez entrer une valeur non entiere!");
          }
      }
}
