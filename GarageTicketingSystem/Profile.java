package GarageTicketingSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Profile {
	public JFrame Frame = new JFrame("PROFILE");
	public JPanel HeadingPanel, ProfilePanel;
	public JLabel HeadingLabel;
	public JLabel UserLabel, PassLabel, GenderLabel, AgeLabel, LocationLabel;
	public JTextField UserText, PassText, GenderText, AgeText, LocationText;
	
	public void Profile() {
		
		//FRAME
		Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Frame.setSize(475, 450);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setLayout(new BorderLayout());;  
		
		//BORDER
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border loweredraisedbevel = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);;
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		TitledBorder prof; prof = BorderFactory.createTitledBorder(loweredetched, "ACCOUNT"); 
		prof.setTitleJustification(TitledBorder.CENTER); 
		prof.setTitleFont(new Font("Arial", Font.BOLD, 20));		
		
		//HEADING 
			//LABEL
		HeadingLabel = new JLabel("PROFILE");
		HeadingLabel.setBorder(loweredraisedbevel);
		HeadingLabel.setFont(new Font("Arial", Font.BOLD, 40));
		HeadingLabel.setForeground(Color.BLACK);
		HeadingLabel.setHorizontalAlignment(JLabel.CENTER);
		HeadingLabel.setVerticalAlignment(JLabel.CENTER);
			//PANEL
		HeadingPanel = new JPanel();
		HeadingPanel.setBounds(0, 0, 1000, 600);
		HeadingPanel.add(HeadingLabel);
        	
		//SIGN IN
			//LABEL
		UserLabel = new JLabel("Username: ");
		UserLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		UserLabel.setBounds(30, 30, 150, 20);
		PassLabel = new JLabel("Password: ");
		PassLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		PassLabel.setBounds(30, 70, 150, 20);
		LocationLabel = new JLabel("Location: ");
		LocationLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		LocationLabel.setBounds(30, 110, 150, 20);
		GenderLabel = new JLabel("Gender: ");
		GenderLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		GenderLabel.setBounds(30, 150, 150, 20);
		AgeLabel = new JLabel("Age: ");
		AgeLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		AgeLabel.setBounds(30, 190, 150, 20);
			//TEXTFIELD
		UserText = new JTextField(20);
		UserText.setFont(new Font("Arial", Font.PLAIN, 18));
		UserText.setBounds(220, 30, 150, 25);
		UserText.setBackground(Color.WHITE); 				
		UserText.setBorder(loweredetched);;
		PassText = new JTextField(20);
		PassText.setFont(new Font("Arial", Font.PLAIN, 18));
		PassText.setBounds(220, 70, 150, 25);
		PassText.setEditable(false);
		PassText.setBackground(Color.WHITE); 				
		PassText.setBorder(loweredetched);
		LocationText = new JTextField();
		LocationText.setFont(new Font("Arial", Font.PLAIN, 18));
		LocationText.setBounds(220, 110, 150, 25);
		LocationText.setBackground(Color.WHITE); 				
		LocationText.setBorder(loweredetched);
		GenderText = new JTextField();
		GenderText.setFont(new Font("Arial", Font.PLAIN, 18));
		GenderText.setBounds(220, 150, 150, 25);
		GenderText.setBackground(Color.WHITE); 				
		GenderText.setBorder(loweredetched);
		AgeText = new JTextField();
		AgeText.setFont(new Font("Arial", Font.PLAIN, 18));
		AgeText.setBounds(220, 190, 150, 25);
		AgeText.setBackground(Color.WHITE); 				
		AgeText.setBorder(loweredetched);
			//PANEL
		ProfilePanel = new JPanel();
		ProfilePanel.setLayout(null);
		ProfilePanel.setBounds(30, 80, 400, 300);
		ProfilePanel.setBorder(prof);
		ProfilePanel.add(UserLabel);
		ProfilePanel.add(PassLabel);
		ProfilePanel.add(LocationLabel);
		ProfilePanel.add(GenderLabel);
		ProfilePanel.add(AgeLabel);
		ProfilePanel.add(UserText);
		ProfilePanel.add(PassText);
		ProfilePanel.add(LocationText);
		ProfilePanel.add(GenderText);
		ProfilePanel.add(AgeText);
		
		//USER MANAGER
		HashMap<String, String> Users = UserManager.GetUsers();
        if (!Users.isEmpty()) {
            //GET USERNAME AND PASSWORD FROM USERMANAGER
            String Username = Users.keySet().iterator().next();
            String Password = Users.get(Username);
            
            if (Username.equals("iverson") && Password.equals("iver")) {
	        	//SETT USERNAME AND PASSWORD 
	            UserText.setText(Username);
	            PassText.setText(Password);
	            LocationText.setText("Sadag, Bahong");
	            GenderText.setText("Male");
	            AgeText.setText("20");
            } else {
            	//SETT NEW USERNAME AND PASSWORD 
	        	UserText.setText(Username);
	            PassText.setText(Password);
	            LocationText.setText("N/A");
	            GenderText.setText("N/A");
	            AgeText.setText("N/A");
            }
        }
		//ADD
        Frame.add(ProfilePanel);	
		Frame.add(HeadingPanel);
		
		//FRAME
		Frame.setVisible(true);
	}
}