package oops;

public class Britania implements Interface{

	
	public static void main(String[] args) {
		
		Britania b = new Britania();
		b.poster();
		b.duration();
	}

	@Override
	public void poster() {
		// TODO Auto-generated method stub
	
		System.out.println("Poster height is 5 feet 10 inches adn width is 4 feet 10 inches");
	}

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("It take time to complete the poster in 2Hrs 10Mins");
	}
}
