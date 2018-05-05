package com.epam.task03.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.task03.dao.PlaneDAO;

import com.epam.task03.entity.airline.Airline;
import com.epam.task03.entity.plane.Plane;

import com.epam.task03.utils.LineAnalyzer;
import com.epam.task03.utils.TxtFileReader;
import com.epam.task03.utils.command.Command;
import com.epam.task03.utils.command.CommandProvider;
import com.epam.task03.utils.comparator.PlaneRangeComparator;

public class PlaneDAOImpl implements PlaneDAO{
	
	public List<Plane> getAll(){
		
		List<Plane> planes = new ArrayList<Plane>();
		TxtFileReader reader = new TxtFileReader();
		
		while(reader.getLine() != null) {
			String line = reader.getLine();
			
			CommandProvider provider = new CommandProvider();
			Command command = provider.getCommand(LineAnalyzer.getPlaneType(line));
			
			if(!LineAnalyzer.getPropertyValues(line).isEmpty())
				planes.add(command.execute(LineAnalyzer.getPropertyValues(line)));
			
			reader.readNextLine();
		}
		
		reader.close();
		
		return planes;
	}
	
}


//you may add your own new classes