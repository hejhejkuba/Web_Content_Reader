import java.io.BufferedReader;
import java.io.FileReader;

public class Local_Json_Reader {
    public Local_Json_Reader() {
        String fileName = "resoruces/example.json";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            br.close();
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}