package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.print.Book;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ConfigTester {
    public static void main(String[] args) {
        System.out.println("Welcome to Gson!");

//        serializeConfigSimple();
        deserializeConfigSimple();
    }

    private static void serializeConfigSimple() {
        Plotly plotly = new Plotly(
                "0.0.0.0",
                8051,
                true,
                "KBA- dashboard"
        );

        Gson gson = new Gson();
        String json = gson.toJson(plotly);
    }

    private static void deserializeConfigSimple(){
        String userJson = "{'host':'0.0.0.0','port':8051,'debug':true,'title':'KBA - Dashboard'}";

        Gson gson = new Gson();
        String json = gson.toJson(userJson);
        System.out.println(json);

    }


}


//    private static void deserializeConfigSimple() throws IOException {
////        String userJson = "{'host':'0.0.0.0','port':8051,'debug':true,'title':'KBA - Dashboard'}";
//        Reader reader = Files.newBufferedReader(Paths.get("plotly.json"));
//
//        Book book = gson.fromJson(reader, Book.class);
//
////        Gson gson = new Gson();
////        String json = gson.toJson(userJson);
//        System.out.println(book);
//
//        reader.close();
//
//    } catch (Exception ex) {
//        ex.printStackTrace();
//    }
//}

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
//    class boxes {
//      To be for nested
//    }
}