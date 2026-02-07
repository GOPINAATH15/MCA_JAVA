package oops;

public class Encap_Main {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setAccountno(101);
		e.setName("Gopi");
		e.setBalance(40000);
		System.out.println("Account number is: "+e.getAccountno());
		System.out.println("Account holder name: "+e.getName());
		System.out.println("Account Balance: "+e.getBalance());
	}
}
