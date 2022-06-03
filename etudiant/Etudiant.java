
package etudiant;

public class Etudiant {
      String nom;
      String prenom;
      String matricule;
      float note;
      public Etudiant(){}//@CodeurZEBS Mon constructeur par defaut
      public Etudiant(String nom,String pre, String mat, float n){//
            this.nom=nom;
            this.prenom=pre;
            this.matricule=mat;
            this.note=n;
      }
      public String affiche(){
            return  "\n\nNom: "+this.nom+"\nPrenom: "+this.prenom+"\nMatricule: "+this.matricule+"\nNote: "+this.note;
            
      }
      
}
