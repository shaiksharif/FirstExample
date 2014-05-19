package com.shaik.spring.dao;
public interface AccountsDAO
{
	void setBalance(int acno,double amt);
	double getBalance(int acno);
}