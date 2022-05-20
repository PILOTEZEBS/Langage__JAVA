
package Employers;

public class Commerciaux {
    protected float sala;
    protected float inter;
    protected int mois;

    Commerciaux(float s, float i, int m){
        this.sala=s;
        this.inter=i;
        this.mois=m;
    }
    protected float getSala(){
        return this.sala;
    }
    protected void setSala(float ns){
        this.sala=ns;
    }
     protected float getInter(){
        return this.inter;
    }
    protected void setInter(float ni){
        this.inter=ni;
    }
     protected int getMois(){
        return this.mois;
    }
    protected void setmois(int nm){
        this.mois=nm;
    }
    
    
}
