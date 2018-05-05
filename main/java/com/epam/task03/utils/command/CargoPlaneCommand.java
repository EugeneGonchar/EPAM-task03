package com.epam.task03.utils.command;

import java.util.Iterator;
import java.util.List;

import com.epam.task03.entity.plane.CargoPlane;
import com.epam.task03.entity.plane.Plane;

public class CargoPlaneCommand extends Command{
	
	@Override
	public Plane execute(List<String> properties) {
		CargoPlane cargoPlane = new CargoPlane();
		
		Iterator iterator = properties.iterator();
		
		if(iterator.hasNext())
			cargoPlane.setName((String)iterator.next());
		if(iterator.hasNext())
			cargoPlane.setRange(Integer.parseInt((String)iterator.next()));
		if(iterator.hasNext())
			cargoPlane.setFuelConsumption(Integer.parseInt((String)iterator.next()));
		if(iterator.hasNext())
			cargoPlane.setCargoCapacity(Integer.parseInt((String)iterator.next()));

		return cargoPlane;
	}
	
}
