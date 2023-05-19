package GarageTicketingSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class GarageTicketingSystemActionListeners {
	
//ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS ACTION LISTENERS	

	GarageTicketingSystemInterface Garage = new GarageTicketingSystemInterface();
	
	public GarageTicketingSystemActionListeners() {
		
		
//CALENDAR BUTTON ACTION LISTENER
	Garage.Reserve.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			SwingUtilities.invokeLater(new Runnable() {
		        public void run() {
		            new ReservationSystem();
        		}});
		}});
		
//CALENDAR BUTTON ACTION LISTENER
	Garage.CalendarButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new PHCalendar();  
				}});
		}});
			
//CALCULATOR ACTION LISTENERS
	Garage.Calculator.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new CalcuInterface();
					new CalcuActionListeners();
				}});
		}});	
	
//PROFILE BUTTON
	Garage.ViewProfile.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Profile Profile = new Profile();
		        Profile.Profile();
		}});	
	
//EXIT BUTTON
	Garage.ExitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);	
		}});
	
//RESET BUTTON
	Garage.ResetButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Garage.TaxTextField.setText("");				Garage.TicketTextField.setText("");
			Garage.SubTotalTextField.setText("");			Garage.FromTextField.setText("");
			Garage.TotalTextField.setText("");				Garage.ToTextField.setText("");
			Garage.ClassTextField.setText("");				Garage.DateTextField.setText("");
			Garage.NumberTicketTextField.setText("");		Garage.TimeTextField.setText("");
			Garage.TicketNoField.setText("");				Garage.RouteTextField.setText("");
			Garage.PriceTextField.setText("");				Garage.SingleTicketLabel.setSelected(false);
			Garage.ReturnTicketLabel.setSelected(false);	Garage.FirstClassLabel.setSelected(false);
			Garage.EconomyLabel.setSelected(false);			Garage.StandardLabel.setSelected(false);
			Garage.DestinationBox.setSelectedIndex(0);		Garage.NumberTicketsBox.setSelectedIndex(0);
			Garage.DepartureBox.setSelectedIndex(0);		
		}});
		
