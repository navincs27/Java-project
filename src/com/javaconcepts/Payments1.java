package com.javaconcepts;

public class Payments1 implements SBI,HDFC{
	int a ;
	
	

	@Override
	public void transaction() {
		
		System.out.println(a);
		
	}

	@Override
	public void transfer() {
		System.out.println("From SBI");
	}


	@Override
	public void billPayment(String bankName) {

		if(bankName.equals("SBI")) {
			System.out.println("Payment from SBI");
		}else if(bankName.equals("HDFC")) {
			System.out.println("Payment from HDFC");
		}
	}

	public static void main(String[] args) {
		SBI s = new Payments1(1);
		s.transfer();
		s.billPayment("HDFC");
	}
}
