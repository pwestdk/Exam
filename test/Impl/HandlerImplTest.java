package Impl;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.Test;

import ExamProject.Car;

class HandlerImplTest {
	
	// Fields
	HandlerImpl h = new HandlerImpl();
	private String data;

	@Test
	void testReadFile() throws IOException {
		data = h.readFile("Cars.csv");
        
        int expected = 157;
        int actual = data.length();
        assertEquals(expected, actual);
        
        String _expected = "AF22454, 1";
        String _actual = data.split(System.lineSeparator())[0];
        assertEquals(_expected, _actual);
        
        _expected = "CF22751, 2";
        _actual = data.split(System.lineSeparator())[13]; // Magic number
        assertEquals(_expected, _actual);
	}

	@Test
	void testGetCarData() {
		
	}

	@Test
	void testGetLongestParked() {
		
	}

	@Test
	void testSortCarsByNumberPlate() {
		
	}

	@Test
	void testSortByTime() {
		
	}

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

	@Test
	void testGetIllegallyParkedCars() {
		
	}

	@Test
	void testGetReportedCars() {
		
	}

	@Test
	void testCalculateTotalTicketPrice() {
		
	}

}
