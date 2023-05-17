package GarageTicketingSystem;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;


public class GarageTicketingSystemInterface{
	
	public JFrame Frame = new JFrame("GARAGE TICKETING SYSTEM");
	
	public JLabel HeadingLabel, TicketTypeLabel;
	public JLabel TaxLabel, SubTotalLabel, TotalLabel, Equals;
	public JRadioButton StandardLabel, EconomyLabel, FirstClassLabel;
	public JRadioButton SingleTicketLabel, ReturnTicketLabel;
	public JTextField TaxTextField, SubTotalTextField, TotalTextField;
	public JComboBox DestinationBox, DepartureBox, NumberTicketsBox;
	public JButton SubmitButton, ResetButton, ExitButton;
	
	public JLabel ClassLabel, TicketLabel, NumberTicketLabel;
	public JTextField ClassTextField, TicketTextField, NumberTicketTextField;
	
	public JLabel FromLabel, ToLabel, DateLabel, TimeLabel;
	public JTextField FromTextField, ToTextField, DateTextField, TimeTextField;
	public JLabel TicketNoLabel, PriceLabel, RouteLabel;
	public JTextField TicketNoField, PriceTextField, RouteTextField;
	
	public JLabel Profile, Features;
	public JButton ViewProfile, Reserve, Communicate, LogOut;
	
	public JPanel TicketTypePanel, HeadingPanel, PaymentPanel, DestinationPanel, Print1Panel, 
					Print2Panel, Print3Panel, ButtonPanel, MenuPanel;
	
	
	public GarageTicketingSystemInterface() { 
		//FRANE
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setTitle("Travel Booking System");
		Frame.setSize(1250, 600);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setLayout(new BorderLayout());;  
		
		//BORDER
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border loweredraisedbevel = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);;
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		TitledBorder tickettpye; tickettpye = BorderFactory.createTitledBorder(loweredetched, "TICKET TYPE"); 
		tickettpye.setTitleJustification(TitledBorder.CENTER); 
		tickettpye.setTitleFont(new Font("Arial", Font.BOLD, 20));		
		TitledBorder payment; payment = BorderFactory.createTitledBorder(loweredetched, "PAYMENT"); 
		payment.setTitleJustification(TitledBorder.CENTER); 
		payment.setTitleFont(new Font("Arial", Font.BOLD, 20));
		TitledBorder destination; destination = BorderFactory.createTitledBorder(loweredetched, "DESTINATION"); 
		destination.setTitleJustification(TitledBorder.CENTER); 
		destination.setTitleFont(new Font("Arial", Font.BOLD, 20));
		TitledBorder print1; print1 = BorderFactory.createTitledBorder(loweredetched, "TICKET SUMMARY"); 
		print1.setTitleJustification(TitledBorder.RIGHT); 
		print1.setTitleFont(new Font("Arial", Font.BOLD, 20));
		TitledBorder print2; print2 = BorderFactory.createTitledBorder(loweredetched, "DEPARTURE"); 
		print2.setTitleJustification(TitledBorder.RIGHT); 
		print2.setTitleFont(new Font("Arial", Font.BOLD, 15));
		TitledBorder print3; print3 = BorderFactory.createTitledBorder(loweredetched, "TICKET"); 
		print3.setTitleJustification(TitledBorder.RIGHT); 
		print3.setTitleFont(new Font("Arial", Font.BOLD, 15));
		TitledBorder menu; menu = BorderFactory.createTitledBorder(loweredetched, "MENU"); 
		menu.setTitleJustification(TitledBorder.CENTER); 
		menu.setTitleFont(new Font("Arial", Font.BOLD, 20));
		
		//HEADING 
		HeadingLabel = new JLabel("GARAGE TICKETING SYSTEM");
		HeadingLabel.setBorder(loweredraisedbevel);
		HeadingLabel.setFont(new Font("Arial", Font.BOLD, 60));
		HeadingLabel.setForeground(Color.BLACK);
		HeadingLabel.setHorizontalAlignment(JLabel.CENTER);
		HeadingLabel.setVerticalAlignment(JLabel.CENTER);
				
		HeadingPanel = new JPanel();
		HeadingPanel.setBounds(0, 0, 1200, 600);
		HeadingPanel.add(HeadingLabel);
				
