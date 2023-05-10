package GarageTicketingSystem;

import javax.swing.*;
import java.awt.*;


public class GarageTicketingSystemInterface{
    public JFrame frame;
    public JLabel heading, name, source, destination, date, classLabel, amount;
    public JTextField nameField, dateField, amountField;
    public JComboBox sourceCombo, destCombo, classCombo;
    public JButton submitButton, resetButton;
    public String[] sources = {"New York", "Washington D.C.", "Los Angeles", "Chicago", "San Francisco"};
    public String[] destinations = {"New York", "Washington D.C.", "Los Angeles", "Chicago", "San Francisco"};
    public String[] classes = {"Economy", "Business", "First Class"};

    GarageTicketingSystemInterface() {
        frame = new JFrame("Travel Ticketing System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout());

        heading = new JLabel("Book Your Ticket");
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        heading.setForeground(Color.WHITE);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setVerticalAlignment(JLabel.CENTER);
        frame.add(heading, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(null);
        inputPanel.setBounds(50, 100, 700, 400);
        inputPanel.setBackground(Color.BLACK);

        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        name.setBounds(50, 20, 100, 20);
        inputPanel.add(name);

        nameField = new JTextField();
        nameField.setBounds(200, 20, 200, 25);
        inputPanel.add(nameField);

        source = new JLabel("Source:");
        source.setFont(new Font("Arial", Font.PLAIN, 20));
        source.setForeground(Color.WHITE);
        source.setBounds(50, 70, 100, 20);
        inputPanel.add(source);

        sourceCombo = new JComboBox(sources);
        sourceCombo.setBounds(200, 70, 200, 25);
        inputPanel.add(sourceCombo);

        destination = new JLabel("Destination:");
        destination.setFont(new Font("Arial", Font.PLAIN, 20));
        destination.setForeground(Color.WHITE);
        destination.setBounds(50, 120, 150, 20);
        inputPanel.add(destination);

        destCombo = new JComboBox(destinations);
        destCombo.setBounds(200, 120, 200, 25);
        inputPanel.add(destCombo);

        date = new JLabel("Date of Travel:");
        date.setFont(new Font("Arial", Font.PLAIN, 20));
        date.setForeground(Color.WHITE);
        date.setBounds(50, 170, 150, 20);
        inputPanel.add(date);

        dateField = new JTextField();
        dateField.setBounds(200, 170, 200, 25);
        inputPanel.add(dateField);

        classLabel = new JLabel("Class:");
        classLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        classLabel.setForeground(Color.WHITE);
        classLabel.setBounds(50, 220, 150, 20);
        inputPanel.add(classLabel);

        classCombo = new JComboBox(classes);
        classCombo.setBounds(200, 220, 200, 25);
        inputPanel.add(classCombo);

        amount = new JLabel("Amount:");
        amount.setFont(new Font("Arial", Font.PLAIN, 20));
        amount.setForeground(Color.WHITE);
        amount.setBounds(50, 270, 150, 20);
        
        amountField = new JTextField();
        amountField.setBounds(200, 270, 200, 25);
        amountField.setEditable(false);
        frame.add(amountField);
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(50, 320, 150, 30);
       
        submitButton.setBackground(Color.WHITE);
        submitButton.setForeground(Color.BLACK);
        submitButton.setFocusPainted(false);
        frame.add(submitButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(250, 320, 150, 30);
        
        resetButton.setBackground(Color.WHITE);
        resetButton.setForeground(Color.BLACK);
        resetButton.setFocusPainted(false);
        frame.add(resetButton);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        panel.add(heading);
        panel.add(name);
        panel.add(nameField);
        panel.add(source);
        panel.add(sourceCombo);
        panel.add(destination);
        panel.add(destCombo);
        panel.add(date);
        panel.add(dateField);
        panel.add(classLabel);
        panel.add(classCombo);
        panel.add(amount);
        panel.add(amountField);
        panel.add(submitButton);
        panel.add(resetButton);
        frame.add(panel);

        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


		    }



	
	   
}

		
	
