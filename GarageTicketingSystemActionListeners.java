package GarageTicketingSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class GarageTicketingSystemActionListeners {
	GarageTicketingSystemActionListeners ActionListeners = new GarageTicketingSystemActionListeners();
	
	GarageTicketingSystemActionListeners(){
		ActionListeners.submitButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			
			}});
		
	
	   
	}

	private double calculateAmount(String source, String destination, String travelClass) {
	    double baseFare;
	    switch (source) {
	        case "New York":
	            switch (destination) {
	                case "Washington D.C.":
	                    baseFare = 250.0;
	                    break;
	                case "Los Angeles":
	                    baseFare = 750.0;
	                    break;
	                case "Chicago":
	                    baseFare = 550.0;
	                    break;
	                case "San Francisco":
	                    baseFare = 900.0;
	                    break;
	                default:
	                    baseFare = 0.0;
	                    break;
	            }
	            break;
	        case "Washington D.C.":
	            switch (destination) {
	                case "New York":
	                    baseFare = 250.0;
	                    break;
	                case "Los Angeles":
	                    baseFare = 800.0;
	                    break;
	                case "Chicago":
	                    baseFare = 600.0;
	                    break;
	                case "San Francisco":
	                    baseFare = 1000.0;
	                    break;
	                default:
	                    baseFare = 0.0;
	                    break;
	            }
	            break;
	        case "Los Angeles":
	            switch (destination) {
	                case "New York":
	                    baseFare = 750.0;
	                    break;
	                case "Washington D.C.":
	                    baseFare = 800.0;
	                    break;
	                case "Chicago":
	                    baseFare = 400.0;
	                    break;
	                case "San Francisco":
	                    baseFare = 250.0;
	                    break;
	                default:
	                    baseFare = 0.0;
	                    break;
	            }
	            break;
	        case "Chicago":
	            switch (destination) {
	                case "New York":
	                    baseFare = 550.0;
	                    break;
	                case "Washington D.C.":
	                    baseFare = 600.0;
	                    break;
	                case "Los Angeles":
	                    baseFare = 400.0;
	                    break;
	                case "San Francisco":
	                    baseFare = 700.0;
	                    break;
	                default:
	                    baseFare = 0.0;
	                    break;
	            }
	            break;
	        case "San Francisco":
	            switch (destination) {
	                case "New York":
	                    baseFare = 900.0;
	                    break;
	                case "Washington D.C.":
	                    baseFare = 1000.0;
	                    break;
	                case "Los Angeles":
	                	baseFare = 250.0;
	                	break;
	                case "Chicago":
		                baseFare = 700.0;
		                break;
	                default:
		                baseFare = 0.0;
		                break;
	            }
	            break;
	                default:
		                baseFare = 0.0;
		                break;
	                }
	    double classFare;
	    switch (travelClass) {
	        case "Economy":
	            classFare = 1.0;
	            break;
	        case "Business":
	            classFare = 2.0;
	            break;
	        case "First":
	            classFare = 3.0;
	            break;
	        default:
	            classFare = 0.0;
	            break;
	    }

	    return baseFare * classFare;

	}
}
