package Impl;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

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
		
	}

	//Philip
	@Test
	void testCalculateParkingtimeInDays() {
		
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
