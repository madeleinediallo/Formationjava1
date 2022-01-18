import java.util.Scanner;

public class MonApplication7 {

    public static void main (String arg[]) {
	System.out.println ("demo boucle while");
	
	String prenom;
	char reponse = 'o';
	Scanner sc = new Scanner(System.in) ; 
	//Tant que la reponse donnée est égale à oui...
	while (reponse == 'o')
	{
	  // On affiche une instruction
	  System.out.println("Donnez un prenom : ");
	  //On recupere le prenom saisi
	  prenom = sc.nextLine();
	  //On affiche notre phrase avce le prenom
	  System.out.println("Bonjour "+prenom+ ", comment vas-tu?");
	  //On demande si la personne veut faire un autre essai
	    System.out.println("Voulez-vous ressayer ? (O/N)");
	  //On recupere la reponse de l'utilisateur
		reponse = sc.nextLine() .charAt(0);
	}
    System.out.println("Au revoir...");
	}
}