package com.shaik.spring.service;
public class TAService
{
	private WithdrawService ws;
	private DepositeService ds;
	public TAService(WithdrawService ws,DepositeService ds)
	{
		this.ws=ws;
		this.ds=ds;
	}
	public boolean transfer(int srcno,int dscno,double amt)
	{
		if(ws.withdraw(srcno,amt))
		{
		  return ds.deposite(dscno,amt);
		}
		return false;
	}
}