		//TICKET TYPE
		StandardLabel = new JRadioButton("Standard");
		StandardLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		StandardLabel.setBounds(20, 40, 120, 20);
		EconomyLabel = new JRadioButton("Economy");
		EconomyLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		EconomyLabel.setBounds(20, 80, 120, 20);
		FirstClassLabel = new JRadioButton("First Class");
		FirstClassLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		FirstClassLabel.setBounds(20, 120, 130, 20);	
		SingleTicketLabel = new JRadioButton("Single Ticket");
	    SingleTicketLabel.setFont(new Font("Arial", Font.PLAIN, 20));
	    SingleTicketLabel.setBounds(180, 40, 150, 20);	
	    ReturnTicketLabel = new JRadioButton("Return Ticket");
	    ReturnTicketLabel.setFont(new Font("Arial", Font.PLAIN, 20));
	    ReturnTicketLabel.setBounds(180, 80, 150, 20);
	    NumberTicketsBox = new JComboBox(new String[]{"Number of Tickets","1", "2", "2", "3", "4", "5"});  
	    NumberTicketsBox.setFont(new Font("Arial", Font.PLAIN, 18));
	    NumberTicketsBox.setBounds(170, 120, 190, 25);
	    NumberTicketsBox.setBackground(Color.WHITE); 	
	    
		TicketTypePanel = new JPanel();
		TicketTypePanel.setLayout(null);
		TicketTypePanel.setBounds(30, 100, 400, 170);
		TicketTypePanel.setBorder(tickettpye);
		TicketTypePanel.add(StandardLabel);
		TicketTypePanel.add(EconomyLabel);
		TicketTypePanel.add(FirstClassLabel);
		TicketTypePanel.add(SingleTicketLabel);
		TicketTypePanel.add(ReturnTicketLabel);
		TicketTypePanel.add(NumberTicketsBox);
		
		//Destination
		DestinationBox = new JComboBox(new String[]{"Destination", "Alno", "Bahong", "Alapang", "Cruz", "Tomay"});
	    DestinationBox.setFont(new Font("Arial", Font.PLAIN, 18));
	    DestinationBox.setBounds(230, 45, 150, 25);
	    DestinationBox.setBackground(Color.WHITE); 				
	    Equals = new JLabel("=");
	    Equals.setFont(new Font("Arial", Font.BOLD, 20));
	    Equals.setBounds(195, 45, 20, 25);
	    DepartureBox = new JComboBox(new String[]{"Location", "Alno", "Bahong", "Alapang", "Cruz", "Tomay"});
	    DepartureBox.setFont(new Font("Arial", Font.PLAIN, 18));
	    DepartureBox.setBounds(20, 45, 150, 25);
	    DepartureBox.setBackground(Color.WHITE); 				

	    
	    
	    DestinationPanel = new JPanel();
	    DestinationPanel.setLayout(null);
	    DestinationPanel.setBounds(30, 280, 400, 100);
	    DestinationPanel.setBorder(destination);
	    DestinationPanel.add(DestinationBox);   
	    DestinationPanel.add(DepartureBox);
	    DestinationPanel.add(Equals);
	    
		//PAYMENT
		TaxLabel = new JLabel("Tax");
		TaxLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		TaxLabel.setBounds(30, 30, 100, 20);
		SubTotalLabel = new JLabel("SubTotal");
		SubTotalLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		SubTotalLabel.setBounds(30, 70, 100, 20);
		TotalLabel = new JLabel("Total");
		TotalLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		TotalLabel.setBounds(30, 110, 100, 20);
		
		TaxTextField = new JTextField();
		TaxTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		TaxTextField.setHorizontalAlignment(JLabel.CENTER);
		TaxTextField.setBounds(220, 30, 150, 25);
		TaxTextField.setEditable(false);
		TaxTextField.setBackground(Color.WHITE); 				
		TaxTextField.setBorder(loweredetched);
		SubTotalTextField  = new JTextField();
		SubTotalTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		SubTotalTextField.setHorizontalAlignment(JLabel.CENTER);
		SubTotalTextField.setBounds(220, 70, 150, 25);
		SubTotalTextField.setEditable(false);
		SubTotalTextField.setBackground(Color.WHITE); 				
		SubTotalTextField.setBorder(loweredetched);
		TotalTextField = new JTextField();
		TotalTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		TotalTextField.setHorizontalAlignment(JLabel.CENTER);
		TotalTextField.setBounds(220, 110, 150, 25);
		TotalTextField.setEditable(false);
		TotalTextField.setBackground(Color.WHITE); 				
		TotalTextField.setBorder(loweredetched);
		
