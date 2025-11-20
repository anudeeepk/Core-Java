package com.jspiders.encapsulation;
class Camera{
	void selfie() {
		System.out.println("Selfie");
	}
}
class SimCard{
	void services() {
		System.out.println("Call/Message/Data");
	}
}
class Mobile {
	Camera cam=new Camera();//Mobile has a camera:composition
	SimCard sim;//Mobile has a simCard:Aggregation
	Mobile(SimCard sim){
		this.sim=sim;
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Mobile mob=new Mobile(new SimCard());
		mob.cam.selfie();
		mob.sim.services();
	}

}
