package com.sapient.usecase;

public class Client {

	public static void main(String args[])
	{
		Invoker invoker = new Invoker();
		WriteCommand wcmd = new WriteCommand(new LinuxOperatorImpl());
		invoker.execute(wcmd);
	}
}
