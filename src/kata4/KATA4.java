package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class KATA4 {

    
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String nameFile = "C:\\Users\\usuario\\Desktop\\emailsfilev1.txt";
        ArrayList<String> read = MailListReader.read(nameFile);
        /*for(String elem : read) {
            System.out.println(elem);
        }*/
        
        Histogram <String> histogram = MailHistogramBuilder.build(read);
        
        new HistogramDisplay(histogram).execute();
        
    }

}
