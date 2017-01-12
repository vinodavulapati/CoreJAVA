package assignment2;

public class Electronics {
	
	public static void main(String args[])
	{
		
		
		TV obj1 = new TV();
		obj1.setPixeles("1640 X 1020");
		obj1.setPrice(2000);
		obj1.setScreenType("LED");
		obj1.setWeight(20);
		
		System.out.println("TV Deails are:");
		
		System.out.println("TV Weight is "+obj1.getWeight());
		System.out.println("TV screen Pixels"+obj1.getPixeles());
		
		System.out.println("TV Screen Type was: "+obj1.getScreenType());
		System.out.println("TV price with out tax was:"+obj1.getPrice());
		
		System.out.println("TV price with tax was:"+obj1.getTaxCal_total(obj1.getPrice()));
		
		
	}
	
}



class Elect{
	
	private int voltage;
	private int powerCapacity;
	private String powerType;
	public double taxCal_total;
	
	
	
	public double getTaxCal_total(double price) {
		
		taxCal_total = price + (0.115*price);
		return taxCal_total;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setPowerCapacity(int powerCapacity) {
		this.powerCapacity = powerCapacity;
	}
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	public int getVoltage() {
		return voltage;
	}
	public int getPowerCapacity() {
		return powerCapacity;
	}
	public String getPowerType() {
		return powerType;
	}

	
}


class type1 extends Elect{
	private String screenType;
	private int weight;
	public String getScreenType() {
		return screenType;
	}
	public int getWeight() {
		return weight;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

class type2 extends Elect{
	private String doorType;
	private int height;
	public String getDoorType() {
		return doorType;
	}
	public int getHeight() {
		return height;
	}
	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

class TV extends type1{
	
	private String pixeles;
	private double price;

	public void setPrice(double price) {
		//price = (0.115*price);
		this.price = price;
	}

	public double getPrice() {
		
		return price;
	}

	public String getPixeles() {
		return pixeles;
	}

	public void setPixeles(String pixeles) {
		this.pixeles = pixeles;
	}
	
}

