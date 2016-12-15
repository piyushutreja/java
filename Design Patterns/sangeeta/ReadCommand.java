package com.sapient.usecase;

public class ReadCommand implements Command{

	Operator operator;
	
	ReadCommand(Operator operator)
	{
		this.operator = operator;
	}
	
	@Override
	public void execute() {
		operator.read();
	}

}
