package com.shaik.spring.service;
import com.shaik.spring.dao.AccountsDAO;
public class CheckBalanceService
{
	AccountsDAO dao;
	public CheckBalanceService(AccountsDAO dao)
	{
		this.dao=dao;
	}
	public boolean checkMinBal(int acno,double amt)
	{
		System.out.println("chek bal"+acno);
		return (amt>5000);
	}
}