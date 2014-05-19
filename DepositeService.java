package com.shaik.spring.service;
import com.shaik.spring.dao.AccountsDAO;
public class DepositeService
{
	private AccountsDAO dao;
	public DepositeService(AccountsDAO dao)
	{
		this.dao=dao;
	}
	public boolean deposite(int acno,double amt)
	{
		System.out.println("inn deposite");
		double bal=dao.getBalance(acno);
		bal+=amt;
		dao.setBalance(acno,bal);
		return true;
	}
}