//GENERATES THE TICKET TYPE ON THE TEXT FIELDS
	Garage.SubmitButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	
	        //EXCEPTIONS
	    	if ((Garage.StandardLabel.isSelected() && Garage.EconomyLabel.isSelected())
	                || (Garage.StandardLabel.isSelected() && Garage.FirstClassLabel.isSelected())
	                || (Garage.EconomyLabel.isSelected() && Garage.FirstClassLabel.isSelected())
	                || (Garage.EconomyLabel.isSelected() && Garage.FirstClassLabel.isSelected() && Garage.StandardLabel.isSelected())
	                || (Garage.SingleTicketLabel.isSelected() && Garage.ReturnTicketLabel.isSelected())
	                || (!Garage.StandardLabel.isSelected() && !Garage.EconomyLabel.isSelected() && !Garage.FirstClassLabel.isSelected()
	                        && Garage.NumberTicketsBox.getSelectedIndex() == 0
	                        && Garage.DepartureBox.getSelectedIndex() == 0
	                        && Garage.DestinationBox.getSelectedIndex() == 0)) {
	            JOptionPane.showMessageDialog(null, "Please select only one option for ticket type, ticket category, number of tickets, departure, and destination.",
	                    "Selection Error", JOptionPane.ERROR_MESSAGE);
	            
	            //CLEAR SELECTION
	            Garage.SingleTicketLabel.setSelected(false);	Garage.DepartureBox.setSelectedIndex(0);
	            Garage.ReturnTicketLabel.setSelected(false);	Garage.FirstClassLabel.setSelected(false);
	            Garage.EconomyLabel.setSelected(false);			Garage.StandardLabel.setSelected(false);
	            Garage.DestinationBox.setSelectedIndex(0);		Garage.NumberTicketsBox.setSelectedIndex(0);
				
	            //CLEAR TEXT FIELD
	            Garage.ClassTextField.setText("");			Garage.TimeTextField.setText("");
	            Garage.NumberTicketTextField.setText("");	Garage.DateTextField.setText("");
	            Garage.TicketTextField.setText("");			Garage.TicketNoField.setText("");
	            Garage.FromTextField.setText("");			Garage.RouteTextField.setText("");
	            Garage.ToTextField.setText("");
	            
	        } else {
	        	
	            //STANDARD OR ECONOMY OR FIRSTCLASS
	            String TicketType = "";
	            if (Garage.StandardLabel.isSelected()) {
	                TicketType = "Standard";
	            } else if (Garage.EconomyLabel.isSelected()) {
	                TicketType = "Economy";
	            } else if (Garage.FirstClassLabel.isSelected()) {
	                TicketType = "First Class";
	            }

	            //RETURN OR SINGLE
	            String TicketCategory = "";
	            if (Garage.SingleTicketLabel.isSelected()) {
	                TicketCategory = "Single Ticket";
	            } else if (Garage.ReturnTicketLabel.isSelected()) {
	                TicketCategory = "Return Ticket";
	            }

	            //TICKETS
	            String NumberOfTickets = (String) Garage.NumberTicketsBox.getSelectedItem();

	            //DEPARTURE AND DESTINATION
	            String Departure = (String) Garage.DepartureBox.getSelectedItem();
	            String Destination = (String) Garage.DestinationBox.getSelectedItem();

	            //TEXTFIELDS
	            Garage.ClassTextField.setText(TicketType);
	            Garage.NumberTicketTextField.setText(NumberOfTickets);
	            Garage.TicketTextField.setText(TicketCategory);
	            Garage.FromTextField.setText(Departure);
	            Garage.ToTextField.setText(Destination);

	            //CURRENT TIME AND DATE
	            Calendar Calc = Calendar.getInstance();
	            SimpleDateFormat TimeFormat = new SimpleDateFormat("hh:mm:ss");
	            String FormattedTime = TimeFormat.format(Calc.getTime());
	            Garage.TimeTextField.setText(FormattedTime);

	            SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy");
	            String FormattedDate = DateFormat.format(Calc.getTime());
	            Garage.DateTextField.setText(FormattedDate);

	            //RANDOM TICKET NUMBER
	            Random Random = new Random();
	            int TicketNo = Random.nextInt(9000) + 1000;
	            Garage.TicketNoField.setText(String.valueOf(TicketNo));

	            //RANDOM ROUTES
	            String[] Routes = {"Route A", "Route B", "Route C", "Route D", "Route E"};
	            int RandomIndex = Random.nextInt(Routes.length);
	            Garage.RouteTextField.setText(Routes[RandomIndex]);
	        }
	    }});
	
//CALCULATION FOR THE TOTAL COST
	Garage.SubmitButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	// DEPARTURE AND DESTINATION AND TICKET TYPE
	        String Departure = (String)Garage.DepartureBox.getSelectedItem();
	        String Destination = (String)Garage.DestinationBox.getSelectedItem();
	        String TicketType = "";
	        String TicketType1 = "";
	        
	        //STANDARD OR ECONOMY OR FIRSTCLASS
	        if (Garage.StandardLabel.isSelected()) {
	            TicketType = "Standard";
	        } else if (Garage.EconomyLabel.isSelected()) {
	            TicketType = "Economy";
	        } else if (Garage.FirstClassLabel.isSelected()) {
	            TicketType = "First Class";
	        } 
	        
	        //STANDARD OR ECONOMY OR FIRSTCLASS
	        if (Garage.SingleTicketLabel.isSelected()) {
	            TicketType1 = "Single Ticket";
	        } else if (Garage.ReturnTicketLabel.isSelected()) {
	            TicketType1 = "Return Ticket";
	        } 
	        
	        //TICKETS
	        int NumberTickets = Garage.NumberTicketsBox.getSelectedIndex();
	        
	        //TOTAL
	        double Amount = CalculateAmount(Departure, Destination, TicketType, TicketType1, NumberTickets);
	        double Tax = Amount * 0.05;
	        double Total = Amount + Tax;
	        
	        //TOTAL FORMAT
	        Garage.TaxTextField.setText(String.format("%.2f", Tax));
	        Garage.SubTotalTextField.setText(String.format("%.2f", Amount));
	        Garage.TotalTextField.setText(String.format("%.2f", Total));
	        Garage.PriceTextField.setText(String.format("%.2f", Total));
	    }});
}
	
//SWITCH STATEMENT TO GENERATE THE PRICES OF DIFFERENT TICKETS WITH DIFFERENT LOCATION
	public double CalculateAmount(String DepartureBox, String DestinationBox, String TicketType, String TicketType1,  int NumberTickets) {
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
	
