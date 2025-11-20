package com.parob;

public class MainclassPatient {
	public static void main(String[] args) {
		Patient p1=Hospital.createPatient();
		Hospital.displayPatientDetails(p1);
		Patient p2=Hospital.createPatient();
		Hospital.displayPatientDetails(p2);
	}

}
