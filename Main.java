import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

	
	public static void main(String[] Args) {
		System.out.println("Start...");
		
		JFrame window = new JFrame("TicTacToe");
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setLayout(new BorderLayout());
		window.setLocationRelativeTo(null);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setUndecorated(false);
		window.setVisible(true);
		TicTacToe game = new TicTacToe();
		window.add(game);
		
		
		System.out.println("End...");
	}
}
