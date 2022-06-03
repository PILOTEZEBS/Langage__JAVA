
package figure;

public class Etudiant extends Personne {
      public String matricule;
      public String filiere;
      public int niveau;
      public Etudiant(){}
      public Etudiant(String mat,String fil,int niv){
            this.matricule=mat;
            this.filiere=fil;
            this.niveau=niv;
      }
      public void Inscrire(String f, int n){
            this.filiere=f;
            this.niveau=n;
      }
      public void Preinscrire(String m){
            this.matricule=m;
      }
}
