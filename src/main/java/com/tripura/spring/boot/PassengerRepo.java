package com.tripura.spring.boot;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PassengerRepo extends CrudRepository<BusDetails, Integer> {

	//List<Employee> findByName(String string);
	//table,table primary key datatype

	//List<Employee> findByNameAndProject(String name, String project);

	//List<Employee> findByNameAndProjectAndDateOfJourney(String fromPlace, String toPlace, String dateOfJourney);

	List<BusDetails> findByFromPlaceAndToPlaceAndDateOfJourney(String from, String to, String dateOfJourney);

}
