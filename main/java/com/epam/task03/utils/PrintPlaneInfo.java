package com.epam.task03.utils;

import java.util.Iterator;
import java.util.List;

import com.epam.task03.entity.plane.Plane;

public class PrintPlaneInfo {
	public static void print(List<Plane> planes) {
		if(!planes.isEmpty()) {
			System.out.println("-----");
			Iterator<Plane> iterator = planes.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
			System.out.println("-----");
		}
	}
}