		PaymentPanel = new JPanel();
		PaymentPanel.setLayout(null);
		PaymentPanel.setBounds(30, 390, 400, 150);
		PaymentPanel.setBorder(payment);
		PaymentPanel.add(TaxLabel);
		PaymentPanel.add(SubTotalLabel);
		PaymentPanel.add(TotalLabel);
		PaymentPanel.add(TaxTextField);
		PaymentPanel.add(SubTotalTextField);
		PaymentPanel.add(TotalTextField);
	    
		//PRINT1
		ClassLabel = new JLabel("Class");
		ClassLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		ClassLabel.setHorizontalAlignment(JLabel.CENTER);
		ClassLabel.setBounds(20, 40, 130, 20);
		NumberTicketLabel = new JLabel("Number of Ticket");
		NumberTicketLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		NumberTicketLabel.setHorizontalAlignment(JLabel.CENTER);
		NumberTicketLabel.setBounds(185, 40, 150, 20);
		TicketLabel = new JLabel("Ticket");
		TicketLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		TicketLabel.setHorizontalAlignment(JLabel.CENTER);
		TicketLabel.setBounds(370, 40, 150, 20);
		ClassTextField  = new JTextField();
		ClassTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		ClassTextField.setHorizontalAlignment(JLabel.CENTER);
		ClassTextField.setBounds(20, 70, 130, 30);
		ClassTextField.setEditable(false);
		ClassTextField.setBackground(Color.WHITE); 				
		ClassTextField.setBorder(loweredetched);
		NumberTicketTextField  = new JTextField();
		NumberTicketTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		NumberTicketTextField.setHorizontalAlignment(JLabel.CENTER);
		NumberTicketTextField.setBounds(185, 70, 150, 30);
		NumberTicketTextField.setEditable(false);
		NumberTicketTextField.setBackground(Color.WHITE); 				
		NumberTicketTextField.setBorder(loweredetched);
		TicketTextField  = new JTextField();
		TicketTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		TicketTextField.setHorizontalAlignment(JLabel.CENTER);
		TicketTextField.setBounds(370, 70, 150, 30);
		TicketTextField.setEditable(false);
		TicketTextField.setBackground(Color.WHITE); 				
		TicketTextField.setBorder(loweredetched);
		
		Print1Panel = new JPanel();
		Print1Panel.setBounds(450, 100, 550, 120);
		Print1Panel.setLayout(null);
		Print1Panel.setBorder(print1);
		Print1Panel.add(ClassLabel);
		Print1Panel.add(TicketLabel);
		Print1Panel.add(NumberTicketLabel);
		Print1Panel.add(ClassTextField);
		Print1Panel.add(TicketTextField);
		Print1Panel.add(NumberTicketTextField);
		
		//PRINT2
		FromLabel = new JLabel("From");
		FromLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		FromLabel.setBounds(30, 40, 50, 30);
		ToLabel = new JLabel("To");
		ToLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		ToLabel.setBounds(30, 90, 50, 30);
		DateLabel = new JLabel("Date");
		DateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		DateLabel.setBounds(30, 140, 50, 30);
		TimeLabel = new JLabel("Time");
		TimeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		TimeLabel.setBounds(30, 190, 50, 30);
		
		FromTextField  = new JTextField();
		FromTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		FromTextField.setHorizontalAlignment(JLabel.CENTER);
		FromTextField.setBounds(130, 40, 160, 30);
		FromTextField.setEditable(false);
		FromTextField.setBackground(Color.WHITE); 				
		FromTextField.setBorder(loweredetched);
		ToTextField  = new JTextField();
		ToTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		ToTextField.setHorizontalAlignment(JLabel.CENTER);
		ToTextField.setBounds(130, 90, 160, 30);
		ToTextField.setEditable(false);
		ToTextField.setBackground(Color.WHITE); 				
		ToTextField.setBorder(loweredetched);
		DateTextField  = new JTextField();
		DateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		DateTextField.setHorizontalAlignment(JLabel.CENTER);
		DateTextField.setBounds(130, 140, 160, 30);
		DateTextField.setEditable(false);
		DateTextField.setBackground(Color.WHITE); 				
		DateTextField.setBorder(loweredetched);
		TimeTextField  = new JTextField();
		TimeTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		TimeTextField.setHorizontalAlignment(JLabel.CENTER);
		TimeTextField.setBounds(130, 190, 160, 30);
		TimeTextField.setEditable(false);
		TimeTextField.setBackground(Color.WHITE); 				
		TimeTextField.setBorder(loweredetched);
		
