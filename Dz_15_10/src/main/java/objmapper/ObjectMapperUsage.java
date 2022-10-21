package objmapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperUsage {
    public String title;
    public String body;

    public ObjectMapperUsage (String t, String b){
                this.title = t;
                this.body = b;
    }
    public ObjectMapperUsage(){};

    public void writeJSON(ObjectMapperUsage omu, String filename) throws IOException {
        File f = new File(filename);
        ObjectMapper objM = new ObjectMapper();
        objM.writeValue(f, omu);
    }

    public ObjectMapperUsage readJSON(String filename) throws IOException {
        File f = new File(filename);
        ObjectMapper objM = new ObjectMapper();
        ObjectMapperUsage omu = objM.readValue(f, ObjectMapperUsage.class);
        return omu;
    }

    @Override
    public String toString() {
        return "ObjectMapperUsage{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

