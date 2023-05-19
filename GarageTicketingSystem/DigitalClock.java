package GarageTicketingSystem;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DigitalClock implements Runnable {
    private JButton Clock;
    private String TimeString = "";

    DigitalClock(JButton clock) {
        Clock = clock;
    }

    public void run() {
        try {
            while (true) {
                Calendar Cal = Calendar.getInstance();
                int Hours = Cal.get(Calendar.HOUR_OF_DAY);

                if (Hours > 12)
                    Hours = Hours - 12;
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date Date = Cal.getTime();
                TimeString = formatter.format(Date);

                printTime();

                Thread.sleep(1000); // interval given in milliseconds
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printTime() {
        Clock.setText(TimeString);
    }
}
