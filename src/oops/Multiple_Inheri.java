package oops;

class Samsung{
	public void display() {
		System.out.println("144hz refresh reate , pure Amoled display");
	}
	
}
interface Sony{
	public void Camera();
	
}

public class Multiple_Inheri extends Samsung implements Sony{

	public static void main(String[] args) {
	
		Multiple_Inheri s = new Multiple_Inheri();
		s.display();
		s.Camera();
		
	}

	@Override
	public void Camera() {
		// TODO Auto-generated method stub
		System.out.println("Camera is from Sony");
		System.out.println("triple Camera setup");
		System.out.println("8MP Depth Sensor");
		System.out.println("2MP Optical Zoom");
		
	}
}
