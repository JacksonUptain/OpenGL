package main;

public class Main implements Runnable {
	public Thread game;
	
	public void start() {
		game = new Thread(this,"game");
		game.start();
	}
	public static void init() {
		System.out.println("Init run: SUCCESS");
	}
	public void run() {
		init();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

}
