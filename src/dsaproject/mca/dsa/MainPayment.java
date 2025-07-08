package dsaproject.mca.dsa;

public class MainPayment extends Payment {

	@Override
	void pay() {
		// TODO Auto-generated method stub
		System.out.println("cash payment");
	}
	public static void main(String[] args) {
		MainPayment p=new MainPayment();
		p.pay();
		p.printbill();
	}

	
}
