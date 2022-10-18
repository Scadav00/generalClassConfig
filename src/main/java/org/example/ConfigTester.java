package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.print.Book;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ConfigTester {
    public static void main(String[] args) throws Exception {
        String file = "/home/ds/IdeaProjects/GeneralClassConfig/src/main/java/org/example/Plotly.json";
        String jsonConfig = readFileAsString(file);
//        System.out.println(jsonConfig);

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
//        deserialize
        Plotly plotly = gson.fromJson(jsonConfig, Plotly.class);
        System.out.println(plotly);

//        serialize
        jsonConfig = gson.toJson(plotly);
        System.out.println(jsonConfig);


//        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
//
//        Gson gson = builder.create();
//        Student student = gson.fromJson(jsonString, Student.class);
//        System.out.println(student);
//
//        jsonString = gson.toJson(student);
//        System.out.println(jsonString);
//    }

}
    public static String readFileAsString(String file) throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

}

//    Plotly plotly = new Plotly(
//            "0.0.0.0",
//            8051,
//            true,
//            "KBA- dashboard"
//    );

class Plotly {
    private String host;
    private int port;
    private boolean debug;
    private String title;

    public Plotly(){
//        empty constructor
    }

    public Plotly(String host, int port, boolean debug, String title) {
        this.host = host;
        this.port = port;
        this.debug = debug;
        this.title = title;
    }

    public String toString() {
        return "Plotly [ host: "+host+", port: "+ port+ ", debug: "+debug+ ",title: "+title+" ]";
        }

        class Boxes {

        private String name1;

        private String name2;

        private String name3;

        private String name4;

        private Boxes() {}

            public Boxes(String name1, String name2, String name3, String name4) {
                this.name1 = name1;
                this.name2 = name2;
                this.name3 = name3;
                this.name4 = name4;
            }
        }
}