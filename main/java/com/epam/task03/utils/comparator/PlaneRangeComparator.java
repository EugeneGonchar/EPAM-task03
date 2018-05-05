package com.epam.task03.utils.comparator;

import java.util.Comparator;

import com.epam.task03.entity.plane.Plane;

public class PlaneRangeComparator implements Comparator<Plane>{
	public int compare(Plane a, Plane b) {
		
		if(a.getRange() > b.getRange())
			return 1;
		if (a.getRange() < b.getRange())
			return -1;
		return 0;
		
	}
}
