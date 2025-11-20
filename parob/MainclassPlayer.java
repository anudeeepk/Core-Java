package com.parob;

public class MainclassPlayer {
	public static void main(String[] args) {
		Player p1=Manager.createPlayer();
		Manager.displayPlayerDetails(p1);
		System.out.println("=============================");
		Player p2=Manager.createPlayer();
		Manager.displayPlayerDetails(p2);
	}

}
