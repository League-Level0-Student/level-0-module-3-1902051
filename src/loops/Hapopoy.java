package loops;

import javax.swing.JOptionPane;

public class Hapopoy {

	public static void main(String[] args) {

		int happy = JOptionPane.showConfirmDialog(null, "Are you happy");
		int joj = 0;

		if (happy == 1) {
			int want =JOptionPane.showConfirmDialog(null, "Do you want to be happy");

			if (want == 0) {
				JOptionPane.showMessageDialog(null, "Change Something");

			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		
		
		}

		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");

			
		}

	}

}

//yes = 0
//no = 1