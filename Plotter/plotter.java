import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class plotter{
    ArrayList<Double> result = new ArrayList<>();
    public void sinePlotter(int s, double e) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter("SinePlot.csv");
        for(int i = s; i <= e; i++){
            double sineresults = Math.sin(i);
            result.add(sineresults);
        }
        for (double num : result){
            writer.println(num);
        }
        writer.close();
    }
}