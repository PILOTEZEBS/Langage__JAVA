
package exercice3;
import java.util.*;
public class Test {

      public static void main(String[] args) {
            Scanner lire=new Scanner(System.in);
            System.out.println("entrer le nom du point: ");
            String nom=lire.next();
            System.out.println("entrer l abscisse: ");
            double ab=lire.nextDouble();
            System.out.println("entrer l ordonne: ");
            double od=lire.nextDouble();
            Point p1=new Point(nom, ab, od);
            System.out.println(p1.affiche());
            System.out.println("entrer la valeur de la translation: ");
            double t=lire.nextDouble();
            p1.translate(t);
            System.out.println(p1.affiche());
      }
      
}
