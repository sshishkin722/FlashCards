package shishkinsi.flash_cards;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private static final int DEFALT_HEIGHT = 640;
	private static final int DEFAULT_WIDTH = 480;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(MainFrame::initMainFrame);
	}
	
	private static void initMainFrame() {
		var frame = new MainFrame();
		var contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.add(Abacus.createAbacus(3, 3), BorderLayout.CENTER);
		
		//TODO create real info pane
		var infoPane = new Button("Info Pannel placeholder");
		contentPane.add(infoPane, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
	
	public MainFrame() {
		setSize(DEFAULT_WIDTH, DEFALT_HEIGHT);
	}
}
