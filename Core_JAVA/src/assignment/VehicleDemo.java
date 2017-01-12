package assignment;


public class VehicleDemo extends Aircraft{
	public static void main(String args[]){
		
		SUV s = new SUV(700, "Black", 200, (byte)4, 525, 130, 8);
		
		s.getPower();//Searches for getPower method SUV's super classes (Car, Vehicle)
		
		Aircraft a = new Aircraft();
		
		a.capacity = 26213;
		a.color = "White";
		a.mtow = 236789;
		a.length = 70;
		a.height = 26;
		a.power = 30000;
		a.thrust = 250000;
		
		
		a.getColor(); //Searches for the getColor method in Aircraft's super class.
	}
}

class Vehicle{
	int power;
	String color;
	double top_speed;
	
	public int getPower(){
		return this.power;
	}
	public String getColor(){
		return this.color;
	}
	public double getTopSpeed(){
		return this.top_speed;
	}
}

class Car extends Vehicle{

	byte wheels;
	int cc;
	int bhp;
	
	Car(int power, String color, double top_speed, byte wheels, int cc, int bhp) {
		this.wheels = wheels;
		this.cc = cc;
		this.power = power;
		this.top_speed = top_speed;
		this.color = color;
		this.bhp = bhp;
	}
	
	public byte getWheels(){
		return this.wheels;
	}
	
	public int getCc(){
		return this.cc;
	}
	public int getBhp(){
		return this.bhp;
	}
}

class SUV extends Car{
	
	int capacity;
	
	SUV(int power, String color, double top_speed, byte wheels, int cc, int bhp, int capacity) {
		super(power, color, top_speed, wheels, cc, bhp);
		this.capacity = capacity;
	}
	
	public int getCapacity(){
		return this.capacity;
	}

	
}
class Bike extends Vehicle{
	int cc;
	int bhp;
	
	Bike(int power, String color, double top_speed, int cc, int bhp) {
		this.cc = cc;
		this.power = power;
		this.top_speed = top_speed;
		this.color = color;
		this.bhp = bhp;
	}
	public int getCc(){
		return this.cc;
	}
	public int getBhp(){
		return this.bhp;
	}
}

class Aircraft extends Vehicle{
	double length; 
	double height;
	double mtow;
	int capacity;
	int number_engines;
	double thrust;
	
	Aircraft(){
		
	}
	
	Aircraft(double length, double height, double mtow, int capacity, int number_engines, double thrust, int power, String color, double top_speed){
		this.length = length;
		this.height = height;
		this.mtow = mtow;
		this.capacity = capacity;
		this.number_engines = number_engines;
		this.thrust = thrust;
		this.power = power;
		this.color = color;
		this.top_speed = top_speed;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getMtow() {
		return mtow;
	}
	public void setMtow(double mtow) {
		this.mtow = mtow;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getNumber_engines() {
		return number_engines;
	}
	public void setNumber_engines(int number_engines) {
		this.number_engines = number_engines;
	}
	public double getThrust() {
		return thrust;
	}
	public void setThrust(double thrust) {
		this.thrust = thrust;
	}
}

