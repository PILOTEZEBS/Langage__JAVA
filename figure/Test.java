
package figure;
import java.util.Scanner;
public class Test {
    public static void main(String[] argv){
          
          Scanner lire=new Scanner(System.in);
          System.out.println("Entrer un Rayon: ");
          float cote=lire.nextFloat();
          Carre car1=new Carre(cote);
          System.out.println("les donnees sont:"+car1.surface()+" et perimetre"+ car1.perimetre());
          
          
          System.out.println("Entrer la Longueur: ");
          float lon=lire.nextFloat();
           System.out.println("Entrer la Larguer: ");
          float lar=lire.nextFloat();
          Rectangle re1=new Rectangle(lon, lar);
          System.out.println("les donnees sont:"+re1.surface()+" et perimetre"+ re1.perimetre());  
          
          
          System.out.println("Entrer le Rayon: ");
          float R=lire.nextFloat();
          Cercle cer=new Cercle(R);
          System.out.println("les donnees sont Surface:"+cer.surface()+" et Perimetre"+ cer.perimetre());  
          
          
           System.out.println("Entrer la Base : ");
          float bas=lire.nextFloat();
           System.out.println("Entrer la Hauteur: ");
          float haut=lire.nextFloat();
          Triangle hat=new Triangle(bas, haut);
          System.out.println("les donnees sont:"+hat.surface()+" et perimetre"+ hat.perimetre());  
          
          
            
    }
}
