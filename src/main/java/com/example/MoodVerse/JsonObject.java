package com.example.MoodVerse;

import java.util.ArrayList;

public class JsonObject {

    private int id;
    private ArrayList<YouTubeResults> results;

    public JsonObject() {
    }

    public JsonObject(int id, ArrayList<YouTubeResults> results) {
        this.id = id;
        this.results = results;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<YouTubeResults> getResults() {
        return results;
    }

    public void setResults(ArrayList<YouTubeResults> results) {
        this.results = results;
    }
}
