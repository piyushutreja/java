package com.sapient.usecase;

public class Invoker 
{
  public void execute(Command command)
  {
	  command.execute();
  }
}
