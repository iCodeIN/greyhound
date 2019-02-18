package greyhound.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import greyhound.client.GreyHoundClientImpl;
import greyhound.entity.Carrier;
import greyhound.entity.Driver;
import greyhound.entity.Location;
import greyhound.model.DriverAssignment;
import greyhound.model.Result;
import greyhound.repository.DriverRepository;

@Service
public class GreyhoundServiceImpl {

	@Autowired
	private GreyHoundClientImpl client;
	@Autowired
	private DriverRepository repository;

	public void process() {

		Result result = client.getDriverBusAssignment();
		for(DriverAssignment assignment : result.getDriverAssignments()) {
			System.out.println(assignment);
		}
		List<Driver> drivers = prepareEntityList(result);
		
		System.out.println("Converted to drivers");
		for(Driver driver : drivers) {
			System.out.println(driver);
			
		}
		repository.saveAll(drivers);

	}

	private List<Driver> prepareEntityList(Result result) {
		List<Driver> drivers = new ArrayList<Driver>();
		
		for(DriverAssignment driverAssignment : result.getDriverAssignments()) {
			Location location = new Location();
			location.setLocationName(driverAssignment.getHomeLocation3());
			location.setLocationId(driverAssignment.getHomeLocation());
			Carrier carrier = new Carrier();
			carrier.setCarrierName(driverAssignment.getCarrierId());
			Driver driver = new Driver();
			driver.setDriverId(driverAssignment.getDriverId());
			driver.setFirstName(driverAssignment.getFirstName());
			driver.setLastName(driverAssignment.getLastName());
			driver.setMiddleInitial(driverAssignment.getMiddleInitial());
			driver.setCarrier(carrier);
			driver.setLocation(location);
			drivers.add(driver);
		}
		
		return drivers;
	}

}
