package ometmomozebsisj;
import java.util.Scanner;
public class OMetMOMOZEBSISJ {
    //affiche la liste des operateur @ZEBS code
   static void afficheoperateurs(){
       System.out.println("1-ORANGE;");
       System.out.println("2-MTN;\n\n");
   }
   
   
   //POUR L OPERATEUR MTN. LIKE MON CODE MERCI @ZEBS CODE
   static class afficheMTN{
        static void menuMTN(){
       System.out.println("\n====#126# MTN MOMO====");
       System.out.println("\t 1) Transrfert d argent;");
       System.out.println("\t 2) Payer factures/Service;");
       System.out.println("\t 3) Achat Credit/Forfait;");
       System.out.println("\t 4) MoMoPay;");
       System.out.println("\t 5) Operation bancaire;");
       System.out.println("\t 6) Pret;");
       System.out.println("\t 7) Mon Compte;");
       System.out.println("\t 8) Aide;");
       System.out.println("\t 9) Promo;");
   }
        
        
                                static class Transfert{
                                    static void transfert(){
                       System.out.println("\n====MTN MOMO/transfert====");
                       System.out.println("\t 1) vers numero MTN;");
                       System.out.println("\t 2) vers autre oranges;");
                       System.out.println("\t 3) vers client sans compte;");
                       System.out.println("\t 0) retour;");
                            }
                        }
                                static class Payer{
                                    static void payer(){
                                System.out.println("\n====MTN MOMO/payer====");
                                System.out.println("\t 1) ENEO;");
                                System.out.println("\t 2) Frait Scolaire/Examens;");
                                System.out.println("\t 3) TV;");
                                System.out.println("\t 4) Facture MTN;");
                                System.out.println("\t 5) Assurancce;");
                                System.out.println("\t 6) Sercices Publics;");
                                System.out.println("\t 7) Autre;");
                                System.out.println("\t 8) Payer avec un coupon;");
                                System.out.println("\t 0) Retour;");
                            }
                        }

                                static class Achat{
                                    static void achat(){
                       System.out.println("\n====MTN MOMO/achat====");
                       System.out.println("\t 1) credit;");
                       System.out.println("\t 2) internet;");
                       System.out.println("\t 3) appel interna;");
                       System.out.println("\t 4) MTN Plus;");
                       System.out.println("\t 5) MTN Wanda;");
                       System.out.println("\t 6) MTN Wanda NET;");
                       System.out.println("\t 7) MTN HOME;");
                       System.out.println("\t 8) forfait SMS;");
                       System.out.println("\t 0) retour;");
                       System.out.println("\t 00) Suivant;");
                            }
                        }

                                static class Momopay{
                                    static void momopay(){
                            System.out.println("\n====MTN MOMO/momopay====");
                            System.out.println("\t 1) credit- MTN MoMo;");
                            System.out.println("\t 2) payer un marchant- orange;");
                            System.out.println("\t 0) retour;");
                            }
                        }

                                static class Banque{
                                    static void banque(){
                       System.out.println("\n====MTN MOMO/banque====");
                       System.out.println("\t 1) Retrait GAB;");
                       System.out.println("\t 2) Afriland BANK;");
                       System.out.println("\t 3) ECOBANK;");
                       System.out.println("\t 4) MICROFINANCES;");
                       System.out.println("\t 5) UBA;");
                       System.out.println("\t 6) CCA BANK;");
                       System.out.println("\t 7) retour;");
                            }
                        }

                                static class Pret{ 
                                    static void pret(){
                       System.out.println("\n====MTN MOMO/pret====");
                       System.out.println("\t 1) ENGLISH;");
                       System.out.println("\t 2) FRANCAIS;");
                            }
                        }

                                static class Moncompte{ 
                                    static void moncompte(){
                        System.out.println("\n====MTN MOMO/monCompte====");
                        System.out.println("\t 1) solde/derniere transactions;");
                        System.out.println("\t 2) changer code pin;");
                        System.out.println("\t 3) pin code oublie?;");
                        System.out.println("\t 4) gerez vos favoris;");
                        System.out.println("\t 5) parrainage;");
                        System.out.println("\t 6) change langue;");
                        System.out.println("\t 7) re;");
                        System.out.println("\t 00Next;");
                            }
                        }

