import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.net.URL;

public class Web_Reader_ID {
    public Web_Reader_ID() {
        String urlString = "https://www.javatpoint.com/how-to-get-value-from-json-object-in-java-example";
        String id = "link";
        try {
            URL url = new URL(urlString);
            Document doc = Jsoup.parse(url, 3000);
            Element element = doc.getElementById(id);
            String text = element.text();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}