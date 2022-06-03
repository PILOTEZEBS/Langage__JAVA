package puissance;
import java.util.Scanner;
public class Puissance {
    static void option(){ //Zebs option
        System.out.println("1-SOMME DE 2 ENTIERS?");
        System.out.println("2-PRODUIT DE 2 ENTIERS?");
        System.out.println("3-CARRE D UN ENTIER?");
        System.out.println("4-DIVISION DE 2 ENTIERS?");
        System.out.println("5-reste DE LA DIVISON DE 2 ENTIERS?");
    }
    private static int somme(int a, int b){
        int s=a+b;
        return s;
    }
    private static int produit(int p1, int p2){
        int p=p1*p2;
        return p;
    }
    private static int carre(int c1){
        return c1*c1;
    }
    private static float division(int d1, int d2){
    return d1/d2;
    }
    private static int modulo(int m1, int m2){
        return m1%m2;
    }
    public static void main(String[] args){
        Scanner lire=new Scanner(System.in);
        System.out.println("======================================BONJOUR ET BIENVENUE DANS LE PROGRAME DE NGUENA ZEBS LICENCE 1===============================\n\n");
        System.out.print("entrer votre nom avant de lancer le programme:");
        String nom=lire.next();
        System.out.println("\n\nMerci "+nom+"  de vous Inscrire!\n");
        option();
        System.out.println("\n choisissez une option de calcule de votre choix  "+nom+":\n");
        int x=lire.nextInt();
            if (x==1){
            System.out.println("entrer le 1er nombre entier de votre choix "+nom+" :  ");
            int n1=lire.nextInt();
            System.out.println("entrer le 2em nombre entier de votre choix:  ");
            int n2=lire.nextInt();
            System.out.println(nom+" la somme de ces nombres est = "+somme(n1, n2));
        }
        if (x==2){
            System.out.println("entrer le 1er nombre entier de votre choix "+nom+" :  ");
            int p1=lire.nextInt();
            System.out.println("entrer le 2em nombre entier de votre choix:  ");
            int p2=lire.nextInt();
            System.out.println(nom+" le produit de ces nombres est = "+produit(p1, p2));
        }
        if (x==3){
            System.out.println("entrer un nombre entier de votre choix "+nom+" :  ");
            int c1=lire.nextInt();
            System.out.println(nom+" le carre de votre nombre est = "+carre(c1));
        }
        if (x==4){
            System.out.println("entrer le 1er nombre entier de votre choix "+nom+" :  ");
            int d1=lire.nextInt();
            System.out.println("entrer le 2em nombre entier de votre choix:  ");
            int d2=lire.nextInt();
            System.out.println(nom+" la division de ces nombres est = "+division(d1, d2));
        }
        if (x==5){
            System.out.println("entrer le dividende entier de votre choix "+nom+" :  ");
            int r1=lire.nextInt();
            System.out.println("entrer le diviseur entier de votre choix:  ");
            int r2=lire.nextInt();
            System.out.println(nom+" le reste de la division de  "+r1+"  par "+r2+" division de ces nombres est = "+division(r1, r2));
        }
        System.out.print("Desole vous n avez pas entrer la bonne option. \n POGRAMME EN COURS D AMELIORATION PAR NGUENA ZEBS");
    }
    
}
