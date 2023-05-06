package Calculator;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class CalcuInterface {
	private JFrame Calcu = new JFrame();
	private JPanel Panel = new JPanel();
	public JTextField AIO = new JTextField();

	public JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	public JButton btnAdd, btnSub, btnDev, btnMulti, btnDot, btnModulo, btnDel, btnClear, btnEquals;

	public CalcuInterface() {
	btn0 = new JButton("0"); btn1 = new JButton("1"); btn2 = new JButton("2"); btn9 = new JButton("9");
	btn3 = new JButton("3"); btn4 = new JButton("4"); btn5 = new JButton("5");
	btn6 = new JButton("6"); btn7 = new JButton("7"); btn8 = new JButton("8");
	btn9 = new JButton("9");
	
	btnAdd = new JButton("+"); btnSub = new JButton("-"); btnDev = new JButton("/");
	btnMulti = new JButton("x"); btnDot = new JButton("."); btnModulo = new JButton("%");
	btnDel = new JButton("<="); btnClear = new JButton("C"); btnEquals = new JButton("=");

	Calcu.setTitle("CALCULATOR");
	Calcu.setSize(400, 520);
	Calcu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Calcu.setResizable(false);
	Calcu.setLayout(null);
	Calcu.setLocationRelativeTo(null);
	Calcu.setVisible(true);

	Border blackline = BorderFactory.createLineBorder(Color.black);
	Panel.setBackground(Color.darkGray);
	Panel.setSize(400, 520);
	Panel.setVisible(true);

	AIO.setBounds(20, 20, 340, 100);
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
	
	
	btnClear.setBounds(30, 130, 60, 50); btnClear.setBackground(Color.LIGHT_GRAY); btnClear.setBorder(blackline);
	btnDel.setBounds(110, 130, 60, 50); btnDel.setBackground(Color.LIGHT_GRAY); btnDel.setBorder(blackline);
	btnModulo.setBounds(190, 130, 60, 50); btnModulo.setBackground(Color.LIGHT_GRAY); btnModulo.setBorder(blackline);
	btnDev.setBounds(290, 130, 60, 50); btnDev.setBackground(Color.LIGHT_GRAY); btnDev.setBorder(blackline);

	btn7.setBounds(30, 200, 60, 50); btn7.setBackground(Color.LIGHT_GRAY); btn7.setBorder(blackline);
	btn8.setBounds(110, 200, 60, 50); btn8.setBackground(Color.LIGHT_GRAY); btn8.setBorder(blackline);
	btn9.setBounds(190, 200, 60, 50); btn9.setBackground(Color.LIGHT_GRAY); btn9.setBorder(blackline);
	btnMulti.setBounds(290, 200, 60, 50); btnMulti.setBackground(Color.LIGHT_GRAY); btnMulti.setBorder(blackline);

	btn4.setBounds(30, 270, 60, 50); btn4.setBackground(Color.LIGHT_GRAY); btn4.setBorder(blackline);
	btn5.setBounds(110, 270, 60, 50); btn5.setBackground(Color.LIGHT_GRAY); btn5.setBorder(blackline);
	btn6.setBounds(190, 270, 60, 50); btn6.setBackground(Color.LIGHT_GRAY); btn6.setBorder(blackline);
	btnSub.setBounds(290, 270, 60, 50); btnSub.setBackground(Color.LIGHT_GRAY); btnSub.setBorder(blackline);

	btn1.setBounds(30, 340, 60, 50); btn1.setBackground(Color.LIGHT_GRAY); btn1.setBorder(blackline);
	btn2.setBounds(110, 340, 60, 50); btn2.setBackground(Color.LIGHT_GRAY); btn2.setBorder(blackline);
	btn3.setBounds(190, 340, 60, 50); btn3.setBackground(Color.LIGHT_GRAY); btn3.setBorder(blackline);
	btnAdd.setBounds(290, 340, 60, 50); btnAdd.setBackground(Color.LIGHT_GRAY); btnAdd.setBorder(blackline);

	btn0.setBounds(110, 410, 60, 50); btn0.setBackground(Color.LIGHT_GRAY); btn0.setBorder(blackline);
	btnDot.setBounds(190, 410, 60, 50); btnDot.setBackground(Color.LIGHT_GRAY); btnDot.setBorder(blackline);
	btnEquals.setBounds(290, 410, 60, 50); btnEquals.setBackground(Color.LIGHT_GRAY); btnEquals.setBorder(blackline);

	Calcu.add(AIO); Calcu.add(btnAdd);
	Calcu.add(btn0); Calcu.add(btnSub);
	Calcu.add(btn1); Calcu.add(btnDev);
	Calcu.add(btn2); Calcu.add(btnMulti);
	Calcu.add(btn3); Calcu.add(btnClear);
	Calcu.add(btn4); Calcu.add(btnDel);
	Calcu.add(btn5); Calcu.add(btnModulo);
	Calcu.add(btn6); Calcu.add(btnEquals);
	Calcu.add(btn7); Calcu.add(btnDot);
	Calcu.add(btn8); Calcu.add(Panel);
	Calcu.add(btn9);


	}



	}