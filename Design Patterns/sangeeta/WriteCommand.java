package com.sapient.usecase;

public class WriteCommand implements Command{

    Operator operator;
	
    WriteCommand(Operator operator)
	{
		this.operator = operator;
	}
	
	@Override
	public void execute() {
		operator.write();
	}
}
