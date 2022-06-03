
package figure;

public class Triangle {
    float base;
    float haut;
    float rayon;
    public Triangle(){
        
    }
     public Triangle(float b, float h){
        this.haut=h;
        this.base=b;
    }
    public void setHaut(float h){
        this.haut=h;
    }
     public void setbas(float b){
        this.base=b;
    }
     public float getHaut(){
         return this.haut;
     }
     public float getBas(){
         return this.base;
     }
    double surface(){
        return (getHaut()*getBas())/2;
    }
    double perimetre(){
       return getBas()*3;
    }
   public void affiche(){
         System.out.println("Hauteur: "+getHaut()+" et Base: "+getBas()+" Surface: "+surface()+" Perimetre: "+perimetre());
   }
}
