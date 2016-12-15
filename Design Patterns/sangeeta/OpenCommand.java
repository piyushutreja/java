package com.sapient.usecase;

public class OpenCommand implements Command{

	Operator operator;
	
	OpenCommand(Operator operator)
	{
		this.operator = operator;
	}
	
	@Override
	public void execute() {
		operator.open();
	}
}