package Impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import ExamProject.Car;
import ExamProject.Handler;

public class HandlerImpl implements Handler {

	@Override
	public String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}

	//What exception too throw and where??
	@Override
	public ArrayList<Car> getCarData(String data) throws IOException {
		ArrayList<Car> cars = new ArrayList<>();
		
		String[] carData = data.split(System.lineSeparator());
		for(String s : carData) {
			String[] temp = s.split(",");
			cars.add(new CarImpl(temp[0], Integer.parseInt(temp[1])));
		}
		
		return cars;
	}

	@Override
	public Car getLongestParked(ArrayList<Car> cars) throws IOException {
		Car car = new CarImpl();
		for(Car c : cars) {
			if (car.getParkingHours() < c.getParkingHours())
				car = c;
		}
		return car;
	}

	@Override
	public void sortCarsByNumberPlate(ArrayList<Car> cars) {
	//	Collections.sort(cars);
	}

	@Override
	public void sortByTime(ArrayList<Car> cars) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateTicketPrice(Car car) {
		int hourPrice = 10;
		return car.getParkingHours() * hourPrice;
	}

	@Override
	public Date calculateParkingtimeInDays(Car car) {
		
		return null;
	}

	@Override
	public ArrayList<Car> getIllegallyParkedCars(int limit, ArrayList<Car> cars) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Car> getReportedCars(String filename, ArrayList<Car> cars) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calculateTotalTicketPrice(int ticketPrice, ArrayList<Car> cars) {
		int totalPrice = 0;
		for(Car c : cars) {
			totalPrice += c.getParkingHours() * ticketPrice;
		}
		return totalPrice;
	}

}
