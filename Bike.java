package tw.org.ikii.allanJava;

public class Bike {
	private double speed;
	private int color;
	
	
	Bike(){
		System.out.println("Bike()");
		color = 2;
	}
	Bike(int c){
		System.out.println("Bike(int)");
		color = c;
	}
	
	void upSpeed() {
		speed = (speed < 1 ? 1 : speed * 1.5);
	}

	void upSpeed(int gear) {
		speed = (speed < 1 ? 1 : speed * (1.5 + gear));
	}

	void downSpeed() {
		speed = (speed < 1 ? 0 : speed * 0.5);
	}

	double getSpeed() {
		return speed;
	}
}
