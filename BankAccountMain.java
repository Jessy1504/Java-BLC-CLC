package com.DLC.CLC;

public class BankAccountMain {
		public static void main(String[] args) {
			BankAccount ba = new BankAccount();
			ba.setAccountDetails("Rahul", 123456, 5000.0);
			String res = ba.getAccountDetails();
			System.out.println(res);

	}

}
