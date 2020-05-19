import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class DataReader {
    public static String[][] read(String filename) {
        String COMMA_DELIMITER = ";";
        int n,m;
        List<String[]> dataset = new LinkedList<String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                dataset.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        n = dataset.get(0).length;
        m = dataset.size();

        return dataset.toArray(new String[m][n]);
    }
}
