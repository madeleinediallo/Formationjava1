import java.util.Scanner;

public class MonApplication8 {

    public static void main (String arg[]) {
	System.out.println ("demo boucle do..while");
	String prenom = new String();
	//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
	char reponse = ' ';
	
	Scanner sc = new Scanner(System.in) ; 
	
	do{
	  System.out.println("Donner un prenom : ");
	  prenom = sc.nextLine();
	  System.out.println("Bonjour "+prenom+ ", comment vas-tu?");
	  
	  do{
	    System.out.println("Voulez-vous ressayer ? (O/N)");
		reponse = sc.nextLine() .charAt(0);
	  }while(reponse!= 'O'); 
	  
	}while (reponse == 'O');
	
    System.out.println("Au revoir...");
	}
}