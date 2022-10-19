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
        String file = "/home/fo/IdeaProjects/GeneralClassConfig/src/main/java/org/example/Plotly.json";
        String jsonConfig = readFileAsString(file);
        System.out.println(jsonConfig);

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

    private int rollNo;
    private Boxes boxes;
    private String host;
    private int port;
    private boolean debug;
    private String title;






    public Plotly(){
//        empty constructor
    }

    public Plotly(int rollNo, String host, int port, boolean debug, String title) {
        this.rollNo = rollNo;
        this.host = host;
        this.port = port;
        this.debug = debug;
        this.title = title;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString() {
        return "Plotly [ host: "+host+", port: "+ port+ ", debug: "+debug+ ",title: "+title+" ]";
        }

        static class Boxes {

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

            public String getName1() {
                return name1;
            }

            public void setName1(String name1) {
                this.name1 = name1;
            }

            public String getName2() {
                return name2;
            }

            public void setName2(String name2) {
                this.name2 = name2;
            }

            public String getName3() {
                return name3;
            }

            public void setName3(String name3) {
                this.name3 = name3;
            }

            public String getName4() {
                return name4;
            }

            public void setName4(String name4) {
                this.name4 = name4;
            }


            public String toString() {
                return "Boxes [ name1 : "+name1+", name2: "+ name2+ ", name3: "+name3+ ",name4: "+name4+" ]";
            }

        }
}