                                static class Aide{
                                    static void aide(){
                            System.out.println("\n====MTN MOMO/aide====");
                            System.out.println("\t 1) Qu est ce que ZEBS MOMO;");
                            System.out.println("\t 2) comment envoyer de l argent?;");
                            System.out.println("\t 3) j ai envoyer de l argent a un mauvais numero;");
                            System.out.println("\t 4) comment rinitialiser mo;");
                            System.out.println("\t 00Next;");
                            
                        }}

                                static class Promo{
                                    static void promo(){
                       System.out.println("\n====MTN MOMO/promo====");
                       System.out.println("\t 1) promo recharge;");
                       System.out.println("\t 2) promo forfait;");
                       System.out.println("\t 0) retour;");
                            }
                        }

                   }
  
   
   
    
   
   
   
   
   
    public static void main(String[] args) {
        Scanner lire=new Scanner(System.in);
        System.out.println("===================ORANGE ET MTN MONEY CREER PAR NGUENA ZEBS DE ISJ=====================================\n\n");
        System.out.print("Veuillez entrer votre nom pour lancer le programme de NGUENA ZEBS: ");
        String nom=lire.next();
        System.out.println("\n Merci! de vous inscrire M./Mme. "+nom+"  je vous souhaite le bienvenue dans mon programme Moi c est ZEBS de licence 1 INSTITUT SAINT JEAN\n\n");
        afficheoperateurs();
        System.out.println("Choisissez votre operateur reseau "+nom+": ");
        int choix=lire.nextInt();
        
        
        while(choix!=1 || choix!=2){//Ici je force l utilisateur a entre un choix @ZEBS code
            if(choix==1 || choix==2){
                break;
            }else{
                System.out.print("OUUPPSS choix non disponible "+nom+"... \n choisissez un Operateur entre ORANGE ou MTN: ");
                int choi=lire.nextInt();
                choix=choi;
            }           
        }//fin tant que
       
        
        
        if(choix==2){//si le choix c est MTN alors @ZEBS code
            afficheMTN.menuMTN();
            System.out.println("Choisissez une action à faire a MTN "+nom);
            int choixmenumtn=lire.nextInt();
             while(choixmenumtn!=1 || choixmenumtn!=2 || choixmenumtn!=3 || choixmenumtn!=4 || choixmenumtn!=5 || choixmenumtn!=6 || choixmenumtn!=7 || choixmenumtn!=8 || choixmenumtn!=9){//Ici je force l utilisateur a entre un choix @ZEBS code
            if(choixmenumtn==1 || choixmenumtn==2 || choixmenumtn==3 || choixmenumtn==4 || choixmenumtn==5 || choixmenumtn==6 || choixmenumtn==7 || choixmenumtn==8 || choixmenumtn==9){
                break;
            }else{
                System.out.print("OUUPPSS choix non disponible  "+nom+"... \n choisissez une bonne action de 1 à 9: ");
                int choimenumtn=lire.nextInt();
                choixmenumtn=choimenumtn;
            }           
        }
             if(choixmenumtn==1){
                 afficheMTN.Transfert.transfert();
                 System.out.println("Choisissez une action à faire a MTN "+nom);
            int choixtrans=lire.nextInt();
             while(choixtrans!=1 || choixtrans!=2 || choixtrans!=3 || choixtrans!=0){//Ici je force l utilisateur a entre un choix @ZEBS code
            if(choixtrans==1 || choixtrans==2 || choixtrans==3 || choixtrans==0){
                break;
            }else{
                System.out.print("OUUPPSS choix non disponible  "+nom+"... \n choisissez une bonne action de 1 à 9: ");
                int choitrans=lire.nextInt();
                choixtrans=choitrans;
            }
             }
                    if(choixtrans==1){
                        System.out.println("Entrez le numero MTN ou taper 1 pour choisir parmi les favoris");
                        int numero=lire.nextInt();
                        System.out.println("entrer la somme à transferer:");//ICI LA TRANSACTION EST DEJA EN COURS pour MTN @ZEBS CODE
                        int somme=lire.nextInt();
                        System.out.println(nom+" vous voulez transferer "+somme+" au numero"+numero+" entrer votre code PIN! pour confirmer votre trnsaction");
                        int PIN=lire.nextInt();
                        System.out.println("********\n\n");
                        System.out.println("........Envoie reussi merci "+nom+" d utiliser l application de NGUENA ZEBS DE ISJ");//Fin de transaction du programme @ZEBS code
                        if(numero==1){
                            System.out.println("...cette partie est en cours d emelioration par @ZEBS code ISJ\n\n merci d utiliser mon programme."+nom);
                        }else{//en cours d amelioration @ZEBS code}
                        }}
                     if(choixtrans==2){
                        System.out.println("Entrez le numero ORANGE du recepteur:");
                        int numero=lire.nextInt();
                        System.out.println("entrer la somme à transferer:");//ICI LA TRANSACTION EST DEJA EN COURS pour MTN @ZEBS CODE
                        int somme=lire.nextInt();
                        System.out.println(nom+" vous voulez transferer "+somme+" au numero"+numero+" entrer votre code PIN! pour confirmer votre trnsaction");
                        int PIN=lire.nextInt();
                        System.out.println("********\n\n");
                        System.out.println("........Envoie reussi merci "+nom+" d utiliser l application de NGUENA ZEBS DE ISJ");//Fin de transaction du programme @ZEBS code
                        if(numero==1){
                            System.out.println("...cette partie est en cours d emelioration par @ZEBS code ISJ\n\n merci d utiliser mon programme."+nom);
                        }else{//en cours d amelioration @ZEBS code}
                        }}
                      if(choixtrans==3){
                        System.out.println("Entrez le numero du compte qui n a pas OM ou MTN MONEY du recepteur:");
                        int numero=lire.nextInt();
                        System.out.println("entrer la somme à transferer au numero sans compte:");//ICI LA TRANSACTION EST DEJA EN COURS pour MTN @ZEBS CODE
                        int somme=lire.nextInt();
                        System.out.println(nom+" vous voulez transferer "+somme+" au numero"+numero+" sans compte entrer votre code PIN! pour confirmer votre trnsaction");
                        int PIN=lire.nextInt();
                        System.out.println("********\n\n");
                        System.out.println("........Envoie reussi merci "+nom+" d utiliser l application de NGUENA ZEBS DE ISJ");//Fin de transaction du programme @ZEBS code
                        if(numero==1){
                            System.out.println("...cette partie est en cours d emelioration par @ZEBS code ISJ\n\n merci d utiliser mon programme."+nom);
                        }else{//en cours d amelioration @ZEBS code}
                        }}
                      if(choixtrans==0                        ){
                          afficheMTN.menuMTN();
                          System.out.println("...FIN DU PROGRAMME "+nom+" ....en cours d amelioration par @ZEBS code merci");
                        }
                        
             }
             if(choixmenumtn==2){
                 afficheMTN.Payer.payer();
                  System.out.println("Choisissez une action à faire a MTN "+nom);
            int choixpayer=lire.nextInt();
             while(choixpayer!=1 || choixpayer!=2 || choixpayer!=3 || choixpayer!=4 || choixpayer!=5 || choixpayer!=6 || choixpayer!=7 || choixpayer!=8 || choixpayer!=0){//Ici je force l utilisateur a entre un choix @ZEBS code
            if(choixpayer==1 || choixpayer==2 || choixpayer==3 || choixpayer==4 || choixpayer==5  || choixpayer==6 || choixpayer==7 || choixpayer==8 ||  choixpayer==0){
                break;
            }else{
                System.out.print("OUUPPSS choix non disponible  "+nom+"... \n choisissez une bonne action de 1 à 9: ");
                int choixpay=lire.nextInt();
                choixpayer=choixpay;
            }
             }
             
             
             
             }
             if(choixmenumtn==3){
                 afficheMTN.Achat.achat();
             }
             if(choixmenumtn==4){
                 afficheMTN.Momopay.momopay();
             }
             if(choixmenumtn==5){
                 afficheMTN.Banque.banque();
             }
             if(choixmenumtn==6){
                 afficheMTN.Pret.pret();
             }
             if(choixmenumtn==7){
                 afficheMTN.Moncompte.moncompte();
             }
             if(choixmenumtn==8){
                 afficheMTN.Aide.aide();
             }
             if(choixmenumtn==9){
                 afficheMTN.Promo.promo();
             }
        }
    }
    
}
