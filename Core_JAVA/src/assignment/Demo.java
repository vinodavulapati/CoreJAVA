package assignment;


public class Demo extends Weight{
	public static void main(String args[]){
		Weight w1 = new Weight();
		Weight w2 = new Weight(40);
		Weight w3 = new Weight(40,20, 10,5);
	
		
		System.out.println(w3.getVolume());
	}
}
class Box{
	int height;
	int length;
	int width;
	
	
	Box(){
		height = 10;
		width = 20;
		length = 30;
	}
	
	Box(int height, int width, int length){
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public int getVolume(){
		return height*width*length;
	}
}

class Weight extends Box{

	int weight;
	
	Weight(){
		weight = 50;
	}
	
	Weight(int weight){
		this.weight = weight;
	}
	
	Weight(int weight, int height, int length, int width){
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.length = length;
	}
}

