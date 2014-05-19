package com.shaik.spring.dao.daoimpl;
import com.shaik.spring.dao.AccountsDAO;
public class AccountsDAOImpl implements AccountsDAO
{
	public void setBalance(int acno,double amount)
	{
		System.out.println("amnt is set to account"+acno);

	}
	public double getBalance(int acno)
	{
		System.out.println("amt from accno"+acno);
		return 10000;
	}

}