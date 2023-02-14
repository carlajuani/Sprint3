package n1singleton;

import java.util.ArrayList;
import java.util.List;
 
public class Undo {
	private static Undo instance;
	private List<String> commandsList;
	
	private Undo(List<String> commandsList) {
        this.commandsList = commandsList;
	}
	
	public static Undo setInstance() {
		if (instance == null) {
			instance = new Undo(new ArrayList<String>());
		}
		return instance;
	}
	
	public void takeCommand(String command) {
		this.commandsList.add(command);
	}
	
	public void undoCommand() {
		this.commandsList.remove(this.commandsList.size()-1);
	}
	
	public void showCommands() {
		commandsList.stream().forEach(System.out::println);
	}
}
