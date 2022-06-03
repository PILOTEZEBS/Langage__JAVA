package Employers;

public class Chef extends Employes {

    private Employes[] sub;

    Chef(String n, String m, float i) {
        super(n, m, i);
    }

    private void affinferieur() {
        for (int i = 0; i < sub.length; i++) {
            this.sub[i].affiche();
        }
    }

}
