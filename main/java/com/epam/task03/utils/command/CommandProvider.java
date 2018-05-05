package com.epam.task03.utils.command;

import java.util.HashMap;
import java.util.Map;



public class CommandProvider {
	public Map<String, Command> commands = new HashMap<String, Command>();
	
	public CommandProvider(){
		commands.put("CargoPlane", new CargoPlaneCommand());
		commands.put("Airliner", new AirlinerCommand());
	}
	
	public Command getCommand(String key) {
		return commands.get(key);
	}
}
