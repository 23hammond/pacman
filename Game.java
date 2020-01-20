package pacman;

import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel implements Runnable {
	private static final long serialVersionUID = 1L;

	enum Dir {
		up(0, -1), right(1, 0), left(-1, 0), down(0, 1);

		Dir(int x, int y) {
			this.x = x;
			this.y = y;
		}

		final int x, y;
	}

	volatile boolean gameOver = true;

	Thread gameThread;
	int score, hiScore, x, y;
	Dir dir;

	@Override
	public void run() {

	}

}
