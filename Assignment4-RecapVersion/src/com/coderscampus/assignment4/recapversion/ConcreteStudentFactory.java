package com.coderscampus.assignment4.recapversion;

public class ConcreteStudentFactory implements StudentFactory {

	@Override
	public COMPSCI createCOMPSCIStudent() {
		
		return new COMPSCIImpl();
	}

	@Override
	public APMTH createAPMTHStudent() {
		
		return new APMTHImpl();
	}

	@Override
	public STAT createSTATStudent() {
		
		return new STATImpl();
	}

}
