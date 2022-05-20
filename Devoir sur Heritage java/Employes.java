
package Employers; 

public class Employes {
    protected String nom;
    protected String mat;
    protected float insala;
    private int v;
    
     Employes(String n, String m, float i){
         this.nom=n;
         this.mat=m;
         this.insala=i;
     }
     protected String getNom(){
         return this.nom;
     }
     protected void setNom(String nn){
         this.nom=nn;
     }
      protected String getMat(){
         return this.mat;
     }
     protected void setMat(String nm){
         this.mat=nm;
     }
      protected float getInsala(){
         return this.insala;
     }
     protected void setInsala(float ninsala){
         this.insala=ninsala;
     }
     protected float salaire(int v){
         float s=getInsala()*v;
         return s;
     }
     protected String affiche(){
         return "nom:"+getNom()+"\nmatricule:"+getMat()+"\nindice Salarial:"+getInsala();
     }
     
}
