package com.epam.task03.dao;

import com.epam.task03.dao.impl.PlaneDAOImpl;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final PlaneDAO planeDAO = new PlaneDAOImpl();
	
	private DAOFactory() {}

	public PlaneDAO getPlaneDAO() {
		return planeDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
