
package exercice3;

public class Point {
      private String nom;
      private double abs;
      private double ord;
      public Point(){
            
      }
      public Point(String n, double x, double y){
            this.nom=n;
            this.abs=x;
            this.ord=y;
      }
      public String affiche(){
            return "("+this.nom+", "+this.abs+", "+this.ord+")";
      }
      public void translate(double d){
            this.abs=this.abs+d;
            this.ord=this.ord+d;
      }
}
