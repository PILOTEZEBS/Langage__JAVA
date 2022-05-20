
package Employers;

public class SousCommerciau extends Commerciaux{
    
    SousCommerciau(float s, float i, int m) {
        super(s, i, m);
    }
    private String infomois(){
        return "Salaire:"+getSala()+"\ninteressemment:"+getInter();
    }
    private void miseajour(float ms, float mi, int mm){
         setSala(ms);
         setInter(mi);
         setmois(mm);
    }
    private void salaire(){
        float s=(float)(getSala()*getInter())/getMois();
        System.out.println("le salaire est:"+s);
    }
    
}
