package kata4;

import java.io.File;
import java.util.List;

public class Kata4 {
    public static void main(String[] args) {
        Loader loader = new EmailLoader(new FileLoader(new File("email.txt")));
        Histogram<String> histogram= new Histogram<String>();
        for(String email : loader.load())  histogram.increment(email);
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram Display", histogram) ;
        histogramDisplay.execute();  
    }
}
