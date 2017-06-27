import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class XOEngine implements ActionListener{
	
	XOGame parent;
	public XOEngine(XOGame parent) {
		this.parent = parent;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("")){
			if(XOGame.turn == 1){
				b.setText("X");	
				parent.setDisplayValue("Player O. You turn.");
				XOGame.turn = -XOGame.turn;
			}
			else if(XOGame.turn == -1){
				b.setText("O");
				parent.setDisplayValue("Player X. Move.");
				XOGame.turn = -XOGame.turn;
			}
		}
		if(b.getText().equals("Restart")){
			if(XOGame.turn == -2){
				parent.setDisplayValue("Player X move first!");
				parent.setButton00Text("");
				parent.setButton01Text("");
				parent.setButton02Text("");
				parent.setButton10Text("");
				parent.setButton11Text("");
				parent.setButton12Text("");
				parent.setButton20Text("");
				parent.setButton21Text("");
				parent.setButton22Text("");
				XOGame.turn = 1;
			}
			else if(XOGame.turn == 2){
				parent.setDisplayValue("Player O. Let's GO!");				
				parent.setButton00Text("");
				parent.setButton01Text("");
				parent.setButton02Text("");
				parent.setButton10Text("");
				parent.setButton11Text("");
				parent.setButton12Text("");
				parent.setButton20Text("");
				parent.setButton21Text("");
				parent.setButton22Text("");
				XOGame.turn = -1;
			}
			else{
				parent.setDisplayValue("Player O. Let's GO!");				
				parent.setButton00Text("");
				parent.setButton01Text("");
				parent.setButton02Text("");
				parent.setButton10Text("");
				parent.setButton11Text("");
				parent.setButton12Text("");
				parent.setButton20Text("");
				parent.setButton21Text("");
				parent.setButton22Text("");
				XOGame.turn = -1;
				
			}
		}
		if(parent.getButton00Text().equals(parent.getButton01Text()) && parent.getButton01Text().equals(parent.getButton02Text()) && !parent.getButton02Text().equals("") ||
				parent.getButton10Text().equals(parent.getButton11Text()) && parent.getButton11Text().equals(parent.getButton12Text()) && !parent.getButton12Text().equals("") ||
				parent.getButton20Text().equals(parent.getButton21Text()) && parent.getButton21Text().equals(parent.getButton22Text()) && !parent.getButton22Text().equals("") ||
				parent.getButton00Text().equals(parent.getButton10Text()) && parent.getButton10Text().equals(parent.getButton20Text()) && !parent.getButton20Text().equals("") ||
				parent.getButton01Text().equals(parent.getButton11Text()) && parent.getButton11Text().equals(parent.getButton21Text()) && !parent.getButton21Text().equals("") ||
				parent.getButton02Text().equals(parent.getButton12Text()) && parent.getButton12Text().equals(parent.getButton22Text()) && !parent.getButton22Text().equals("") ||
				parent.getButton00Text().equals(parent.getButton11Text()) && parent.getButton11Text().equals(parent.getButton22Text()) && !parent.getButton22Text().equals("") ||
				parent.getButton02Text().equals(parent.getButton11Text()) && parent.getButton11Text().equals(parent.getButton20Text()) && !parent.getButton20Text().equals("")
				){
			if(XOGame.turn == 1){
				parent.setDisplayValue("O-player win! Congratulations!!!");
				XOGame.turn = -2;
			}
			else if(XOGame.turn == -1){
				parent.setDisplayValue("X-player win! Grats!!!");
				XOGame.turn = 2;
			}
		}
		if(!parent.getButton00Text().equals("") &&
			!parent.getButton01Text().equals("") &&
			!parent.getButton02Text().equals("") &&
			!parent.getButton10Text().equals("") &&
			!parent.getButton11Text().equals("") &&
			!parent.getButton12Text().equals("") &&
			!parent.getButton20Text().equals("") &&
			!parent.getButton21Text().equals("") &&
			!parent.getButton22Text().equals("")
			){
			parent.setDisplayValue("Draw! 'Restart' to continue");
		}
	}
}
