package GarageTicketingSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VerifyActionListeners {
	
//ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS
	Verify Veri = new Verify();
	
	VerifyActionListeners() {
		
//CONFIRM BUTTON ACTION LISTENERS
	Veri.Confirm.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (Veri.No.isSelected()) {
	            System.exit(0);
	            
	        } else if (Veri.Yes.isSelected()) {
	            SwingUtilities.invokeLater(new Runnable() {
	                public void run() {
	                    new SignIn();
	                    new SignInActionListeners(); 
	         	}});
	            Veri.Frame.dispose(); //REMOVES THE PREVIOUS FRAME
	        } else {
	        	JOptionPane.showMessageDialog(null, "Invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
	        		}
	    		}});
	}
}
