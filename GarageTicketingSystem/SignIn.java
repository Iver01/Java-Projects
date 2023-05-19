package GarageTicketingSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SignIn {
	public JFrame Frame = new JFrame("ACCOUNT");
	public JButton Signin, Signup;
	public JPanel HeadingPanel, LoginPanel;
	public JLabel HeadingLabel;
	public JLabel UserLabel, PassLabel;
	public JTextField UserText, PassText;
	
	public SignIn() {
		
		//FRANE
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(500, 300);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setLayout(new BorderLayout());;  
		
		//BORDER
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border loweredraisedbevel = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);;
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		TitledBorder acc; acc = BorderFactory.createTitledBorder(loweredetched, "WELCOME"); 
		acc.setTitleJustification(TitledBorder.CENTER); 
		acc.setTitleFont(new Font("Arial", Font.BOLD, 20));		
		
		//HEADING 
		HeadingLabel = new JLabel("SIGN UP / SIGN IN");
		HeadingLabel.setBorder(loweredraisedbevel);
		HeadingLabel.setFont(new Font("Arial", Font.BOLD, 40));
		HeadingLabel.setForeground(Color.BLACK);
		HeadingLabel.setHorizontalAlignment(JLabel.CENTER);
		HeadingLabel.setVerticalAlignment(JLabel.CENTER);
				
		HeadingPanel = new JPanel();
		HeadingPanel.setBounds(0, 0, 1000, 600);
		HeadingPanel.add(HeadingLabel);
				
		//SIGN IN
		UserLabel = new JLabel("Username: ");
		UserLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		UserLabel.setBounds(30, 30, 150, 20);
		PassLabel = new JLabel("Password: ");
		PassLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		PassLabel.setBounds(30, 70, 150, 20);
		UserText = new JTextField(20);
		UserText.setFont(new Font("Arial", Font.PLAIN, 18));
		UserText.setHorizontalAlignment(JLabel.CENTER);
		UserText.setBounds(220, 30, 150, 25);
		PassText = new JTextField(20);
		PassText.setFont(new Font("Arial", Font.PLAIN, 18));
		PassText.setHorizontalAlignment(JLabel.CENTER);
		PassText.setBounds(220, 70, 150, 25);
		Signin = new JButton("Sign in");
		Signin.setFont(new Font("Arial", Font.PLAIN, 20));	Signin.setBounds(220, 110, 150, 25); 
		Signin.setBorder(loweredetched);
		Signup = new JButton("Sign up");
		Signup.setFont(new Font("Arial", Font.PLAIN, 20));	Signup.setBounds(30, 110, 150, 25); 
		Signup.setBorder(loweredetched);
		
		LoginPanel = new JPanel();
		LoginPanel.setLayout(null);
		LoginPanel.setBounds(30, 80, 400, 150);
		LoginPanel.setBorder(acc);
		LoginPanel.add(UserLabel);
		LoginPanel.add(PassLabel);
		LoginPanel.add(UserText);
		LoginPanel.add(PassText);
		LoginPanel.add(Signin);
		LoginPanel.add(Signup);
		
		//ADD
        Frame.add(LoginPanel);	
		Frame.add(HeadingPanel);
		
		//FRAME
		Frame.setVisible(true);
	}
}
