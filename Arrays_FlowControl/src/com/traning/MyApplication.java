package com.traning;
import java.util.*;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;


public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated mesydthod stub
		
		BankAccountService service = new BankAccountService();
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] list = new BankAccount[3];
		int idx=0,end;
		

		do 
		{
			//bank Account Account
			System.out.println("Account Number");
			int accountNumber = sc.nextInt();
			
			
			System.out.println("account holder name");
			String accountHolderName = sc.next();
			
			System.out.println("balance");
			double balance = sc.nextDouble();
						
			System.out.println("Account type[savings, fixed, recurring]");
			String accountType = sc.next();
			
			BankAccount account = new BankAccount( accountNumber, accountHolderName,  balance,  accountType) ;
			list[idx] = account;
			System.out.println("enter 1 to continuie els enter 0 ");
			
			end = sc.nextInt();
			idx++;
			
       

		}
		while(end == 1);
			double[] values = service.findInterestByAccountType(list);
			
			for(double eachValue : values) {
				System.out.println(eachValue);
			}
			
			sc.close();

}
}
