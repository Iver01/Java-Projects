package GarageTicketingSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Verify {		
	public JFrame Frame = new JFrame("AUTHENTICATION");
	public JLabel HeadingLabel;
	public JRadioButton Yes;
	public JRadioButton No;
	public JButton Confirm;
	public JPanel VerifyPanel, HeadingPanel;
	
	Verify(){
		//FRANE
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(475, 250);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setLayout(new BorderLayout());;  
		
		//BORDER
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border loweredraisedbevel = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);;
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		TitledBorder verify; verify = BorderFactory.createTitledBorder(loweredetched, "Are you 18 years old?"); 
		verify.setTitleJustification(TitledBorder.CENTER); 
		verify.setTitleFont(new Font("Arial", Font.BOLD, 20));		
		
		//HEADING 
		HeadingLabel = new JLabel("VERIFY");
		HeadingLabel.setBorder(loweredraisedbevel);
		HeadingLabel.setFont(new Font("Arial", Font.BOLD, 40));
		HeadingLabel.setForeground(Color.BLACK);
		HeadingLabel.setHorizontalAlignment(JLabel.CENTER);
		HeadingLabel.setVerticalAlignment(JLabel.CENTER);
				
		HeadingPanel = new JPanel();
		HeadingPanel.setBounds(0, 0, 1000, 600);
		HeadingPanel.add(HeadingLabel);
				
		//VERIFY
		Yes = new JRadioButton("      YES      ");
		Yes.setFont(new Font("Arial", Font.PLAIN, 20));
		No = new JRadioButton("      NO      ");
		No.setFont(new Font("Arial", Font.PLAIN, 20));
		Confirm = new JButton("      CONFIRM      ");
		Confirm.setFont(new Font("Arial", Font.PLAIN, 20));
		Confirm.setBorder(loweredetched);
	    
		VerifyPanel = new JPanel();
		VerifyPanel.setBounds(30, 90, 400, 100);
		VerifyPanel.setBorder(verify);
		VerifyPanel.add(Yes);
		VerifyPanel.add(No);
		VerifyPanel.add(Confirm);
		
		//FRAME
		Frame.setSize(475, 250);
		Frame.setVisible(true);
		
		//ADD
        Frame.add(VerifyPanel);	
		Frame.add(HeadingPanel);	
		
		
	//ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS
		
	//CONFIRM BUTTON ACTION LISTENERS
		Confirm.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (No.isSelected()) {
		            System.exit(0);
		        } else if (Yes.isSelected()) {
		            SwingUtilities.invokeLater(new Runnable() {
		                public void run() {
		                    SignIn in = new SignIn();
		                    in.Frame.setVisible(true);
		                }});
		            Frame.dispose(); //REMOVES THE PREVIOUS FRAME
		        } else {
	                JOptionPane.showMessageDialog(null, "Invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
	            }
		    }});
	}
}
