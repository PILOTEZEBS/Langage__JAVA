
package figure;

public class Rectangle {
    float longu;
    float larg;
    public Rectangle(float L, float l){ 
        this.longu=L;
        this.larg=l;
    }
    public Rectangle(){
    
    }
    public void setLong(float L){
        this.longu=L;
    }
    public float getLong(){
        return this.longu;
    }
    public float getLarg(){
        return this.larg;
    }
     public void setLarg(float l){
        this.longu=l;
    }
    
    float surface(){
        return getLong()*getLarg();
    } 
    float perimetre(){
        return (getLong()+getLarg())*2;
    } 
     public void affiche(){
           System.out.println("Longeur: "+getLarg()+" et largeur: "+getLarg()+" Surface: "+surface()+" Perimetre :"+perimetre());
     }
}
