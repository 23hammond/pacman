// This just sets up the game, most of the code is in the "Board" class
package pacman;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {
	private static final long serialVersionUID = 1L;

	public Pacman() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(646, 756);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            JFrame ex = new Pacman();
            ex.setVisible(true);
        });
    }
}