		Print2Panel = new JPanel();
		Print2Panel.setBounds(450, 220, 320, 240);
		Print2Panel.setLayout(null);
		Print2Panel.setBorder(print2);
		Print2Panel.add(FromLabel);
		Print2Panel.add(ToLabel);
		Print2Panel.add(DateLabel);
		Print2Panel.add(TimeLabel);
		Print2Panel.add(FromTextField);
		Print2Panel.add(ToTextField);
		Print2Panel.add(DateTextField);
		Print2Panel.add(TimeTextField);
		
		//PRINT 3
		TicketNoLabel = new JLabel("Ticket No");
		TicketNoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		TicketNoLabel.setBounds(50, 20, 100, 30);
		PriceLabel = new JLabel("Price");
		PriceLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		PriceLabel.setBounds(50, 90, 100, 30);
		RouteLabel = new JLabel("Route");
		RouteLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		RouteLabel.setBounds(50, 160, 100, 30);
		
		TicketNoField  = new JTextField();
		TicketNoField.setFont(new Font("Arial", Font.PLAIN, 20));
		TicketNoField.setHorizontalAlignment(JLabel.CENTER);
		TicketNoField.setBounds(50, 50, 100, 30);
		TicketNoField.setEditable(false);
		TicketNoField.setBackground(Color.WHITE); 				
		TicketNoField.setBorder(loweredetched);
		PriceTextField  = new JTextField();
		PriceTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		PriceTextField.setHorizontalAlignment(JLabel.CENTER);
		PriceTextField.setBounds(50, 120, 100, 30);
		PriceTextField.setEditable(false);
		PriceTextField.setBackground(Color.WHITE); 				
		PriceTextField.setBorder(loweredetched);
		RouteTextField  = new JTextField();
		RouteTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		RouteTextField.setHorizontalAlignment(JLabel.CENTER);
		RouteTextField.setBounds(50, 190, 100, 30);
		RouteTextField.setEditable(false);
		RouteTextField.setBackground(Color.WHITE); 				
		RouteTextField.setBorder(loweredetched);
		
		Print3Panel = new JPanel();
		Print3Panel.setBounds(770, 220, 230, 240);
		Print3Panel.setLayout(null);
		Print3Panel.setBorder(print3);
		Print3Panel.add(TicketNoLabel);
		Print3Panel.add(PriceLabel);
		Print3Panel.add(RouteLabel);
		Print3Panel.add(TicketNoField);
		Print3Panel.add(PriceTextField);
		Print3Panel.add(RouteTextField);

		//BUTTONS
		SubmitButton = new JButton("SUBMIT");
		SubmitButton.setFont(new Font("Arial", Font.PLAIN, 20));	
		SubmitButton.setBounds(30, 13, 150, 40); 
		SubmitButton.setBorder(raisedbevel);
		SubmitButton.setBackground(Color.LIGHT_GRAY); 
		ResetButton = new JButton("RESET");
		ResetButton.setFont(new Font("Arial", Font.PLAIN, 20));		
		ResetButton.setBounds(200, 13, 150, 40); 
		ResetButton.setBorder(raisedbevel);
		ResetButton.setBackground(Color.LIGHT_GRAY); 
		ExitButton = new JButton("EXIT");
		ExitButton.setFont(new Font("Arial", Font.PLAIN, 20));	
		ExitButton.setBounds(370, 13, 150, 40); 
		ExitButton.setBorder(raisedbevel);
		ExitButton.setBackground(Color.LIGHT_GRAY); 
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(452, 475, 547, 64);
		ButtonPanel.setLayout(null);
		ButtonPanel.setBorder(loweredetched);
		ButtonPanel.add(SubmitButton);
		ButtonPanel.add(ResetButton);
		ButtonPanel.add(ExitButton);
		
