package Impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import ExamProject.Car;
import ExamProject.Handler;

public class HandlerImpl implements Handler {

	@Override
	public String readFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Car> getCarData(String data) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car getLongestParked(ArrayList<Car> cars) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sortCarsByNumberPlate(ArrayList<Car> cars) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByTime(ArrayList<Car> cars) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateTicketPrice(Car car) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date calculateParkingtimeInDays(Car car) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return 0;
	}

}
