package main;

import engine.io.Window;

public class Main implements Runnable {
	public Thread game;
	public static Window window;
	public static final int WIDTH = 1280, HEIGHT = 760;
	public int frames;
	public static long time;
	
	public void start() {
		game = new Thread(this,"game");
		game.start();
	}
	public static void init() {
		window = new Window(WIDTH, HEIGHT, "jEngine");
		window.create();
		time = System.currentTimeMillis();
	}
	public void run() {
		init();
		while (!window.shouldClose()) {
			update();
			render();
		}
	}
	private void update() {
		window.update();
		frames++;
		if (System.currentTimeMillis() > time + 1000) {
			System.out.println(frames);
			time = System.currentTimeMillis();
			frames = 0;
		}
	}
	
	private void render() {
		window.swapBuffers();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

}
