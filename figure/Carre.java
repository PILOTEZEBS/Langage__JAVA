
package figure;

public class Carre {
    
    private float cote;
    
     public Carre(){ // mon constructeur par default
    }
    public Carre(float c){
        this.cote=c;
    }
    
    public void setCote(float c){
        this.cote=c;
    }
    public float getCote(){
        return this.cote;
    }
   float perimetre(){
       return getCote()*4;
   }
   float surface(){
       return getCote()*getCote();
   } 
   public void affiche(){
         System.out.println("Cote: "+getCote()+" Surface: "+surface()+" Perimetre :"+perimetre());
   }
}
