import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Box extends JPanel {

	Box(){
		this.setFocusable(true);
		this.setRequestFocusEnabled(true);
		addMouseListener(new MouseAdapter() {
		    private Color background;

		    @Override
		    public void mousePressed(MouseEvent e) {
		        background = getBackground();
		        setBackground(Color.gray);
		        repaint();
		    }

		    @Override
		    public void mouseReleased(MouseEvent e) {
		        setBackground(background);
		    }
		});
	}
}