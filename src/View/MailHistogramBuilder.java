package View;

import Model.Histogram;
import Model.Mail;
import java.util.List;


public class MailHistogramBuilder {
    public static Histogram<String> build (List<Mail> lista){
        Histogram<String> histogram = new Histogram<>();
        for (Mail i: lista){
            histogram.increment(i.getDomain());
        }
        return histogram;
    }
}
