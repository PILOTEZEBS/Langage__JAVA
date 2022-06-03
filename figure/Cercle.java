
package figure;

public class Cercle{
    float rayon;
    
    public Cercle(float r){
        this.rayon=r;
    }
    
    public Cercle(){
        
    }
    public void setRayon(float r){
        this.rayon=r;
    }
    public float getRayon(){
        return this.rayon;
    }
    double surface(){
        double pi=6.28;
        return getRayon()*getRayon()*pi;
    }
    double perimetre(){
        double pi=3.14;
        return 2*this.rayon*pi;
    }
    public void affiche(){
          System.out.println("Rayon: "+getRayon()+ " la valeur de PI est cont: 3.14 Surface: "+surface()+" Perimetre :"+perimetre());
    }
}
