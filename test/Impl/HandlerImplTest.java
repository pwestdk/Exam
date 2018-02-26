package Impl;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import ExamProject.Car;

import ExamProject.Car;

class HandlerImplTest {
	
	// Fields
	HandlerImpl h = new HandlerImpl();
	private String data;

	@Test
	void testReadFile() throws IOException {
		data = h.readFile("Cars.csv");
        
        int expected = 143;
        int actual = data.length();
        assertEquals(expected, actual);
        
        String _expected = "AF22454,1";
        String _actual = data.split("\n")[0];
        assertEquals(_expected, _actual);
        
        _expected = "CF22751,2";
        _actual = data.split("\n")[13];
        assertEquals(_expected, _actual);
	}


	@Test
	void testGetCarData() {
		try {
			ArrayList<Car> cars = h.getCarData(h.readFile("Cars.csv"));
			assertAll("Cars",
					() -> assertEquals("AF22454", cars.get(0).getNumberPlate()),
					() -> assertEquals("AF22451", cars.get((cars.size()-1)/2).getNumberPlate()),
					() -> assertEquals("CF22751", cars.get(cars.size()-1).getNumberPlate()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Philip
	@Test
	void testGetLongestParked() {
		
	}

	//Kasper
	@Test
	void testSortCarsByNumberPlate() {
		
	}

	//Philip
	@Test
	void testSortByTime() {
		
	}

	//Kasper
	@Test
	void testCalculateTicketPrice() {
		Car car1 = new CarImpl("AF22455", 0);
		
		int expected1 = 0;
        int actual1 = h.calculateTicketPrice(car1);
        assertEquals(expected1, actual1);
        
        Car car2 = new CarImpl("AF22455", 100);
		
		int expected2 = 1000;
        int actual2 = h.calculateTicketPrice(car2);
        assertEquals(expected2, actual2);
        
        Car car3 = new CarImpl("AF22455", 1000);
		
		int expected3 = 10000;
        int actual3 = h.calculateTicketPrice(car3);
        assertEquals(expected3, actual3);	
	}

	//Philip
	@Test
	void testCalculateParkingtimeInDays() {
		Car car1 = new CarImpl("AF22455", 36);
		
		String expected1 = "Days: 1 Hours: 12";
        String actual1 = h.calculateParkingtimeInDays(car1);
        assertEquals(expected1, actual1);
        
        Car car2 = new CarImpl("AF22455", 0);
		
		String expected2 = "Days: 0 Hours: 0";
        String actual2 = h.calculateParkingtimeInDays(car2);
        assertEquals(expected2, actual2);
        
        Car car3 = new CarImpl("AF22455", 5000);
		
		String expected3 = "Days: 208 Hours: 8";
        String actual3 = h.calculateParkingtimeInDays(car3);
        assertEquals(expected3, actual3);
	}


	//Kasper
	@Test
	void testGetIllegallyParkedCars() {
	}

	void testGetReportedCars(String data) {
		try {
			ArrayList<Car> cars = h.getReportedCars("Stolen.csv", h.getCarData(h.readFile("Cars.csv")));
			assertAll("Cars",
					() -> assertEquals("AF22459", cars.get(0).getNumberPlate()),
					() -> assertEquals("BF22414", cars.get(1).getNumberPlate()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Philip
	@Test
	void testCalculateTotalTicketPrice() {
		
	}

}
