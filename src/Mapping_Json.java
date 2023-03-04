import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
public class Mapping_Json {
    public Mapping_Json() {
        String fileName = "resoruces/example.json";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            MyDataObject myDataObject[] = objectMapper.readValue(new File(fileName), MyDataObject[].class);
            for (int i=0; i< myDataObject.length; i++) {
                System.out.println(myDataObject[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyDataObject {
    @JsonProperty("userId")
    private int userId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;

    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "MyDataObject{" +
                "user_id='" + userId + '\'' +
                ", id=" + id + '\'' +
                ", title=" + title + '\'' +
                ", body=" + body +
                '}';
    }
}