package GarageTicketingSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CalcuActionListeners {
	
	CalcuInterface Action = new CalcuInterface();
	
	public double Number = 0;
	public double Answer = 0;
	public int Calculate = 0;
	
	public CalcuActionListeners(){
		
	Action.btn0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"0");
		}});
	Action.btn1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"1");
		}});
	Action.btn2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"2");
		}});
	Action.btn3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"3");
		}});
	Action.btn4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"4");
		}});
	Action.btn5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"5");
		}});
	Action.btn6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"6");
		}});
	Action.btn7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"7");
		}});
	Action.btn8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"8");
		}});
	Action.btn9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+"9");
		}});
	Action.btnDot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText(Action.AIO.getText()+".");
		}});
	Action.btnEquals.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		SwitchCalculate();
		}});
	Action.btnClear.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Action.AIO.setText("");
		}});
	Action.btnDel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		int length = Action.AIO.getText().length();
		int number = Action.AIO.getText().length()-1;
			String storage;
		if (length > 0) {
			StringBuilder backspace = new StringBuilder(Action.AIO.getText());
			backspace.deleteCharAt(number);
			storage = backspace.toString();
			Action.AIO.setText(storage);}
		}});
	Action.btnAdd.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Number = Double.parseDouble(Action.AIO.getText());
		Calculate = 1;
		Action.AIO.setText("");
		}});
	Action.btnSub.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Number = Double.parseDouble(Action.AIO.getText());
		Calculate = 2;
		Action.AIO.setText("");
		}});
	Action.btnDev.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Number = Double.parseDouble(Action.AIO.getText());
		Calculate = 3;
		Action.AIO.setText("");
		}});
	Action.btnMulti.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Number = Double.parseDouble(Action.AIO.getText());
		Calculate = 4;
		Action.AIO.setText("");
		}});
	Action.btnModulo.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Number = Double.parseDouble(Action.AIO.getText());
		Calculate = 5;
		Action.AIO.setText("");
		}});
	}
	
	public void SwitchCalculate() {
		switch (Calculate) {
		case 1:
			Answer = Number + Double.parseDouble(Action.AIO.getText());
				Action.AIO.setText(Double.toString(Answer));
		break;
		case 2:
			Answer = Number - Double.parseDouble(Action.AIO.getText());
				Action.AIO.setText(Double.toString(Answer));
		break;
		case 3:
			Answer = Number / Double.parseDouble(Action.AIO.getText());
				Action.AIO.setText(Double.toString(Answer));
		break;
		case 4:
			Answer = Number * Double.parseDouble(Action.AIO.getText());
				Action.AIO.setText(Double.toString(Answer));
		break;
		case 5:
			Answer = Number % Double.parseDouble(Action.AIO.getText());
				Action.AIO.setText(Double.toString(Answer));
		break;
		}
	}
}