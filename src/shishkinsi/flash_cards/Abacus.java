package shishkinsi.flash_cards;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Abacus extends JPanel {
	private Abacus() {	super();	}
	private List<AbacusNeedle> needles = new ArrayList<>();
	public static Abacus createAbacus(int sizeOfIntegerPart, int sizeOfFractionalPart) {
		var abacus = new Abacus();
		
		abacus.setLayout(new BoxLayout(abacus, BoxLayout.X_AXIS));
		for (int i = sizeOfIntegerPart; i > 0; i--) {
			abacus.addNeedle(new AbacusNeedle(i));
		}
		for (int i = 1; i <= sizeOfFractionalPart; i++) {
			abacus.addNeedle(new AbacusNeedle(-i));
		}

		return abacus;
	}
	private void addNeedle(AbacusNeedle needle) {
		needles.add(needle);
		this.add(needle);
	}
}
