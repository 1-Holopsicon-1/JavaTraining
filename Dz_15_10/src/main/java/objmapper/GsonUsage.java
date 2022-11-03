package objmapper;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class GsonUsage {
    String title;
    String body;

    public GsonUsage(String t, String b) throws IOException {
        this.title = t;
        this.body = b;
    }

    public void writeJSON(GsonUsage t, String filename) throws IOException {
        Writer w = new FileWriter(filename);
        Gson gson = new Gson();
        gson.toJson(t, w);
        w.flush();
        w.close();
    }

    public GsonUsage readJSON(String filename) throws FileNotFoundException {
        FileReader fw = new FileReader(filename);
        JsonReader reader = new JsonReader(fw);
        Gson gson = new Gson();
        GsonUsage gu = gson.fromJson(reader, GsonUsage.class);
        return gu;
    }

    @Override
    public String toString() {
        return "GsonUsage{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

