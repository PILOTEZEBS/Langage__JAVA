
package etudiant;
import java.util.Scanner;
public class Test {

      public static void main(String[] args) {
           Scanner lire=new Scanner(System.in);
           Etudiant[] etudiant=new Etudiant[45];
           Etudiant E=new Etudiant();
           int i,J=0;
           for(i=0; i<etudiant.length; i++){
                 System.out.print("\nEntrer le Matricule de l Etudiant "+(J+1)+": ");
                 E.matricule=lire.next();
                 System.out.print("\nEntrer le Nom de  l Etudiant "+(J+1)+": ");
                 E.nom=lire.next();
                 System.out.print("\nEntrer le Prenom de l Etudiant "+(J+1)+": ");
                 E.prenom=lire.next();
                 System.out.print("\nEntrer la Note de POO de l Etudiant "+(J+1)+": ");
                 E.note=lire.nextFloat();
                 J++;
                 etudiant[i]=E;
           }
           
           System.out.print("\n\nLa liste de vos etudiants entres sont: ");
           for(i=0; i<etudiant.length; i++){
                 System.out.print(etudiant[i].affiche()+"\n");
           }
      }
      
}

