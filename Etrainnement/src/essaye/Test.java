package essaye;
import java.util.*;
public class Test {
    public static void main(String[] argv){
      Scanner lire=new Scanner(System.in);
      int[] nbre=new int[100];
      int i;
      System.out.print("entrer vos nombres: \n");
      for(i=0; i<nbre.length; i++){
            nbre[i]=lire.nextInt();
      }
      System.out.print("vos nombres entres sont \n");
      for(i=0; i<nbre.length; i++){
            System.out.print(nbre[i]+", ");
      }
      
    }
    
}
