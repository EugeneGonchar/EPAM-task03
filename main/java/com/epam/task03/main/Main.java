package com.epam.task03.main;

import com.epam.task03.entity.plane.Plane;
import com.epam.task03.service.AirlineService;
import com.epam.task03.service.ServiceFactory;
import com.epam.task03.utils.PrintPlaneInfo;
import com.epam.task03.utils.comparator.PlaneRangeComparator;
import com.epam.task03.entity.plane.Airliner;

import java.io.File;

import com.epam.task03.entity.airline.Airline;
/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        AirlineService airlineService = serviceFactory.getAirlineService();
        
        /////////////////////////////////
        
       
        Airline airline = new Airline("Virgin Atlantic");
        
        airline.setPlanes(airlineService.getAll());
        PrintPlaneInfo.print(airline.getPlanes());
        
        /////////////////////////////////
        
        airlineService.sort(airline.getPlanes(), new PlaneRangeComparator());
        PrintPlaneInfo.print(airline.getPlanes());
        
        /////////////////////////////////
        
        System.out.println("sumCargoCapacity = " + airlineService.sumCargoCapacity(airline));
        
        /////////////////////////////////
        
        System.out.println("sumSeatingCapacity = " + airlineService.sumSeatingCapacity(airline));
        
        /////////////////////////////////
        
        PrintPlaneInfo.print(airlineService.findFuelCapacity(airline.getPlanes(), 2400, 2600));

    }
}
