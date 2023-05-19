package GarageTicketingSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class PHCalendar {
	public YearMonth CurrentYearMonth;
    public JFrame Frame = new JFrame("CALENDAR");
    public JPanel CalendarPanel;
    public JLabel MonthLabel;
    
    //BORDER
	Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	Border loweredraisedbevel = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);;
	
    public PHCalendar() {
    	
    	//FRAME
    	Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	Frame.setSize(700, 400);
    	Frame.setLocationRelativeTo(null);
    	Frame.setLayout(new BorderLayout());
    	
    	//GET CURENT MONTh
        CurrentYearMonth = YearMonth.now();
        
        //CURRENT MONTH LABEL
        MonthLabel = new JLabel(CurrentYearMonth.getMonth().toString() + " " + CurrentYearMonth.getYear());
        MonthLabel.setBorder(loweredraisedbevel);
        MonthLabel.setFont(new Font("Arial", Font.BOLD, 60));
        MonthLabel.setForeground(Color.BLACK);
        MonthLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        //CALL
        CalendarPanel = CreateCalendarPanel();
        Frame.add(CalendarPanel, BorderLayout.CENTER);
        
        //CALL
        JPanel NavigationPanel = CreateNavigationPanel();
        Frame.add(NavigationPanel, BorderLayout.SOUTH);
        
        //FRAME
        Frame.setVisible(true);
    }

    public JPanel CreateCalendarPanel() {
    	//CALENDAR PANEL
        JPanel CalendarPanel = new JPanel(new BorderLayout());
        CalendarPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        CalendarPanel.add(MonthLabel, BorderLayout.NORTH);
        
        //DAYS BUTTON PANEL
        JPanel DaysPanel = new JPanel(new GridLayout(0, 7, 10
        		, 10));
        DaysPanel.setBorder(loweredraisedbevel);
        
        //DAYS
        String[] DaysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String Day : DaysOfWeek) {
            JLabel DayLabel = new JLabel(Day);
            DayLabel.setFont(new Font("Arial", Font.BOLD, 15));
            DayLabel.setHorizontalAlignment(SwingConstants.CENTER);
            DaysPanel.add(DayLabel);
        }

        int FirstDayOfWeek = CurrentYearMonth.atDay(1).getDayOfWeek().getValue();
        int DaysInMonth = CurrentYearMonth.lengthOfMonth();
        
        //FORMAT OF THE DAYS
        for (int i = 1; i < FirstDayOfWeek; i++) {
            DaysPanel.add(new JLabel(""));
        }
        
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("d");
        for (int i = 1; i <= DaysInMonth; i++) {
            JButton DayButton = new JButton(Integer.toString(i));
            DayButton.setFont(new Font("Arial", Font.PLAIN, 16));
            DayButton.setPreferredSize(new Dimension(30, 30));
            DayButton.setBorder(raisedbevel); 
            DayButton.setBackground(Color.WHITE);	
            DayButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton Button = (JButton) e.getSource();
                    String Day = Button.getText();
        			SwingUtilities.invokeLater(new Runnable() {
        		        public void run() {
        		            new ReservationSystem();
        			}});
            }});
            DaysPanel.add(DayButton);
        }

        CalendarPanel.add(DaysPanel, BorderLayout.CENTER);
        return CalendarPanel;
    }

    public JPanel CreateNavigationPanel() {
    	//NAVIGATION PANEL
        JPanel NavigationPanel = new JPanel();
        NavigationPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        
        //PREVIOUS BUTTON AND ACTION LISTENERS
        JButton PreviousButton = new JButton("<");
        PreviousButton.setFont(new Font("Arial", Font.PLAIN, 30));
        PreviousButton.setBackground(Color.LIGHT_GRAY);
        PreviousButton.setBorder(raisedbevel);
        PreviousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CurrentYearMonth = CurrentYearMonth.minusMonths(1);
                UpdateCalendar();
            }});
        
        //NEXT BUTTON AND ACTION LISTENERS
        JButton NextButton = new JButton(">");
        NextButton.setFont(new Font("Arial", Font.PLAIN, 30));
        NextButton.setBackground(Color.LIGHT_GRAY);
        NextButton.setBorder(raisedbevel);
        NextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CurrentYearMonth = CurrentYearMonth.plusMonths(1);
                UpdateCalendar();
            }});

        NavigationPanel.add(PreviousButton);
        NavigationPanel.add(NextButton);
        return NavigationPanel;
    }
    
    //SHOWS UPDATED CALENDAR
    private void UpdateCalendar() {
        MonthLabel.setText(CurrentYearMonth.getMonth().toString() + " " + CurrentYearMonth.getYear());
        CalendarPanel.removeAll();
        CalendarPanel.add(CreateCalendarPanel(), BorderLayout.CENTER);
        CalendarPanel.revalidate();
        CalendarPanel.repaint();
    }
}
