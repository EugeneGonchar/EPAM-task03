package com.epam.task03.utils.command;

import java.util.Iterator;
import java.util.List;

import com.epam.task03.entity.plane.Airliner;
import com.epam.task03.entity.plane.Plane;

public class AirlinerCommand extends Command{

	@Override
	public Plane execute(List<String> properties) {
		Airliner airliner = new Airliner();
		
		Iterator iterator = properties.iterator();
		
		if(iterator.hasNext())
			airliner.setName((String)iterator.next());
		if(iterator.hasNext())
			airliner.setRange(Integer.parseInt((String)iterator.next()));
		if(iterator.hasNext())
			airliner.setFuelConsumption(Integer.parseInt((String)iterator.next()));
		if(iterator.hasNext())
			airliner.setCargoCapacity(Integer.parseInt((String)iterator.next()));
		if(iterator.hasNext())
			airliner.setSeatingCapacity(Integer.parseInt((String)iterator.next()));
		
		return airliner;
	}
	
}
