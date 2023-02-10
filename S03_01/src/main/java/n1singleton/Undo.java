package n1singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {
	private static List<String> commandsList;
	//singleton object
	public static void setInstance() {
		if (commandsList == null) {
			commandsList = new ArrayList<String>();
		}
	}
	
	public static void takeCommand(String command) {
		commandsList.add(command);
	}
	
	public static void undoCommand() {
		commandsList.remove(commandsList.size()-1);
	}
	
	public static void showCommands() {
		commandsList.stream().forEach(System.out::println);
	}
}
