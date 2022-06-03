
package figure;

public class Personne {
      public String nom;
      public int age;
      public String  adresse;
      public Personne(){}
      public Personne(String n, int a, String adre){
            this.nom=n;
            this.age=a;
            this.adresse=adre;
      }
      
      public String getNom(){
            return this.nom;
      }
      public int getAge(){
            return this.age;
      }
      public String getAdresse(){
            return this.adresse;
      }
      
      public String toString(){
            return "nom: "+this.nom+" \n age: "+this.age+" \n adresse: "+this.adresse;
      }
}
