package com.shaik.spring.service;
import com.shaik.spring.dao.AccountsDAO;
public class WithdrawService
{
	private AccountsDAO dao;
	private CheckBalanceService cbs;
	public WithdrawService(AccountsDAO dao,CheckBalanceService cbs)
	{
		this.dao=dao;
		this.cbs=cbs;
	}
	public boolean withdraw(int acno,double amt)
	{
		double bal=dao.getBalance(acno);
		bal-=amt;
		if(cbs.checkMinBal(acno,bal))
		{dao.setBalance(acno,bal);
			return true;
		}
		return false;

	}


}