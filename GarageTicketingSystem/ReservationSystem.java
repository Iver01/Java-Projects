package GarageTicketingSystem;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
	
	public JFrame Frame = new JFrame("RESERVATION");
	public List<Reservation> Reservations;
    public JComboBox<String> DepartureComboBox;
    public JComboBox<String> DestinationComboBox;
    public JPanel ReservationPanel, HeadingPanel;
    public JLabel HeadingLabel, DestinationLabel, DepartureLabel, NameLabel;
    public JTextField NameT;
    public JTextArea ReservationsText;
    public JButton ReserveButton;

    public ReservationSystem() {
    	Reservations = new ArrayList<>();
        
        //FRANE
    	Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Frame.setSize(475, 440);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setLayout(new BorderLayout());;  
		
		//BORDER
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border loweredraisedbevel = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);;
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		TitledBorder acc; acc = BorderFactory.createTitledBorder(loweredetched, "RESERVE"); 
		acc.setTitleJustification(TitledBorder.CENTER); 
		acc.setTitleFont(new Font("Arial", Font.BOLD, 20));		
		
		//HEADING 
		HeadingLabel = new JLabel("RESERVATION");
		HeadingLabel.setBorder(loweredraisedbevel);
		HeadingLabel.setFont(new Font("Arial", Font.BOLD, 40));
		HeadingLabel.setForeground(Color.BLACK);
		HeadingLabel.setHorizontalAlignment(JLabel.CENTER);
		HeadingLabel.setVerticalAlignment(JLabel.CENTER);
				
		HeadingPanel = new JPanel();
		HeadingPanel.setBounds(0, 0, 500, 300);
		HeadingPanel.add(HeadingLabel);
				
		//RESERVATION
		DepartureLabel= new JLabel("Departure:");
		DepartureLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		DepartureLabel.setBounds(30, 30, 150, 20);
        DepartureComboBox = new JComboBox<>(new String[]{"Destination", "Alno", "Bahong", "Alapang", "Cruz", "Tomay"});
        DepartureComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        DepartureComboBox.setBounds(220, 30, 150, 25);
        DestinationLabel = new JLabel("Destination:");
        DestinationLabel.setFont(new Font("Arial", Font.PLAIN, 21));
        DestinationLabel.setBounds(30, 70, 150, 20);
        DestinationComboBox = new JComboBox<>(new String[]{"Location", "Alno", "Bahong", "Alapang", "Cruz", "Tomay"});
        DestinationComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        DestinationComboBox.setBounds(220, 70, 150, 25);
        NameLabel = new JLabel("Name:");
        NameLabel.setFont(new Font("Arial", Font.PLAIN, 20));	
        NameLabel.setBounds(30, 110, 150, 25); 
        NameT = new JTextField();
        NameT.setFont(new Font("Arial", Font.PLAIN, 20));	
        NameT.setBounds(220, 110, 150, 25); 
        ReservationsText = new JTextArea();
        ReservationsText.setEditable(false);
        ReservationsText.setBounds(20, 190, 360, 90); 
		ReserveButton = new JButton("Reserve");
		ReserveButton.setBounds(220, 150, 150, 25); 
		ReserveButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            String Departure = (String) DepartureComboBox.getSelectedItem();
	            String Destination = (String) DestinationComboBox.getSelectedItem();
	            String Name = NameT.getText();
	
	            if (!Name.isEmpty()) {
	                Reservation reservation = new Reservation(Departure, Destination, Name);
	                Reservations.add(reservation);
	                updateReservationsTextArea();
	                clearInputFields();
	            } else {
	            	JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.ERROR_MESSAGE);
	            	}
	        	}});
		
		ReservationPanel = new JPanel();
		ReservationPanel.setLayout(null);
		ReservationPanel.setBounds(30, 80, 400, 300);
		ReservationPanel.setBorder(acc);
		ReservationPanel.add(DepartureLabel);
		ReservationPanel.add(DepartureComboBox);
		ReservationPanel.add(DestinationComboBox);
		ReservationPanel.add(DestinationLabel);
		ReservationPanel.add(NameLabel);
		ReservationPanel.add(NameT);
		ReservationPanel.add(ReserveButton);
		ReservationPanel.add(ReservationsText);
		
		//ADD
	    Frame.add(ReservationPanel);	
		Frame.add(HeadingPanel);
		
		//FRAME
		Frame.setVisible(true);
}

    private void updateReservationsTextArea() {
        StringBuilder StringBuilder = new StringBuilder();
        for (Reservation Reservation : Reservations) {
        	StringBuilder.append(" NAME: ")
        			.append(Reservation.GetGuestName())
                    .append("    (FROM: ")
                    .append(Reservation.GetDeparture())
                    .append("  TO: ")
                    .append(Reservation.GetDestination())
                    .append(")\n");
        }
        ReservationsText.setFont(new Font("Arial", Font.PLAIN, 12));
        ReservationsText.setText(StringBuilder.toString());
    }
    

    private void clearInputFields() {
        NameT.setText("");
    }
}

class Reservation {
    private String Departure;
    private String Destination;
    private String Name;

    public Reservation(String Departure, String Destination, String GuestName) {
        this.Departure = Departure;
        this.Destination = Destination;
        this.Name = GuestName;
    }

    public String GetDeparture() {
        return Departure;
    }

    public String GetDestination() {
        return Destination;
    }

    public String GetGuestName() {
        return Name;
    }
}
