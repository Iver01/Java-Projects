package GarageTicketingSystem;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CalcuInterface {
	public JFrame Calcu = new JFrame("CALCULATOR");
	public JTextField AIO = new JTextField();

	public JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	public JButton btnAdd, btnSub, btnDev, btnMulti, btnDot, btnModulo, btnDel, btnClear, btnEquals;

	public CalcuInterface() {
		
	//FRAME
	Calcu.setTitle("CALCULATOR");
	Calcu.setSize(400, 520);
	Calcu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	Calcu.setResizable(false);
	Calcu.setLayout(null);
	Calcu.setLocationRelativeTo(null);
	
	//BORDER
	Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	//BUTTON
	btn0 = new JButton("0"); btn1 = new JButton("1"); btn2 = new JButton("2"); btn9 = new JButton("9");
	btn3 = new JButton("3"); btn4 = new JButton("4"); btn5 = new JButton("5");
	btn6 = new JButton("6"); btn7 = new JButton("7"); btn8 = new JButton("8");
	btn9 = new JButton("9");
	btnAdd = new JButton("+"); 		btnSub = new JButton("-"); 		btnDev = new JButton("/");
	btnMulti = new JButton("x"); 	btnDot = new JButton("."); 		btnModulo = new JButton("%");
	btnDel = new JButton("<="); 	btnClear = new JButton("C"); 	btnEquals = new JButton("=");

	//TEXTFIELD
	AIO.setBounds(20, 20, 340, 100);
	//FONTS
	AIO.setFont(new Font("Courier", Font.BOLD, 50));
	btn0.setFont(new Font("Arial", Font.PLAIN, 20));
	btn1.setFont(new Font("Arial", Font.PLAIN, 20));
	btn2.setFont(new Font("Arial", Font.PLAIN, 20));
	btn3.setFont(new Font("Arial", Font.PLAIN, 20));
	btn4.setFont(new Font("Arial", Font.PLAIN, 20));
	btn5.setFont(new Font("Arial", Font.PLAIN, 20));
	btn6.setFont(new Font("Arial", Font.PLAIN, 20));
	btn7.setFont(new Font("Arial", Font.PLAIN, 20));
	btn8.setFont(new Font("Arial", Font.PLAIN, 20));
	btn9.setFont(new Font("Arial", Font.PLAIN, 20));
	btnAdd.setFont(new Font("Arial", Font.PLAIN, 20));
	btnSub.setFont(new Font("Arial", Font.PLAIN, 20));
	btnMulti.setFont(new Font("Arial", Font.PLAIN, 20));
	btnDev.setFont(new Font("Arial", Font.PLAIN, 20));
	btnModulo.setFont(new Font("Arial", Font.PLAIN, 20));
	btnClear.setFont(new Font("Arial", Font.PLAIN, 20));
	btnDel.setFont(new Font("Arial", Font.PLAIN, 20));
	btnDot.setFont(new Font("Arial", Font.PLAIN, 30));
	btnEquals.setFont(new Font("Arial", Font.PLAIN, 20));
	//SET BOUNDS
	btnClear.setBounds(30, 130, 60, 50); btnClear.setBackground(Color.LIGHT_GRAY); btnClear.setBorder(raisedbevel);
	btnDel.setBounds(110, 130, 60, 50); btnDel.setBackground(Color.LIGHT_GRAY); btnDel.setBorder(raisedbevel);
	btnModulo.setBounds(190, 130, 60, 50); btnModulo.setBackground(Color.LIGHT_GRAY); btnModulo.setBorder(raisedbevel);
	btnDev.setBounds(290, 130, 60, 50); btnDev.setBackground(Color.LIGHT_GRAY); btnDev.setBorder(raisedbevel);

	btn7.setBounds(30, 190, 60, 50); btn7.setBackground(Color.LIGHT_GRAY); btn7.setBorder(raisedbevel);
	btn8.setBounds(110, 190, 60, 50); btn8.setBackground(Color.LIGHT_GRAY); btn8.setBorder(raisedbevel);
	btn9.setBounds(190, 190, 60, 50); btn9.setBackground(Color.LIGHT_GRAY); btn9.setBorder(raisedbevel);
	btnMulti.setBounds(290, 190, 60, 50); btnMulti.setBackground(Color.LIGHT_GRAY); btnMulti.setBorder(raisedbevel);

	btn4.setBounds(30, 250, 60, 50); btn4.setBackground(Color.LIGHT_GRAY); btn4.setBorder(raisedbevel);
	btn5.setBounds(110, 250, 60, 50); btn5.setBackground(Color.LIGHT_GRAY); btn5.setBorder(raisedbevel);
	btn6.setBounds(190, 250, 60, 50); btn6.setBackground(Color.LIGHT_GRAY); btn6.setBorder(raisedbevel);
	btnSub.setBounds(290, 250, 60, 50); btnSub.setBackground(Color.LIGHT_GRAY); btnSub.setBorder(raisedbevel);

	btn1.setBounds(30, 310, 60, 50); btn1.setBackground(Color.LIGHT_GRAY); btn1.setBorder(raisedbevel);
	btn2.setBounds(110, 310, 60, 50); btn2.setBackground(Color.LIGHT_GRAY); btn2.setBorder(raisedbevel);
	btn3.setBounds(190, 310, 60, 50); btn3.setBackground(Color.LIGHT_GRAY); btn3.setBorder(raisedbevel);
	btnAdd.setBounds(290, 310, 60, 50); btnAdd.setBackground(Color.LIGHT_GRAY); btnAdd.setBorder(raisedbevel);

	btn0.setBounds(110, 370, 60, 50); btn0.setBackground(Color.LIGHT_GRAY); btn0.setBorder(raisedbevel);
	btnDot.setBounds(190, 370, 60, 50); btnDot.setBackground(Color.LIGHT_GRAY); btnDot.setBorder(raisedbevel);
	btnEquals.setBounds(290, 370, 60, 50); btnEquals.setBackground(Color.LIGHT_GRAY); btnEquals.setBorder(raisedbevel);
	
	//ADD TO FRAME
	Calcu.add(AIO);  Calcu.add(btnAdd);
	Calcu.add(btn0); Calcu.add(btnSub);
	Calcu.add(btn1); Calcu.add(btnDev);
	Calcu.add(btn2); Calcu.add(btnMulti);
	Calcu.add(btn3); Calcu.add(btnClear);
	Calcu.add(btn4); Calcu.add(btnDel);
	Calcu.add(btn5); Calcu.add(btnModulo);
	Calcu.add(btn6); Calcu.add(btnEquals);
	Calcu.add(btn7); Calcu.add(btnDot);
	Calcu.add(btn8); 
	Calcu.add(btn9);
	
	//FRAME
	Calcu.setVisible(true);
	
	}
}
