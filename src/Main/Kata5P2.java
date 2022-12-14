package Main;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReaderBD;
import java.util.List;



public class Kata5P2 {
    
   
    private List<Mail> mailList;
    private Histogram<String> histogram;

    public static void main(String[] args) {
        Kata5P2 kata5P2 = new Kata5P2();
        kata5P2.control();
    }
    
    private void control() {
        input();
        process();
        output();
    }
    
    private void input() {
        mailList = new MailListReaderBD().read();
    }
    
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        new HistogramDisplay(histogram).execute();
    }
    
}
