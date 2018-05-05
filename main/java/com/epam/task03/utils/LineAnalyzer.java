package com.epam.task03.utils;

import java.util.List;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineAnalyzer {

	public static String getPlaneType(String line) {
		String planeType = null;
		Matcher matcher = Pattern.compile("^[\\w\\s]+").matcher(line);
		while(matcher.find())
			planeType = matcher.group();
		return planeType;
	}

	public static List<String> getPropertyValues(String line) {
		Matcher matcher = Pattern.compile("=([\\w-. ]*)[,;]").matcher(line);
		List<String> values = new LinkedList<String>();
        while(matcher.find()){
            values.add(matcher.group(1));
        }
		return values;
	}
}