		//MENU
		Profile = new JLabel("PROFILE");
		Profile.setFont(new Font("Arial", Font.PLAIN, 20));
		Profile.setBounds(25, 40, 130, 30);
		Features = new JLabel("FEATURES");
		Features.setFont(new Font("Arial", Font.PLAIN, 20));
		Features.setBounds(25, 120, 130, 30);
		ViewProfile = new JButton("View Profile");
		ViewProfile.setFont(new Font("Arial", Font.PLAIN, 15));	
		ViewProfile.setBounds(25, 80, 130, 20);
		ViewProfile.setBackground(Color.LIGHT_GRAY); 				
		ViewProfile.setBorder(raisedbevel);
		Reserve = new JButton("Reservvation");
		Reserve.setFont(new Font("Arial", Font.PLAIN, 15));	
		Reserve.setBounds(25, 160, 130, 20); 
		Reserve.setBackground(Color.LIGHT_GRAY); 				
		Reserve.setBorder(raisedbevel);
		Communicate = new JButton("Communicate");
		Communicate.setFont(new Font("Arial", Font.PLAIN, 15));	
		Communicate.setBounds(25, 200, 130, 20); 
		Communicate.setBackground(Color.LIGHT_GRAY); 				
		Communicate.setBorder(raisedbevel);
		LogOut = new JButton("Log Out");
		LogOut.setFont(new Font("Arial", Font.PLAIN, 15));		
		LogOut.setBounds(25, 240, 130, 20); 
		LogOut.setBackground(Color.LIGHT_GRAY); 				
		LogOut.setBorder(raisedbevel);
		
		//CLOCK
		JButton ClockButton = new JButton();
		ClockButton.setBounds(25, 360, 130, 30);
		ClockButton.setBackground(Color.LIGHT_GRAY); 				
		ClockButton.setBorder(loweredetched);
		ClockButton.setFont(new Font("Arial", Font.PLAIN, 20));
		DigitalClock clock = new DigitalClock(ClockButton);
			new Thread(clock).start();
		
		//CALENDAR
		JButton CalendarButton = new JButton("CALENDAR");
		CalendarButton.setBounds(25, 320, 130, 30);
		CalendarButton.setBackground(Color.LIGHT_GRAY); 
		CalendarButton.setBorder(loweredetched);
		CalendarButton.setFont(new Font("Arial", Font.PLAIN, 20));
		
		MenuPanel = new JPanel();
		MenuPanel.setBounds(1020, 100, 180, 440);
		MenuPanel.setLayout(null);
		MenuPanel.setBorder(menu);
		MenuPanel.add(ClockButton);
		MenuPanel.add(CalendarButton);
		MenuPanel.add(Profile);
		MenuPanel.add(ViewProfile);
		MenuPanel.add(Features);
		MenuPanel.add(ViewProfile);
		MenuPanel.add(Reserve);
		MenuPanel.add(Communicate);
		MenuPanel.add(LogOut);
		
		//FRAME
		Frame.setVisible(true);
		
