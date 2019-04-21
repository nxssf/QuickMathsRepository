package com.example.quickmaths.Notes;

import java.util.ArrayList;

public class Resources {
    private String name;
    private String topic;
    private String website;


    public Resources(String name, String topic, String website){
        this.name = name;
        this.topic = topic;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public static ArrayList <Resources> getResource(){
        ArrayList<Resources> resource = new ArrayList<>();
        resource.add(new Resources("Addition","Arithmetic","www.google.com.au"));

        return resource;
    }
}
