package GarageTicketingSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class SignInActionListeners {
	
//ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS
	SignIn Sign = new SignIn();
	
	public SignInActionListeners() {
		
// SIGN IN ACTION LISTENER
	Sign.Signin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String Username = Sign.UserText.getText();
		    String Password = Sign.PassText.getText();
	
		     	HashMap<String, String> Users = UserManager.GetUsers();
		    	if (Users.containsKey(Username) && Users.get(Username).equals(Password)) {
		         	SwingUtilities.invokeLater(new Runnable() {
		               	public void run() {
		                 	new GarageTicketingSystemInterface();
		                	new GarageTicketingSystemActionListeners();
		           	}});
		    	} else {
		           	JOptionPane.showMessageDialog(null, "Invalid Username or Password", "ERROR", JOptionPane.ERROR_MESSAGE);
		     			}
		      		}});
	        
// SIGN UP ACTION LISTENERS
	Sign.Signup.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	    	String Username = Sign.UserText.getText();
	    	String Password = Sign.PassText.getText();

	      		if (Username.isEmpty() || Password.isEmpty()) {
	             	JOptionPane.showMessageDialog(null, "Please enter Username and Password", "ERROR", JOptionPane.ERROR_MESSAGE);
	           	} else if (UserManager.GetUsers().containsKey(Username)) {
	               	JOptionPane.showMessageDialog(null, "Username has already been registered", "ERROR", JOptionPane.ERROR_MESSAGE);
	           	} else {
	         	UserManager.AddUser(Username, Password);
	            	 JOptionPane.showMessageDialog(null, "Sign up is successful! You can now Sign in.", "SIGN UP", JOptionPane.INFORMATION_MESSAGE);
			           	} 
			 		}});
	}
}
