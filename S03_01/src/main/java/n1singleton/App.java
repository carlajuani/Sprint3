package n1singleton;

public class App {

	public static void main(String[] args) {
		Undo.getInstance();
		
		boolean exit=false;
	    do
	    {
	      System.out.println("\n1.Insert new command");
	      System.out.println("2.Undo last command");
	      System.out.println("3.See command's list");
	      System.out.println("4.Exit\n");
	      int selectedOption = Input.scanningForInt("Please select an option number from the menu:");
	      switch(selectedOption)
	      {
	       case 1: //
	    	   Undo.takeCommand(Input.scanningForString("Please insert command"));
	    	   break;
	    	   
	       case 2: //
	    	   Undo.undoCommand();
	    	   break;
	    	   
	       case 3: //
	    	   Undo.showCommands();
	    	   break;

	       case 4:
	    	   exit=true;
	    	   System.out.println("Goodbye, come back soon!");
	    	   break;
	       	  }
	      }while(!exit);
	}

}
