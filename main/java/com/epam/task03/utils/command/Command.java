package com.epam.task03.utils.command;

import java.util.List;

import com.epam.task03.entity.plane.Plane;

public abstract class Command {
	public abstract Plane execute(List<String> properties);
}
