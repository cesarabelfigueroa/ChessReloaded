import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;

public class BoardRender extends JFrame{
	String test = "assets/images/pieces/black_king.png";
	BoardRender(String name){
		super(name);
		this.setScreen();
	}


	private void setScreen(){
		this.setLayout(new GridLayout(8, 8));
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBoxes();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	private void setBoxes(){
		for(int i= 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				Box panel = new Box();
				panel.setSize(100, 100);
				ImageIcon image = new ImageIcon(test);
				JLabel label = new JLabel("", image, JLabel.CENTER);
				System.out.println(image);
				if((i + j)% 2 == 0){
					panel.setBackground(Color.white); 
				}else{
					panel.setBackground(Color.black); 
				}
				panel.add(label);
				this.add(panel);
			}
		}
	}
}