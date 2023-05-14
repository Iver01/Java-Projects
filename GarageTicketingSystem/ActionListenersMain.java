package GarageTicketingSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class ActionListenersMain {
	GarageTicketingSystemInterface Action = new GarageTicketingSystemInterface();
	ActionListenersMain(){
//EXIT BUTTON
	Action.ExitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);	
		}});
	
//RESET BUTTON
	Action.ResetButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Action.TaxTextField.setText("");			Action.TicketTextField.setText("");
			Action.SubTotalTextField.setText("");		Action.FromTextField.setText("");
			Action.TotalTextField.setText("");			Action.ToTextField.setText("");
			Action.ClassTextField.setText("");			Action.DateTextField.setText("");
			Action.NumberTicketTextField.setText("");	Action.TimeTextField.setText("");
			Action.TicketNoField.setText("");			Action.RouteTextField.setText("");
			Action.PriceTextField.setText("");		
		}});
		
//GENERATES THE TICKET TYPE
	Action.SubmitButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	
	        //STANDARD OR ECONOMY OR FIRSTCLASS
	        String TicketType = "";
		        if (Action.StandardLabel.isSelected()) {
		            TicketType = "Standard";
		        } 
		        else if (Action.EconomyLabel.isSelected()) {
		            TicketType = "Economy";
		        } 
		        else if (Action.FirstClassLabel.isSelected()) {
		            TicketType = "First Class";
		        }
	        
	        //RETURN OR SINGLE
	        String TicketCategory = "";
		        if (Action.SingleTicketLabel.isSelected()) {
		            TicketCategory = "Single Ticket";
		        } 
		        else if (Action.ReturnTicketLabel.isSelected()) {
		            TicketCategory = "Return Ticket";
		        }
	       
	        //TICKETS
	        String NumberOfTickets = (String) Action.NumberTicketsBox.getSelectedItem();
	        
	        //DEPARTURE AND DESTINATION
	        String Departure = (String) Action.DepartureBox.getSelectedItem();
	        String Destination = (String) Action.DestinationBox.getSelectedItem();

	        //TEXTFIELDS
	        Action.ClassTextField.setText(TicketType);
	        Action.NumberTicketTextField.setText(NumberOfTickets);
	        Action.TicketTextField.setText(TicketCategory);
	        Action.FromTextField.setText(Departure);
	        Action.ToTextField.setText(Destination); 
	    	}
		});

//GENERATES THE CURRENT TIME AND DATE
	Action.SubmitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    //TIME
		    Calendar Cal = Calendar.getInstance();
		    SimpleDateFormat TimeFormat = new SimpleDateFormat("hh:mm:ss");
		    String FormattedTime = TimeFormat.format(Cal.getTime());
		    Action.TimeTextField.setText(FormattedTime);

		    //DATE
		    SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy");
		    String FormattedDate = DateFormat.format(Cal.getTime());
		    Action.DateTextField.setText(FormattedDate);
		}});
	
//GENRATE RANDOM TICKET NO
	Action.SubmitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Random Random = new Random();
			int TicketNo = Random.nextInt(9000) + 1000;
			Action.TicketNoField.setText(String.valueOf(TicketNo));
		}});
//GENRATE RANDOM ROUTE
	Action.SubmitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String[] Routes = {"Route A", "Route B", "Route C", "Route D", "Route E"};
			Random Random = new Random();
			Action.RouteTextField.setText(Routes[Random.nextInt(Routes.length)]);
		}});
	
//CALCULATION FOR THE TOTAL COST
	Action.SubmitButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	// DEPARTURE AND DESTINATION AND TICKET TYPE
	        String DepartureBox = (String)Action.DepartureBox.getSelectedItem();
	        String DestinationBox = (String)Action.DestinationBox.getSelectedItem();
	        String TicketType = "";
	        
	        //STANDARD OR ECONOMY OR FIRSTCLASS
	        if (Action.StandardLabel.isSelected()) {
	            TicketType = "Standard";
	        } 
	        else if (Action.EconomyLabel.isSelected()) {
	            TicketType = "Economy";
	        } 
	        else if (Action.FirstClassLabel.isSelected()) {
	            TicketType = "First Class";
	        }
	        
	        //TICKETS
	        int NumberTickets = Action.NumberTicketsBox.getSelectedIndex();
	        
	        //TOTAL
	        double Amount = CalculateAmount(DepartureBox, DestinationBox, TicketType, NumberTickets);
	        double Tax = Amount * 0.05;
	        double Total = Amount + Tax;
	        
	        //TOTAL FORMAT
	        Action.TaxTextField.setText(String.format("%.2f", Tax));
	        Action.SubTotalTextField.setText(String.format("%.2f", Amount));
	        Action.TotalTextField.setText(String.format("%.2f", Total));
	        Action.PriceTextField.setText(String.format("%.2f", Total));
	    }});
}
//SWITCH STATEMENT TO GENERATE THE PRICES OF DIFFERENT TICKETS WITH DIFFERENT LOCATION
	private double CalculateAmount(String DepartureBox, String DestinationBox, String TicketType, int NumberTickets) {
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
	    
	    amount *= NumberTickets;
	    return amount;
	}
	}	

