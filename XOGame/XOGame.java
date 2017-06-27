import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpringLayout.Constraints;

public class XOGame extends JApplet{

	JPanel cp;
	private static JTextPane t = new JTextPane();
	JButton b00;
	JButton b01;
	JButton b02;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b20;
	JButton b21;
	JButton b22;
	JButton restart;
	
	public String getButton00Text(){
		return b00.getText();
	}
	
	public String getButton01Text(){
		return b01.getText();
	}
	
	public String getButton02Text(){
		return b02.getText();
	}
	
	public String getButton10Text(){
		return b10.getText();
	}
	
	public String getButton11Text(){
		return b11.getText();
	}
	
	public String getButton12Text(){
		return b12.getText();
	}
	
	public String getButton20Text(){
		return b20.getText();
	}
	
	public String getButton21Text(){
		return b21.getText();
	}
	
	public String getButton22Text(){
		return b22.getText();
	}
	
	
	public void setButton00Text(String val){
		b00.setText(val);
	}

	public void setButton01Text(String val){
		b01.setText(val);
	}
	public void setButton02Text(String val){
		b02.setText(val);
	}
	public void setButton10Text(String val){
		b10.setText(val);
	}
	public void setButton11Text(String val){
		b11.setText(val);
	}
	public void setButton12Text(String val){
		b12.setText(val);
	}
	public void setButton20Text(String val){
		b20.setText(val);
	}
	public void setButton21Text(String val){
		b21.setText(val);
	}
	public void setButton22Text(String val){
		b22.setText(val);
	}
	
	public void setDisplayValue(String val){
		t.setText(val);
	}
	
	public String getDisplayValue(){
		return t.getText();
	}

	public static int turn = 1;		
	
	public void init() {
		cp = new JPanel();
		b00 = new JButton("");
		b01 = new JButton("");
		b02 = new JButton("");
		b10 = new JButton("");
		b11 = new JButton("");
		b12 = new JButton("");
		b20 = new JButton("");
		b21 = new JButton("");
		b22 = new JButton("");
		t.setText("Player X. Let's begin!");
		t.setMaximumSize(new Dimension(20, 200));
		t.setMinimumSize(new Dimension(20, 200));
		restart = new JButton("Restart");
	
		GridBagLayout gbl = new GridBagLayout();
		cp.setLayout(gbl);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		c.gridy = 0;
		c.gridx = 0;
		c.gridwidth = 3;
		c.weightx = 0.5;
		c.weighty = 0.1;
		c.anchor = GridBagConstraints.CENTER;
		cp.add(t, c);
		c.gridy = 1;
		c.gridx = 0;
		c.gridwidth = 1;
		c.weighty = 0.5;
		cp.add(b00, c);
		c.gridy = 1;
		c.gridx = 1;
		cp.add(b01, c);
		c.gridy = 1;
		c.gridx = 2;
		cp.add(b02, c);
		c.gridy = 2;
		c.gridx = 0;
		cp.add(b10, c);
		c.gridy = 2;
		c.gridx = 1;
		cp.add(b11, c);
		c.gridy = 2;
		c.gridx = 2;
		cp.add(b12, c);
		c.gridy = 3;
		c.gridx = 0;
		cp.add(b20, c);
		c.gridy = 3;
		c.gridx = 1;
		cp.add(b21, c);
		c.gridy = 3;
		c.gridx = 2;
		cp.add(b22, c);
		c.gridy = 4;
		c.gridx = 0;
		c.gridwidth = 3;
		c.weighty = 0.1;
		cp.add(restart, c);
		
		XOEngine xoEngine = new XOEngine(this);
		b00.addActionListener(xoEngine);
		b01.addActionListener(xoEngine);
		b02.addActionListener(xoEngine);
		b10.addActionListener(xoEngine);
		b11.addActionListener(xoEngine);
		b12.addActionListener(xoEngine);
		b20.addActionListener(xoEngine);
		b21.addActionListener(xoEngine);
		b22.addActionListener(xoEngine);
		restart.addActionListener(xoEngine);
		
		cp.setSize(new Dimension(300, 400));
		cp.setVisible(true);
		
		add(cp);
		
/*		JFrame fr = new JFrame("XO-Game");
		fr.setContentPane(cp);
		fr.setSize(210, 270);
		fr.setResizable(false);
		fr.setVisible(true);
*/	}
}