		//ADD
		Frame.add(MenuPanel);
		Frame.add(ButtonPanel);
		Frame.add(Print3Panel);
		Frame.add(Print2Panel);
		Frame.add(Print1Panel);
		Frame.add(DestinationPanel);
		Frame.add(PaymentPanel);
        Frame.add(TicketTypePanel);	
		Frame.add(HeadingPanel);
		
		
	//ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS	
	
		
	//CALENDAR BUTTPN
		CalendarButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	 SwingUtilities.invokeLater(() -> {
		             new PHCalendar();  
		    	 }); 
		    }});
		
	//PROFILE BUTTON
		ViewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile Profile = new Profile();
			        Profile.Profile();
			}});	
		
	//EXIT BUTTON
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}});
		
	//RESET BUTTON
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaxTextField.setText("");					TicketTextField.setText("");
				SubTotalTextField.setText("");				FromTextField.setText("");
				TotalTextField.setText("");				ToTextField.setText("");
				ClassTextField.setText("");				DateTextField.setText("");
				NumberTicketTextField.setText("");			TimeTextField.setText("");
				TicketNoField.setText("");					RouteTextField.setText("");
				PriceTextField.setText("");				SingleTicketLabel.setSelected(false);
				ReturnTicketLabel.setSelected(false);		FirstClassLabel.setSelected(false);
				EconomyLabel.setSelected(false);			StandardLabel.setSelected(false);
				DestinationBox.setSelectedIndex(0);		NumberTicketsBox.setSelectedIndex(0);
				DepartureBox.setSelectedIndex(0);		
			}});
			
	//GENERATES THE TICKET TYPE ON THE TEXT FIELDS
		SubmitButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		        //EXCEPTIONS
		    	if ((StandardLabel.isSelected() && EconomyLabel.isSelected())
		                || (StandardLabel.isSelected() && FirstClassLabel.isSelected())
		                || (EconomyLabel.isSelected() && FirstClassLabel.isSelected())
		                || (EconomyLabel.isSelected() && FirstClassLabel.isSelected() && StandardLabel.isSelected())
		                || (SingleTicketLabel.isSelected() && ReturnTicketLabel.isSelected())
		                || (!StandardLabel.isSelected() && !EconomyLabel.isSelected() && !FirstClassLabel.isSelected()
		                        && NumberTicketsBox.getSelectedIndex() == 0
		                        && DepartureBox.getSelectedIndex() == 0
		                        && DestinationBox.getSelectedIndex() == 0)) {
		            JOptionPane.showMessageDialog(null, "Please select only one option for ticket type, ticket category, number of tickets, departure, and destination.",
		                    "Selection Error", JOptionPane.ERROR_MESSAGE);
		            
		            //CLEAR SELECTION
		            SingleTicketLabel.setSelected(false);	DepartureBox.setSelectedIndex(0);
					ReturnTicketLabel.setSelected(false);	FirstClassLabel.setSelected(false);
					EconomyLabel.setSelected(false);		StandardLabel.setSelected(false);
					DestinationBox.setSelectedIndex(0);		NumberTicketsBox.setSelectedIndex(0);
					
		            //CLEAR TEXT FIELD
		            ClassTextField.setText("");			TimeTextField.setText("");
		            NumberTicketTextField.setText("");	DateTextField.setText("");
		            TicketTextField.setText("");		TicketNoField.setText("");
		            FromTextField.setText("");			RouteTextField.setText("");
		            ToTextField.setText("");
		            
		        } else {
		        	
		            //STANDARD OR ECONOMY OR FIRSTCLASS
		            String TicketType = "";
		            if (StandardLabel.isSelected()) {
		                TicketType = "Standard";
		            } else if (EconomyLabel.isSelected()) {
		                TicketType = "Economy";
		            } else if (FirstClassLabel.isSelected()) {
		                TicketType = "First Class";
		            }

		            //RETURN OR SINGLE
		            String TicketCategory = "";
		            if (SingleTicketLabel.isSelected()) {
		                TicketCategory = "Single Ticket";
		            } else if (ReturnTicketLabel.isSelected()) {
		                TicketCategory = "Return Ticket";
		            }

		            //TICKETS
		            String NumberOfTickets = (String) NumberTicketsBox.getSelectedItem();

		            //DEPARTURE AND DESTINATION
		            String Departure = (String) DepartureBox.getSelectedItem();
		            String Destination = (String) DestinationBox.getSelectedItem();

		            //TEXTFIELDS
		            ClassTextField.setText(TicketType);
		            NumberTicketTextField.setText(NumberOfTickets);
		            TicketTextField.setText(TicketCategory);
		            FromTextField.setText(Departure);
		            ToTextField.setText(Destination);

		            //CURRENT TIME AND DATE
		            Calendar Calc = Calendar.getInstance();
		            SimpleDateFormat TimeFormat = new SimpleDateFormat("hh:mm:ss");
		            String FormattedTime = TimeFormat.format(Calc.getTime());
		            TimeTextField.setText(FormattedTime);

		            SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy");
		            String FormattedDate = DateFormat.format(Calc.getTime());
		            DateTextField.setText(FormattedDate);

		            //RANDOM TICKET NUMBER
		            Random Random = new Random();
		            int TicketNo = Random.nextInt(9000) + 1000;
		            TicketNoField.setText(String.valueOf(TicketNo));

		            //RANDOM ROUTES
		            String[] Routes = {"Route A", "Route B", "Route C", "Route D", "Route E"};
		            int RandomIndex = Random.nextInt(Routes.length);
		            RouteTextField.setText(Routes[RandomIndex]);
		        }
		    }});
		
	//CALCULATION FOR THE TOTAL COST
		SubmitButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	// DEPARTURE AND DESTINATION AND TICKET TYPE
		        String Departure = (String)DepartureBox.getSelectedItem();
		        String Destination = (String)DestinationBox.getSelectedItem();
		        String TicketType = "";
		        String TicketType1 = "";
		        
		        //STANDARD OR ECONOMY OR FIRSTCLASS
		        if (StandardLabel.isSelected()) {
		            TicketType = "Standard";
		        } else if (EconomyLabel.isSelected()) {
		            TicketType = "Economy";
		        } else if (FirstClassLabel.isSelected()) {
		            TicketType = "First Class";
		        } 
		        
		        //STANDARD OR ECONOMY OR FIRSTCLASS
		        if (SingleTicketLabel.isSelected()) {
		            TicketType1 = "Single Ticket";
		        } else if (ReturnTicketLabel.isSelected()) {
		            TicketType1 = "Return Ticket";
		        } 
		        
		        //TICKETS
		        int NumberTickets = NumberTicketsBox.getSelectedIndex();
		        
		        //TOTAL
		        double Amount = CalculateAmount(Departure, Destination, TicketType, TicketType1, NumberTickets);
		        double Tax = Amount * 0.05;
		        double Total = Amount + Tax;
		        
		        //TOTAL FORMAT
		        TaxTextField.setText(String.format("%.2f", Tax));
		        SubTotalTextField.setText(String.format("%.2f", Amount));
		        TotalTextField.setText(String.format("%.2f", Total));
		        PriceTextField.setText(String.format("%.2f", Total));
		    }});
	}
	//SWITCH STATEMENT TO GENERATE THE PRICES OF DIFFERENT TICKETS WITH DIFFERENT LOCATION
		private double CalculateAmount(String DepartureBox, String DestinationBox, String TicketType, String TicketType1,  int NumberTickets) {
		    double amount = 0.0;
		    switch (DepartureBox) {
		        case "Alno":
		            switch (DestinationBox) {
		                case "Bahong":
		                    amount = 12.5;
		                    break;
		                case "Alapang":
		                    amount = 10.0;
		                    break;
		                case "Cruz":
		                    amount = 8.0;
		                    break;
		                case "Tomay":
		                    amount = 15.0;
		                    break;
		            }
		            break;
		        case "Bahong":
		            switch (DestinationBox) {
		                case "Alno":
		                    amount = 12.5;
		                    break;
		                case "Alapang":
		                    amount = 10.5;
		                    break;
		                case "Cruz":
		                    amount = 9.0;
		                    break;
		                case "Tomay":
		                    amount = 16.0;
		                    break;
		            }
		            break;
		        case "Alapang":
		            switch (DestinationBox) {
		                case "Alno":
		                    amount = 10.0;
		                    break;
		                case "Bahong":
		                    amount = 10.5;
		                    break;
		                case "Cruz":
		                    amount = 7.0;
		                    break;
		                case "Tomay":
		                    amount = 13.0;
		                    break;
		            }
		            break;
		        case "Cruz":
		            switch (DestinationBox) {
		                case "Alno":
		                    amount = 8.0;
		                    break;
		                case "Bahong":
		                    amount = 9.0;
		                    break;
		                case "Alapang":
		                    amount = 7.0;
		                    break;
		                case "Tomay":
		                    amount = 10.0;
		                    break;
		            }
		            break;
		        case "Tomay":
		            switch (DestinationBox) {
		                case "Alno":
		                    amount = 15.0;
		                    break;
		                case "Bahong":
		                    amount = 16.0;
		                    break;
		                case "Alapang":
		                    amount = 13.0;
		                    break;
		                case "Cruz":
		                    amount = 10.0;
		                    break;
		            }
		            break;
		    }
		    
		    switch (TicketType) {
		        case "Economy":
		            amount *= 0.8;
		            break;
		        case "Standard":
		            amount *= 1.0;
		            break;
		        case "First Class":
		            amount *= 1.5;
		            break;
		    }
		    switch (TicketType1) {
	        case "Single Ticket":
	            amount *= 1.0;
	            break;
	        case "Return Ticket":
	            amount *= 2.0;
	            break;
	    }
		    
		    amount *= NumberTickets;
		    return amount;
		}
	}



