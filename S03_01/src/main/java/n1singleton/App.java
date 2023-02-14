package n1singleton;

public class App {

	public static void main(String[] args) {
		
		boolean exit=false;
	    do 
	    {
	      //Instanciem l'atribut ArrayList d'Strings a través del mètode estàtic de la classe Undo getInstance
	      Undo undo = Undo.setInstance();
	      System.out.println("\n1.Insert new command");
	      System.out.println("2.Undo last command");
	      System.out.println("3.See command's list");
	      System.out.println("4.Exit\n");
	      int selectedOption = Input.scanningForInt("Please select an option number from the menu:");
	      switch(selectedOption)
	      {
	       case 1: //Amb el mètode estàtic takeCommand d'Undo demanem el command per guardar com a String al commandsList
	    	   undo.takeCommand(Input.scanningForString("Please insert command"));
	    	   break;
	    	   
	       case 2: //Amb undoCommand esborreml'últim command afegit
	    	   undo.undoCommand();
	    	   break;
	    	   
	       case 3: //Amb showCommands imprimim forEach element de l'ArrayList de commands
	    	   undo.showCommands();
	    	   break;

	       case 4:
	    	   exit=true;
	    	   System.out.println("Goodbye, come back soon!");
	    	   break;
	       	  }
	      }while(!exit);
	}

}
