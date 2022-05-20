
package Employers;

public class SousEmployes extends Employes{
    private Employes [] tab;
    SousEmployes(String n, String m, float i) {
        super(n, m, i);
    }
    private void affinferieur(int p){
        for(int i=0; i<p;i++){
            System.out.println(tab[i].affiche());
        }
    }
    
}
