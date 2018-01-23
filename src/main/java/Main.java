import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class Main {
    public static void main(String[] args) {
        //File arg1 = new File(args[0]);
        //System.out.println(arg1.getAbsolutePath());
        //System.out.println(arg1.getName());
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() throws IOException {
        String json = "{\"name\": \"John\"}";
        ObjectMapper om = new ObjectMapper();
        Person testObj = om.readValue(json, Person.class);
        System.out.print(testObj);
    }
}

